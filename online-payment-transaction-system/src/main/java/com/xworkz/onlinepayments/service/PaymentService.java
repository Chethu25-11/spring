package com.xworkz.onlinepayments.service;
import com.xworkz.onlinepayments.entity.UserEntity;

import java.util.List;

public interface PaymentService {
    UserEntity validateAndSavePaymentInfo(UserEntity entity);
    List<UserEntity> validateAndFindAllUserEntity();
    boolean validateAndDeleteById(int id);
    UserEntity validateAndFindById(int id);


   // String validateUpdateAllDeatilsById(long phoneNumber);
}
