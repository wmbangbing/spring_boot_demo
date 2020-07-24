package com.km.fkSpring.dao.user;

import com.km.fkSpring.dao.config.SpringDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class UserSpringDao extends SpringDao<UserEntity> implements UserDao {
    private final UserRepository repository;

    //    private final User
    @Autowired
    protected UserSpringDao(UserRepository repository){
        super(repository);
        this.repository = repository;
    }

    @Override
    public UserEntity findById(String id) {
        Optional<UserEntity> optional = this.repository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public UserEntity findByUserName(String userName) {
        Optional<UserEntity> optional = this.repository.findByUserName(userName);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
