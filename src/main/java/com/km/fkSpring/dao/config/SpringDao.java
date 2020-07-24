package com.km.fkSpring.dao.config;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public abstract class SpringDao<E extends AbstractEntity> implements BaseDao<E> {

    private final BaseRepository<E> repository;

    protected SpringDao(BaseRepository<E> repository){
        this.repository = repository;
    }

    @Override
    public E save(E entity){
        return this.repository.save(entity);
    }

    @Override
    public Iterable<E> save(Iterable<E> entities){
        return this.repository.saveAll(entities);
    }

    @Override
    public E findOne(String id){
        return this.repository.findById(id).get();
    }

    @Override
    public boolean exists(String id) {
        return this.repository.findById(id).isPresent();
    }

    @Override
    public Iterable<E> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Iterable<E> findAll(Iterable<String> ids) {
        return this.repository.findAllById(ids);
    }

    @Override
    public long count() {
        return this.repository.count();
    }

    @Override
    public void delete(String id) {
        this.repository.deleteById(id);
    }

    @Override
    public void delete(E entity) {
        this.repository.delete(entity);
    }

    @Override
    public void delete(Iterable<E> entities) {
        this.repository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        this.repository.deleteAll();
    }

    @Override
    public Iterable<E> findAll(Sort sort) {
        return this.repository.findAll(sort);
    }

    @Override
    public Page<E> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public E findOne(Specification<E> spec) {
        return this.repository.findOne(spec).get();
    }

    @Override
    public List<E> findAll(Specification<E> spec) {
        return findAll(spec);
    }

    @Override
    public Page<E> findAll(Specification<E> spec, Pageable pageable) {
        return this.repository.findAll(spec, pageable);
    }

    @Override
    public List<E> findAll(Specification<E> spec, Sort sort) {
        return this.repository.findAll(spec,sort);
    }

    @Override
    public long count(Specification<E> spec) {
        return this.repository.count(spec);
    }

}
