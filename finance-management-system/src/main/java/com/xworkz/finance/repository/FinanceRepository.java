package com.xworkz.finance.repository;

import com.xworkz.finance.entity.FinanceEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FinanceRepository {
    FinanceEntity saveFinanceInfo(FinanceEntity entity);
     List<FinanceEntity> findAllFinanceEntity();

}
