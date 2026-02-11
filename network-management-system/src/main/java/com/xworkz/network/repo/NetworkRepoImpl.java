package com.xworkz.network.repo;

import com.xworkz.network.dto.NetworkDto;
import com.xworkz.network.entity.NetworkEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class NetworkRepoImpl implements NetworkRepo{
    static EntityManagerFactory emf=Persistence.createEntityManagerFactory("network");
    @Override
    public NetworkEntity saveNetworkInfo(NetworkDto dto) {
        System.out.println("inovoking saveNetworkInfo in repo ");
        NetworkEntity save=null;
        EntityManager em=null;
        EntityTransaction et=null;
        try {
            em=emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            em.persist(dto);
            et.commit();
            return save;
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
