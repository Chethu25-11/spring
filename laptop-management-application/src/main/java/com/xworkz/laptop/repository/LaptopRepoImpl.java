package com.xworkz.laptop.repository;

import com.xworkz.laptop.entity.LaptopEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class LaptopRepoImpl implements LaptopRepo {
    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("some");
    @Override
    public LaptopEntity saveLaptopInfo(LaptopEntity entity) {
        System.out.println("repository");
        LaptopEntity save=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
           em= this.emf.createEntityManager();
           et=em.getTransaction();
           et.begin();
           em.persist(entity);
           et.commit();
           save=entity;
           return save;
        }catch (Exception e){
            e.printStackTrace();
            et.rollback();
        }
        return save;
    }

    @Override
    public List<LaptopEntity> findAll() {
        System.out.println("repository");
        List<LaptopEntity> list= null;
        EntityManager em=null;
        try {
            em=this.emf.createEntityManager();
            Query query=  em.createNamedQuery("findAllLaptopEntity");
           list= query.getResultList();
            System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return list;
    }

    @Override
    public Boolean deleteById(int id) {
        Boolean delete=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em= (EntityManager) this.emf.createEntityManager();
           et= em.getTransaction();
           et.begin();
           LaptopEntity entity= em.find(LaptopEntity.class, id);
           em.remove(entity);
           et.commit();
           delete=true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return null;
    }
}
