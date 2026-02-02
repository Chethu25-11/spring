package com.xworkz.laptop.service;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopService {
    LaptopEntity validateAndSaveLaptopInfo(LaptopEntity entity);
}
