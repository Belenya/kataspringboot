package ru.belenya.springboot.kataspringboot.services;

import java.util.List;
import java.util.Optional;

public interface AbstractService<T, ID> {

    void save(T o);

    Optional<T> findById(ID id);

    void update(T o);

    void deleteById(ID id);

    List<T> findAll();
}
