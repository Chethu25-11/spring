package com.xworkz.network.repository;

import com.xworkz.network.entity.UserInfoEntity;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class ComplaintRepositoryImpl implements ComplaintRepository{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("anything");
    @Override
    public UserInfoEntity saveUserInfo(UserInfoEntity entity) {
        System.out.println("Invoking saveUserInfo Method from Repository");
        UserInfoEntity user = null;

        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("anything");

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            user = em.merge(entity);
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return user;
    }

    @Override
    public List<UserInfoEntity> findAllUserInfoEntity() {
        System.out.println("invoking findAllUserInfoEntity in repository ");
        List<UserInfoEntity> infoEntities = null;
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = (Query) em.createNamedQuery("findAllUserInfoEntity");
             infoEntities  = ((javax.persistence.Query) query).getResultList();
            System.out.println("findAllUserInfoEntity"+infoEntities);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return infoEntities;
    }

    @Override
    public Boolean deleteById(int id) {
        System.out.println("invoking method in repository");
        Boolean isDeleted=false;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
        em=emf.createEntityManager();
        et=em.getTransaction();
        et.begin();
        UserInfoEntity entity=em.find(UserInfoEntity.class , id);
        em.remove(entity);
            isDeleted = true;
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
    public UserInfoEntity findById(int id) {
        System.out.println("invoking method in repository");
        UserInfoEntity entity=null;
        EntityManager em=null;
        try {
            entity=this.emf.createEntityManager().find(UserInfoEntity.class, id);
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
