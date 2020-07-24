package com.km.fkSpring.dao.user;

import com.km.fkSpring.dao.config.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<UserEntity> {
    Optional<UserEntity> findByUserName(String UserName);
}
