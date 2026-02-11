package com.xworkz.network.service;

import com.xworkz.network.dto.NetworkDto;
import com.xworkz.network.entity.NetworkEntity;
import org.springframework.stereotype.Service;

@Service
public interface NetworkService {
    NetworkEntity validateAndSave(NetworkDto dto);

}
