package com.km.fkSpring.contract.user;

import com.km.fkSpring.contract.Catalog;
import lombok.Data;

import java.util.Date;

@Data
public class UserDescriptor extends Catalog {
    private String UserId;
    private String userName;
    private String passWord;
    private String role;
    private Date createTime;
    private Date updateTime;
}
