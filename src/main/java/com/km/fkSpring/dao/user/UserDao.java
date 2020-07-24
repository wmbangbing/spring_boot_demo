package com.km.fkSpring.dao.user;

import com.km.fkSpring.dao.config.BaseDao;

public interface UserDao extends BaseDao<UserEntity> {
    UserEntity findById(String Id);

    UserEntity findByUserName(String userName);
}