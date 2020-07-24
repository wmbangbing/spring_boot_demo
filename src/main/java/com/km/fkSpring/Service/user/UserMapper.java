package com.km.fkSpring.Service.user;

import com.km.fkSpring.contract.user.UserDescriptor;
import com.km.fkSpring.dao.user.UserEntity;
import com.km.fkSpring.Service.config.CatalogMapper;

public interface UserMapper extends CatalogMapper<UserDescriptor, UserEntity> {
}
