package com.xworkz.travel.repository;

import com.xworkz.travel.entity.TravelEntity;

import javax.persistence.*;
import java.util.List;

public class TravelRepositoryImpl implements TravelRepository{
    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("something");
    @Override
    public TravelEntity saveTravelInfo(TravelEntity entity) {
        System.out.println("invoking saveTravelInfo in repository");
        TravelEntity save=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em=this.emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
           save= em.merge(entity);

        }catch (Exception e){
            e.printStackTrace();
            et.rollback();
        }finally {
            if (em!=null){
                em.close();
            }
        }
        return save;
    }

    @Override
    public List<TravelEntity> findNameAndKm(String name, double km) {
        System.out.println("Invoking name and km from repository");
        List<TravelEntity> fetch = null;

        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            Query query = em.createNamedQuery("findNameAndKm");
            query.setParameter("name", name);
            query.setParameter("km",km);
            fetch = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em!=null) {
                em.close();
            }
        }
        return fetch;
    }


}
