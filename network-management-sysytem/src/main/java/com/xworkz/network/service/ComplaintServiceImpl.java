package com.xworkz.network.service;

import com.xworkz.network.entity.UserInfoEntity;

import com.xworkz.network.repository.ComplaintRepository;
import com.xworkz.network.repository.ComplaintRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ComplaintServiceImpl implements ComplaintService {

    ComplaintRepository repository = new ComplaintRepositoryImpl();

    @Override
    public UserInfoEntity validateAndSaveUserInfo(UserInfoEntity entity) {
        System.out.println("Invoking validation");
        UserInfoEntity isUserValid = null;


        if (entity != null) {
            isUserValid = repository.saveUserInfo(entity);
        } else {
            isUserValid = null;
        }
        return isUserValid;
    }

    @Override
    public List<UserInfoEntity> validateAndFindAllUserInfoEntity() {
        System.out.println("invoking validateAndFindAllUserInfoEntity in service ");

        List<UserInfoEntity> list = repository.findAllUserInfoEntity();
        if (list != null && !list.isEmpty()) {
            System.out.println("is validate " + list.size());
        }
        return list;
    }

    @Override
    public Boolean validateAndDeleteById(int id) {
        System.out.println("invoking validateAndDeleteById in  service ");
        Boolean isValidDelete=null;
        if (id > 0) {
         isValidDelete = repository.deleteById(id);
        } else {
            isValidDelete = false;
        }

        return isValidDelete;
    }

    @Override
    public UserInfoEntity validateAndFindById(int id) {
        System.out.println("invoking method in service");
        UserInfoEntity entity=null;
        if (id>0){
            entity=  repository.findById(id);
        }
        return entity;
    }
}
