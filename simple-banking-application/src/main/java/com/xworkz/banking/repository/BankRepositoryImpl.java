package com.xworkz.banking.repository;

import com.xworkz.banking.entity.BankEntity;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Collections;
import java.util.List;

public class BankRepositoryImpl implements BankRepository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");

    @Override
    public BankEntity saveBankInfo(BankEntity entity) {
        System.out.println("invoking saveBankInfo in repository");
        BankEntity save = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            return save;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return save;
    }

    @Override
    public List<BankEntity> findAllBankEntity() {
        System.out.println("invoking findAllBankEntity in repository ");
        List<BankEntity> find = null;
        EntityManager em = null;
        try {
             em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findAllBankEntity");
           find =query.getResultList();
            //System.out.println("findAllBankEntity"+find);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return find;
    }

    @Override
    public Boolean deleteByCustomerId(int id) {
        System.out.println("invoking method in repository");
        Boolean isDeleted=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em=emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            BankEntity entity=em.find(BankEntity.class ,id);
            em.remove(entity);
            et.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }

        return isDeleted;
    }

    @Override
    public BankEntity findById(int id) {
        System.out.println( "invoking findById in repository");
        BankEntity entity=null;
        EntityManager em=null;
        try {
            entity = this.emf.createEntityManager().find(BankEntity.class, id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return entity;
    }
}
