package com.xworkz.banking.service;

import com.xworkz.banking.entity.BankEntity;

import java.util.List;

public interface BankService {
    BankEntity validateAndSaveBankInfo(BankEntity entity);
    List<BankEntity>  validateAndFindAllBankEntity();
    Boolean validateAndDeleteByCustomerId(int id);
}
