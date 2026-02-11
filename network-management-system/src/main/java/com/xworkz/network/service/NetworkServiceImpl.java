package com.xworkz.network.service;

import com.xworkz.network.dto.NetworkDto;
import com.xworkz.network.entity.NetworkEntity;
import com.xworkz.network.repo.NetworkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkServiceImpl implements NetworkService{
    @Autowired
    private NetworkRepo repo;
    @Override
    public NetworkEntity validateAndSave( NetworkDto dto) {
        System.out.println("inside validateAndSave in TicketService ");

        NetworkEntity entity = new NetworkEntity();
        entity.setNetworkTypeName(dto.getNetworkTypeName());
        entity.setEmail(dto.getEmail());
        entity.setStatus(dto.getStatus());
        entity.setPassword(dto.getPassword());
        repo.saveNetworkInfo(dto);
        return entity;
    }
}
