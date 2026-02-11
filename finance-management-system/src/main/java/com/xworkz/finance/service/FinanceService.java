package com.xworkz.finance.service;

import com.xworkz.finance.entity.FinanceEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FinanceService {
    FinanceEntity validateSaveAndFinanceInfo(FinanceEntity entity);
    List<FinanceEntity> validateAndFindAllFinanceEntity();

}
