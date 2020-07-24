package com.km.fkSpring.dao.user;

import com.km.fkSpring.dao.config.AbstractEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "userTable")
public class UserEntity extends AbstractEntity {
    @Column(name = "userId", length = 64, nullable = false)
    private String userId;
    @Column(name = "userName", length = 64, nullable = false)
    private String userName;
    @Column(name = "passWord", length = 64, nullable = false)
    private String passWord;
    @Column(name = "role", length = 64, nullable = false)
    private String role;
    @Column(name = "createTime", length = 64, nullable = false)
    private Date createTime;
    @Column(name = "updateTime", length = 64, nullable = false)
    private Date updateTime;

}