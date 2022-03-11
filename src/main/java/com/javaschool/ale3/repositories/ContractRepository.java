package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
    Contract findByNumber(String lastName);

    @Query(value = "select co from Contract co join co.client cl where cl.id = ?1")
    List<Contract> findByClientId(Integer id);
}
