package com.km.fkSpring.dao.config;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class AbstractEntity implements  java.io.Serializable {
    @Id
    @Column(name = "id", length = 36, unique = true, nullable = false)
    private  String id;
}
