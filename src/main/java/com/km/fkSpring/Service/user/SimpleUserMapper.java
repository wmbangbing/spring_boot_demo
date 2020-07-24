package com.km.fkSpring.Service.user;

import com.km.fkSpring.contract.user.UserDescriptor;
import com.km.fkSpring.dao.user.UserEntity;
import com.km.fkSpring.Service.config.SimpleCatalogMapper;

import org.springframework.stereotype.Component;

@Component
public class SimpleUserMapper extends SimpleCatalogMapper<UserDescriptor, UserEntity> implements UserMapper {
    @Override
    protected UserDescriptor _eTot(UserEntity entity, boolean lazy) throws Throwable {
        UserDescriptor desc = new UserDescriptor();
        desc.setId(entity.getId());
        desc.setUserId(entity.getUserId());
        desc.setUserName(entity.getUserName());
        desc.setPassWord(entity.getPassWord());
        desc.setRole(entity.getRole());
        desc.setCreateTime(entity.getCreateTime());
        desc.setUpdateTime(entity.getUpdateTime());
        return desc;
    }

    @Override
    protected UserEntity _tToe(UserDescriptor desc) throws Throwable {
        UserEntity entity = new UserEntity();
        entity.setId(desc.getId());
        entity.setUserId(desc.getUserId());
        entity.setUserName(desc.getUserName());
        entity.setPassWord(desc.getPassWord());
        entity.setRole(desc.getRole());
        entity.setCreateTime(desc.getCreateTime());
        entity.setUpdateTime(desc.getUpdateTime());
        return entity;
    }


}
