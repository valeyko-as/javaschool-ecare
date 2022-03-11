package com.javaschool.ale3.services;

import java.util.List;

public interface ServiceInterface<T> {
    T findById(Integer id);
    List<T> getAll();
    T add(T t);
    void update(T t);
    void delete(Integer id);
}
