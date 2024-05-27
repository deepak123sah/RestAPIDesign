package com.restapi.restApiMaking.controller;
import com.restapi.restApiMaking.Entities.Menu;
import com.restapi.restApiMaking.Service.ApiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MyController {
    @GetMapping("/home")
    public String home(){
        return "this is the home";
    }
    @Autowired
    public ApiInterface obj;
    @GetMapping("/Menu")
    public List<Menu> Menu(){
        return this.obj.getMenu();
    }
}

