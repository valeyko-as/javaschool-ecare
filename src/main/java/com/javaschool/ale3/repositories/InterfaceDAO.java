package com.javaschool.ale3.repositories;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface InterfaceDAO<T, Id extends Serializable> {
    T get(Id id);
    List<T> getAll();
    void delete(T t);
}
