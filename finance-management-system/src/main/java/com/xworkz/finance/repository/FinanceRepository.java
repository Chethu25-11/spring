package com.xworkz.finance.repository;

import com.xworkz.finance.entity.FinanceEntity;

import java.util.List;

public interface FinanceRepository {
    FinanceEntity saveFinanceInfo(FinanceEntity entity);
     List<FinanceEntity> findAllFinanceEntity();

}
