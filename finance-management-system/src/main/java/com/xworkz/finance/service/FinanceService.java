package com.xworkz.finance.service;

import com.xworkz.finance.entity.FinanceEntity;

import java.util.List;

public interface FinanceService {
    FinanceEntity validateSaveAndFinanceInfo(FinanceEntity entity);
    List<FinanceEntity> validateAndFindAllFinanceEntity();

}
