package com.xworkz.banking.service;

import com.xworkz.banking.entity.BankEntity;
import com.xworkz.banking.repository.BankRepository;
import com.xworkz.banking.repository.BankRepositoryImpl;

import java.util.List;

public class BankServiceImpl implements BankService {
    BankRepository repository = new BankRepositoryImpl();

    @Override
    public BankEntity validateAndSaveBankInfo(BankEntity entity) {
        System.out.println("invoking  validateAndSaveBankInfo in service");
        BankEntity isValid = null;
        if (entity != null) {
            isValid = repository.saveBankInfo(entity);
        } else {
            isValid = null;
        }
        return isValid;
    }

    @Override
    public List<BankEntity> validateAndFindAllBankEntity() {
        System.out.println("invoking  validateAndFindAllBankEntity in service");

        List<BankEntity> list = repository.findAllBankEntity();
        if (list != null && !list.isEmpty()) {
            System.out.println("is validate " + list.size());
        }
        return list;
    }

    @Override
    public Boolean validateAndDeleteByCustomerId(int id) {
        System.out.println("invoking method in Service");
        Boolean validDelete = false;
        if (id > 0) {
            validDelete = repository.deleteByCustomerId(id);
        } else {
            validDelete = false;
        }
        return validDelete;
    }
}

