package com.javaschool.ale3.dtomapper;

import com.javaschool.ale3.data.Client;
import com.javaschool.ale3.dto.ClientDTO;

public class ClientMapper {
    public static ClientDTO toDto(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setFirstName(client.getFirstName());
        clientDTO.setLastName(client.getLastName());
        clientDTO.setBirthDate(client.getBirthDate());
        clientDTO.setPassport(client.getPassport());
        clientDTO.setEmail(clientDTO.getEmail());
        return clientDTO;
    }

    public static Client toEntity(ClientDTO clientDTO) {
        Client client = new Client();
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setBirthDate(clientDTO.getBirthDate());
        client.setPassport(clientDTO.getPassport());
        client.setEmail(clientDTO.getEmail());
        return client;
    }
}
