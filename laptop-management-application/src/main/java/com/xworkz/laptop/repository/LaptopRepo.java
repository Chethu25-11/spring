package com.xworkz.laptop.repository;

import com.xworkz.laptop.entity.LaptopEntity;

import java.util.List;

public interface LaptopRepo {
    LaptopEntity saveLaptopInfo(LaptopEntity entity);
    List<LaptopEntity> findAll();
    Boolean deleteById(int id);

}
