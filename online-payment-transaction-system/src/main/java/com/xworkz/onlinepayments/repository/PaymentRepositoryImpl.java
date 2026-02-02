package com.xworkz.onlinepayments.repository;

import com.xworkz.onlinepayments.entity.UserEntity;


import javax.persistence.*;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("online-payments");

    @Override
    public UserEntity savePaymentInfo(UserEntity entity) {
        System.out.println("Invoking savePaymentInfo()");
        UserEntity save = null;


        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
//            save = em.merge(entity);
//            em.persist(entity);
            save = entity;
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
    public List<UserEntity> findAllUserEntity() {
        System.out.println("Invoking findAllUserEntity in repository ");
        List<UserEntity> userEntities = null;
        EntityManager em =null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findAllUserEntity");
            userEntities=query.getResultList();
            System.out.println("findAllUserEntity"+ userEntities);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
            return userEntities;
        }

    @Override
    public boolean deleteById(int Id) {
        System.out.println("invoking the deleteById in repository ");
        boolean isdelete = false;

        EntityManager em = null;
        EntityTransaction et = null;
        try {
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            UserEntity entity = em.find(UserEntity.class, Id);
            em.remove(entity);
            et.commit();
            isdelete = true;
        } catch (Exception e) {
            e.printStackTrace();
            et.rollback();
        } finally {
            if (em != null) {
                em.close();
            }
            return isdelete;
        }
    }

    @Override
    public UserEntity findById(int id) {
        System.out.println("invoking method in repository");
        UserEntity entity = null;
        EntityManager em=null;
        try {
            entity=this.emf.createEntityManager().find(UserEntity.class, id);
        }catch (Exception e){
         e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return entity;
    }

    @Override
    public UserEntity updateById(UserEntity entity) {
        System.out.println("invoking method in repository");
        UserEntity update=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em=this.emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            UserEntity userEntity  = em.find(UserEntity.class,entity.getId());

            if (entity != null) {
                userEntity.setEmailId(entity.getEmailId());
                userEntity.setPassword(entity.getPassword());
                userEntity.setPhoneNumber(entity.getPhoneNumber());
                update = em.merge(userEntity);
                et.commit();
                // return update;
            }
        }catch (Exception e){
            e.printStackTrace();
            et.rollback();
        }finally {
            if (em!=null) {
                em.close();
            }
        }

        return update;
    }


//    @Override
//    public String updateAllDetailsById(UserEntity entity) {
//        System.out.println("invoking updateAllDetailsById in repository ");
//        String isUpdate=null;
//        EntityManager em = null;
//        EntityTransaction et = null;
//        try {
//            em = this.emf.createEntityManager();
//            et = em.getTransaction();
//            et.begin();
//            UserEntity entityUpdate = em.find(UserEntity.class, 2);
//            entityUpdate.setEmailId(entity.getEmailId());
//            entityUpdate.setPhoneNumber(entity.getPhoneNumber());
//            et.commit();
//            isUpdate = "successfully done";
//            System.out.println("OLD: " + entityUpdate.getEmailId());
//            System.out.println("NEW: " + entity.getPhoneNumber());
//        }catch (Exception e){
//            e.printStackTrace();
//            et.rollback();
//        }finally {
//
//        }
//        return "";
//    }
}
