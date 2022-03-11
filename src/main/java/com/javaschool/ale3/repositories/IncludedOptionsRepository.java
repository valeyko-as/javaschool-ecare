package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.IncludedOptions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncludedOptionsRepository extends JpaRepository<IncludedOptions, Integer> {
    List<IncludedOptions> findByTariffId(Integer id);
}
