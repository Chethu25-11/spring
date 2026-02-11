package com.xworkz.network.repo;

import com.xworkz.network.dto.NetworkDto;
import com.xworkz.network.entity.NetworkEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface NetworkRepo {
    NetworkEntity saveNetworkInfo(NetworkDto dto);

}
