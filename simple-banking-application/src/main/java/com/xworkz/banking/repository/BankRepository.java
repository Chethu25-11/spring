package com.xworkz.banking.repository;

import com.xworkz.banking.entity.BankEntity;

import java.util.List;

public interface BankRepository {
BankEntity saveBankInfo(BankEntity entity);
   List<BankEntity> findAllBankEntity();
   Boolean deleteByCustomerId(int id);
   BankEntity findById(int id);
}
