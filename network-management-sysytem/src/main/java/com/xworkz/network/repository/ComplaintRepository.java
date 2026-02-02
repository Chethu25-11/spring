package com.xworkz.network.repository;

import com.xworkz.network.entity.UserInfoEntity;

import java.util.List;

public interface ComplaintRepository {
    UserInfoEntity saveUserInfo(UserInfoEntity entity);
    List<UserInfoEntity> findAllUserInfoEntity();
    Boolean deleteById(int id);
    UserInfoEntity findById(int id);

}
