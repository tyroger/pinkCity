package com.example.pinkcity.d_repository.implementation;

import com.example.pinkcity.d_repository.CoffeeBarRepository;
import com.example.pinkcity.d_repository.entities.APIResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CoffeeBarImplementation implements CoffeeBarRepository {

    private static final String API_Url = "https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=cafes-concerts&q=";

    @Autowired // allow communication to the API
    RestTemplate restTemplate;

    @Override
    public APIResponseEntity getCoffeeBarResponseEntity() {
        return restTemplate.getForEntity(API_Url,APIResponseEntity.class).getBody();
    }
}
