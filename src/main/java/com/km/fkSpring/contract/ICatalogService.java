package com.km.fkSpring.contract;

import java.util.List;

public interface ICatalogService<T extends Catalog>{
    T create(Object tag) throws Throwable;

    boolean save(T entity) throws Throwable;

    List<Boolean> batchSave(Iterable<T> entities) throws Throwable;
}
