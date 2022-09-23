package com.example.pinkcity.d_repository;

import com.example.pinkcity.d_repository.entities.APIResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeBarRepository {

   APIResponseEntity getCoffeeBarResponseEntity();

}
