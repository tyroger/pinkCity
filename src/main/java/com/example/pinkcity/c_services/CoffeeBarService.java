package com.example.pinkcity.c_services;

import com.example.pinkcity.a_models.CoffeeBar;
import com.example.pinkcity.d_repository.CoffeeBarRepository;
import com.example.pinkcity.d_repository.entities.APIResponseEntity;
import com.example.pinkcity.d_repository.entities.ApiRecordsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeBarService {

    @Autowired
    private CoffeeBarRepository repo;
    public CoffeeBarService(CoffeeBarRepository repo){
        this.repo = repo;
    }

    public List<CoffeeBar> getAllCoffeeBar(){
        APIResponseEntity response = this.repo.getCoffeeBarResponseEntity();
        return transformEntityToModel(response);
    }

    public List<CoffeeBar> transformEntityToModel(APIResponseEntity response){
        List<CoffeeBar>coffeeBars = new ArrayList<>(); // table qui va recevoir les nouveaux objets
        for ( ApiRecordsEntity record: response.getRecords()) {
            CoffeeBar coffeeBar = new CoffeeBar();
            coffeeBar.setId(record.getId());
            coffeeBar.setName(record.getFields().getName());
            coffeeBar.setStreetName(record.getFields().getStreetName());
            coffeeBar.setPostalCode(record.getFields().getPostalCode());
            coffeeBar.setCity(record.getFields().getCity());
            coffeeBar.setPhoneNumber(record.getFields().getPhoneNumber());
            coffeeBar.setWebSiteUrl(record.getFields().getWebSiteUrl());
            coffeeBars.add(coffeeBar);
        }
        return coffeeBars;
    }


    public CoffeeBar selectOneCoffeeBar(String id){
        // todo : how to manage Errors?
        return null;
    }

    public CoffeeBar addNewCoffeeBar(){
        return null;
    }

    public CoffeeBar updateOneCoffeeBar(String id,CoffeeBar coffeeBar){
        return null;
    }

    public CoffeeBar deleteOneCoffeeBar(String id){
        return null;
    }

}
