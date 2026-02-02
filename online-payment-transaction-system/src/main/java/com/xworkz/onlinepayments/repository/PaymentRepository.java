package com.xworkz.onlinepayments.repository;

import com.xworkz.onlinepayments.entity.UserEntity;

import java.util.List;

public interface PaymentRepository {
    UserEntity savePaymentInfo(UserEntity entity);
   List<UserEntity> findAllUserEntity();
   // String updateAllDetailsById(UserEntity entity);
   boolean deleteById(int Id);
   UserEntity findById(int id);
   UserEntity updateById(UserEntity entity);

}
