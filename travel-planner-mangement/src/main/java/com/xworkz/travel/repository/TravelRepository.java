package com.xworkz.travel.repository;

import com.xworkz.travel.entity.TravelEntity;

import java.util.List;

public interface TravelRepository {
    TravelEntity saveTravelInfo(TravelEntity entity);
    List<TravelEntity> findNameAndKm(String name, double km);

}
