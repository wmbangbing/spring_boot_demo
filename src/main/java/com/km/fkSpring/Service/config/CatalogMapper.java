package com.km.fkSpring.Service.config;

import com.km.fkSpring.contract.Catalog;
import com.km.fkSpring.dao.config.AbstractEntity;

import java.util.List;

public interface CatalogMapper<T extends Catalog, E extends AbstractEntity> {
    T eTot(E entity) throws Throwable;

    E tToe(T entity) throws  Throwable;

    List<T> eTot(Iterable<E> entities) throws Throwable;

    Iterable<E> tToe(Iterable<T> entities) throws Throwable;

}
