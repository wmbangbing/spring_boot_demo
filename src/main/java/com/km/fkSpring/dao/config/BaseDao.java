package com.km.fkSpring.dao.config;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface    BaseDao<E extends AbstractEntity> {
    E save(E entity);

    Iterable<E> save(Iterable<E> entities);

    E findOne(String id);

    boolean exists(String id);

    Iterable<E> findAll();

    Iterable<E> findAll(Iterable<String> ids);

    long count();

    void delete(String id);

    void delete(E entity);

    void delete(Iterable<E> entities);

    void deleteAll();

    Iterable<E> findAll(Sort sort);

    Page<E> findAll(Pageable pageable);

    E findOne(Specification<E> spec);

    List<E> findAll(Specification<E> spec);

    Page<E> findAll(Specification<E> spec, Pageable pageable);

    List<E> findAll(Specification<E> spec, Sort sort);

    long count(Specification<E> spec);
}
