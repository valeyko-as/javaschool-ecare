package com.javaschool.ale3.dtomapper;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.dto.TariffDTO;

public class TariffMapper {
    public static TariffDTO toDto(Tariff tariff) {
        TariffDTO tariffDTO = new TariffDTO();
        tariffDTO.setName(tariff.getName());
        tariffDTO.setPrice(tariff.getPrice());
        tariffDTO.setInternet(tariff.getInternet());
        tariffDTO.setCalls(tariff.getCalls());
        tariffDTO.setMessages(tariff.getMessages());
        return tariffDTO;
    }

    public static Tariff toEntity(TariffDTO tariffDTO) {
        Tariff tariff = new Tariff();
        tariff.setName(tariffDTO.getName());
        tariff.setPrice(tariffDTO.getPrice());
        tariff.setActuality(true);
        tariff.setInternet(tariffDTO.getInternet());
        tariff.setCalls(tariffDTO.getCalls());
        tariff.setMessages(tariffDTO.getMessages());
        return tariff;
    }
}
