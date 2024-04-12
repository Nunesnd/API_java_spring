package com.example.nunesnd.API.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nunesnd.API.Models.Profissional;
import com.example.nunesnd.API.Services.ProfissionalServices;

@RestController
public class HomeController {

    /*
    @GetMapping("/")
    public String index(){
        return "Olá, mundo! \nSeja bem vindo";
    }
    */
    
    @GetMapping("/")
    public List<Profissional> index(){
        return ProfissionalServices.profissionals();
    }
 
}
