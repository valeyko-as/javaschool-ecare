package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByLastName(String lastName);

    List<Client> findByFirstNameAndLastName(String lastName, String firstName);

    @Query(value = "select cl from Client cl join cl.contracts co where co.id = ?1")
    Client findByContractId(Integer id);

    @Query(value = "select cl from Client cl join cl.contracts co where co.number= ?1")
    Client findByContractNumber(String number);

}
