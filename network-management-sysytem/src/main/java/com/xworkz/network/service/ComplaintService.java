package com.xworkz.network.service;

import com.xworkz.network.entity.UserInfoEntity;

import java.util.List;

public interface ComplaintService {

    UserInfoEntity validateAndSaveUserInfo(UserInfoEntity entity);
    List<UserInfoEntity>  validateAndFindAllUserInfoEntity();
    Boolean validateAndDeleteById(int id);
    UserInfoEntity validateAndFindById(int id);

}
