package com.company.data.repository;

import java.util.List;

public interface AbstractRep<T, D> {
    T create(T t);

    T update(T t);

    List<T> findAll();

    T findById(D d);

    T delete(D d);
}
