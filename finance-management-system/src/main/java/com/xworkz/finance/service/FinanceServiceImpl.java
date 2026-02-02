package com.xworkz.finance.service;

import com.xworkz.finance.entity.FinanceEntity;
import com.xworkz.finance.repository.FinanceRepository;
import com.xworkz.finance.repository.FinanceRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class FinanceServiceImpl implements FinanceService{
    FinanceRepository repository=new FinanceRepositoryImpl();
    @Override
    public FinanceEntity validateSaveAndFinanceInfo(FinanceEntity entity) {
        System.out.println("invoking the validateSaveAndFinanceInfo in service ");
        FinanceEntity isValid=null;
        if (entity!=null){
        isValid=repository.saveFinanceInfo(entity);
        }else {
            isValid=null;
        }
        return isValid;
    }

    @Override
    public List<FinanceEntity> validateAndFindAllFinanceEntity() {
        System.out.println("invoking method in service");
        List<FinanceEntity> list=  repository.findAllFinanceEntity();
        if (list != null && !list.isEmpty()) {
            System.out.println("is validate " + list.size());
        }
        return list;
    }
}
