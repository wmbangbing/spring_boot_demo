package com.km.fkSpring.Service.config;

import com.km.fkSpring.contract.Catalog;
import com.km.fkSpring.dao.config.AbstractEntity;
import com.km.fkSpring.contract.ICatalogService;
import com.km.fkSpring.dao.config.BaseDao;

import java.util.List;

public class SimpleCatalogService<T extends Catalog,E extends AbstractEntity> implements ICatalogService<T> {
    private final BaseDao<E> dao;
    private final CatalogMapper<T, E> mapper;

    protected SimpleCatalogService(BaseDao<E> dao,CatalogMapper<T, E> mapper){
        super();
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public T create(Object tag) throws Throwable {
        return null;
    }

    @Override
    public boolean save(T entity) throws Throwable {
        return false;
    }

    @Override
    public List<Boolean> batchSave(Iterable<T> entities) throws Throwable {
        return null;
    }
}
