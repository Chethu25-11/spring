package com.xworkz.travel.service;

import com.xworkz.travel.entity.TravelEntity;

import java.util.List;

public interface TravelService {
    TravelEntity validateAndSaveTravelInfo(TravelEntity entity);
    List<TravelEntity> validateAndFindNameAndKm(String name, Double km);

}
