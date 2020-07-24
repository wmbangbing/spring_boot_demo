package com.km.fkSpring.contract.user;

import java.util.List;

public interface IUserService {
    UserDescriptor findByUserName(String UserName) throws Throwable;

    List<UserDescriptor> list() throws Throwable;

    boolean save(UserDescriptor desc)  throws Throwable;
}
