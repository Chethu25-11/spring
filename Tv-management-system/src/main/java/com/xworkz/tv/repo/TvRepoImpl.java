package com.xworkz.tv.repo;

import com.xworkz.tv.entity.TvEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class TvRepoImpl implements TvRepo {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("tv");
    @Override
    public TvEntity saveTvInfo(TvEntity entity) {
        System.out.println("invoking saveTvInfo method in the Repository ");
        TvEntity save=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em=emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
            return entity;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (em!=null){
                em.close();
            }
        }

        return save;
    }
}
