package com.example.pinkcity.b_controllers;

import com.example.pinkcity.a_models.CoffeeBar;
import com.example.pinkcity.c_services.CoffeeBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffeeBar")
public class CoffeeBarController {

    @Autowired
    private CoffeeBarService service;

    public CoffeeBarController(CoffeeBarService service){
        this.service = service;
    }

   @GetMapping("")
   public List<CoffeeBar> getAllCoffeeBar(){
       return this.service.getAllCoffeeBar();
    }

    @GetMapping("/{id}")
   public CoffeeBar selectOneCoffeeBar(@PathVariable String id){
        // todo : how to manage Errors?
       return null;
   }

   @PostMapping("/add")
   public CoffeeBar addNewCoffeeBar(){
       return null;
   }

   @PutMapping("/{id}/modify")
    public CoffeeBar updateOneCoffeeBar(@PathVariable String id, @RequestBody CoffeeBar coffeeBar){
        return null;
    }

    @DeleteMapping("/{id}/delete")
    public CoffeeBar deleteOneCoffeeBar(@PathVariable String id){
        return null;
    }
}
