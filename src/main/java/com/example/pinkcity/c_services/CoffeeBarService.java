package com.example.pinkcity.c_services;

import com.example.pinkcity.a_models.CoffeeBar;
import com.example.pinkcity.d_repository.CoffeeBarRepository;
import com.example.pinkcity.d_repository.entities.APIResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeBarService {

    private CoffeeBarRepository repo;

    public CoffeeBarService(CoffeeBarRepository repo){
        this.repo = repo;
    }

    public List<CoffeeBar> getAllCoffeeBar(){
        APIResponseEntity response = this.repo.getCoffeeBarResponseEntity();
        return transformEntityToModel(response);

    }

    public List<CoffeeBar> transformEntityToModel(APIResponseEntity response){
        List<CoffeeBar>coffeBars = new ArrayList<>();
        //todo : loop on records data
        return coffeBars;
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
