package com.xworkz.laptop.service;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.repository.LaptopRepo;
import com.xworkz.laptop.repository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{
    LaptopRepo repository=new LaptopRepoImpl();
    @Override
    public LaptopEntity validateAndSaveLaptopInfo(LaptopEntity entity) {
        System.out.println("service");
        LaptopEntity isSave=null;
        if (entity!=null) {
            repository.saveLaptopInfo(entity);
        }else {
            isSave=entity;
        }
        return isSave;
    }
}
