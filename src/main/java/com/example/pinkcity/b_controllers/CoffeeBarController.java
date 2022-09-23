package com.example.pinkcity.b_controllers;

import com.example.pinkcity.c_services.CoffeeBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeBarController {

    private CoffeeBarService service;
}
