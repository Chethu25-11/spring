package com.xworkz.ticket.repo;

import com.xworkz.ticket.entity.TicketEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class TicketRepoImpl implements TicketRepo{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticket");
    @Override
    public TicketEntity saveTicketInfo(TicketEntity entity) {
        System.out.println("invoking saveTicketInfo method in the Repository ");
        TicketEntity save=null;
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
