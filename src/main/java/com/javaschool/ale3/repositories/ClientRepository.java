package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query(value = "select c from Client c where c.lastName = ?1")
    List<Client> findByLastName(String lastName);

    @Query(value = "select c from Client c where c.lastName = ?1 and c.firstName = ?2")
    List<Client> findByFullName(String lastName, String ferstName);

    @Query(value = "select cl from Client cl join cl.contracts co where co.id = ?1")
    Client findByContractId(Integer id);

    @Query(value = "select cl from Client cl join cl.contracts co where co.number= ?1")
    Client findByContractNumber(String number);
}
