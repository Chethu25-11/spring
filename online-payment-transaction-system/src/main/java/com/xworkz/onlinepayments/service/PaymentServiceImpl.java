package com.xworkz.onlinepayments.service;

import com.xworkz.onlinepayments.entity.UserEntity;
import com.xworkz.onlinepayments.repository.PaymentRepository;
import com.xworkz.onlinepayments.repository.PaymentRepositoryImpl;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    PaymentRepository repository = new PaymentRepositoryImpl();

    @Override
    public UserEntity validateAndSavePaymentInfo(UserEntity entity) {
        System.out.println("Invoking validation in repository");
        UserEntity isValid = null;

        if (entity!=null) {
            isValid = repository.savePaymentInfo(entity);
        } else {
            isValid = null;
        }

        return isValid;
    }

    @Override
    public List<UserEntity> validateAndFindAllUserEntity() {
        System.out.println("invoking the validateAndFindAllUserEntity in service");
        List<UserEntity> list =repository.findAllUserEntity();
        if (list != null && !list.isEmpty()) {
            System.out.println("is validate " + list.size());
        }
        return list;
    }

    @Override
    public boolean validateAndDeleteById(int id) {
        System.out.println("Invoking validation");
        boolean validDelete = false;
        if (id > 0) {
            validDelete = repository.deleteById(id);
        } else {
            validDelete = false;
        }
        return validDelete;
    }

    @Override
    public UserEntity validateAndFindById(int id) {
        System.out.println("invoking method in service");
        UserEntity entity=null;
        if (id>0){
          entity=  repository.findById(id);
        }
        return entity;
    }


//    @Override
//    public String validateUpdateAllDeatilsById(UserEntity entity) {
//        System.out.println("invoking method in service");
//        String isValid = null;
//        if (entity != null) {
//            isValid = repository.updateAllDeatilsById(entity);
//        }else {
//                System.out.println("Validation failed");
//            }
//        return isValid;
//   }
}

