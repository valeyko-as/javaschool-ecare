package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.PossibleOptions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PossibleOptionsRepository extends JpaRepository<PossibleOptions, Integer> {
    List<PossibleOptions> findByTariffId(Integer id);
}
