package com.xworkz.travel.service;

import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.repository.TravelRepository;
import com.xworkz.travel.repository.TravelRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class TravelServiceImpl implements TravelService{
    TravelRepository repository=new TravelRepositoryImpl();
    @Override
    public TravelEntity validateAndSaveTravelInfo(TravelEntity entity) {
        System.out.println("invoking validateAndSaveTravelInfo method in Service");
        TravelEntity isSave=null;
//        TravelEntity  entity1= repository.saveTravelInfo(entity);
        if (entity!=null){
            isSave= repository.saveTravelInfo(entity);
            return  isSave;
        }
        return isSave;
    }

    @Override
    public List<TravelEntity> validateAndFindNameAndKm(String name, Double km) {
        System.out.println("validating name and km from service");
        List<TravelEntity> isValid = null;

        if (name!=null && !name.isEmpty() && km!=null && !km.isNaN()) {
            isValid = repository.findNameAndKm(name, km);
        } else {
            System.out.println("Error: name or km Incorrect ");
        }
        return isValid;
    }
}
