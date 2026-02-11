package com.xworkz.finance.repository;

import com.xworkz.finance.entity.FinanceEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
@Repository
public class FinanceRepositoryImpl implements FinanceRepository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("anything");

    @Override
    public FinanceEntity saveFinanceInfo(FinanceEntity entity) {
        System.out.println("invoking the saveFinanceInfo in repository ");
        FinanceEntity save = null;
      //  final EntityManagerFactory emf = Persistence.createEntityManagerFactory("anything");
        EntityManager em=null;
        EntityTransaction et=null;
        try {
          em = emf.createEntityManager();
          et = em.getTransaction();
          et.begin();
          em.persist(entity);
          et.commit();
          return entity;
        }catch (Exception e){
            e.printStackTrace();
            et.rollback();
        }finally {
            if (em!=null) {
                em.close();
            }
        }
        return save;
    }

    @Override
    public List<FinanceEntity> findAllFinanceEntity() {
        System.out.println("invoking method in repository");
        List<FinanceEntity> find= null;
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findAllFinanceEntity");
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
}
