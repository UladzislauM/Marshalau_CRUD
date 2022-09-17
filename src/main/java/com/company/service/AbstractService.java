package com.company.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AbstractService<T, K> {
    List<T> findAll();

    T findById(K id);

    void delete(K id);

    T create(T d);

    T update(T d);
}
