package com.km.fkSpring.dao.config;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BaseRepository<E extends AbstractEntity>
        extends  PagingAndSortingRepository<E, String>, JpaSpecificationExecutor<E>{

}
