package com.xworkz.tv.repo;

import com.xworkz.tv.entity.TvEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TvRepo {
    TvEntity saveTvInfo(TvEntity entity);
}
