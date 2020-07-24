package com.km.fkSpring.Service.user;

import com.km.fkSpring.contract.user.IUserService;
import com.km.fkSpring.contract.user.UserDescriptor;
import com.km.fkSpring.dao.user.UserDao;
import com.km.fkSpring.dao.user.UserEntity;
import org.springframework.stereotype.Service;
import com.km.fkSpring.Service.config.SimpleCatalogService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleUserService extends SimpleCatalogService<UserDescriptor, UserEntity> implements IUserService {
    private final UserMapper mapper;
    private final UserDao dao;

    protected SimpleUserService(UserDao dao,UserMapper mapper){
        super(dao, mapper);
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public UserDescriptor findByUserName(String userName) throws Throwable{
        try {
            UserDescriptor desc;
            desc = this.mapper.eTot(this.dao.findByUserName(userName));
            return desc;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UserDescriptor> list() throws Throwable{
        List<UserDescriptor> descs = new ArrayList<>();
        Iterable<UserEntity> entities = this.dao.findAll();
        for (UserEntity entity: entities) {
            descs.add(this.mapper.eTot(entity));
        }
        return descs;
    }

    @Override
    public boolean save(UserDescriptor desc) throws Throwable{
        this.dao.save(this.mapper.tToe(desc));
        return true;
    }

}
