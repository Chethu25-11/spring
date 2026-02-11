package com.xworkz.tv.service;

import com.xworkz.tv.dto.TvDto;
import com.xworkz.tv.entity.TvEntity;
import com.xworkz.tv.repo.TvRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TvService {
    @Autowired
    private TvRepo repo;
    public TvEntity validateAndSave(TvDto dto) {
        System.out.println("inside validateAndSave in TicketService ");
        TvEntity entity = new TvEntity();
        entity.setTvName(dto.getTvName());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setPassword(dto.getPassword());
        entity.setPrice(dto.getPrice());
        repo.saveTvInfo(entity);
        return entity;
    }
}
