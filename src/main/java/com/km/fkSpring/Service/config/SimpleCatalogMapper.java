package com.km.fkSpring.Service.config;

import com.km.fkSpring.contract.Catalog;
import com.km.fkSpring.dao.config.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleCatalogMapper<T extends Catalog, E extends AbstractEntity> implements CatalogMapper<T, E> {

    @Override
    public T eTot(E entity) throws Throwable {
        if(entity == null){
            throw new RuntimeException("the data does not exists.");
        }
        return this._eTot(entity, false);
    }

    protected abstract T _eTot(E entity,boolean lazy) throws Throwable;

    @Override
    public E tToe(T entity) throws Throwable {
        if(entity == null){
            throw new RuntimeException("the data is null");
        }
        return this._tToe(entity);
    }

    protected abstract E _tToe(T entity) throws Throwable;

    @Override
    public List<T> eTot(Iterable<E> entities) throws Throwable {
        final List<T> trees = new ArrayList<T>();
        if(entities != null){
            for(E entity : entities){
                try{
                    if(entity != null){
                        final T _entity = this._eTot(entity, true);
                        trees.add(_entity);
                    }
                }catch (Throwable e){
                    e.printStackTrace();
                }
            }
        }
        return trees;
    }

    @Override
    public Iterable<E> tToe(Iterable<T> entities) throws Throwable {
        final List<E> trees = new ArrayList<E>();
        if(entities != null){
            for(T entity : entities){
                try{
                    if(entity != null){
                        final E _entity = this._tToe(entity);
                        trees.add(_entity);
                    }
                }catch (Throwable e){
                    e.printStackTrace();
                }
            }
        }
        return trees;
    }
}
