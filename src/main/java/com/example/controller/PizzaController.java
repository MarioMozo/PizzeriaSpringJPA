package com.example.controller;


import com.example.persistence.entity.PizzaEntity;
import com.example.service.PizzaSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/pizza")
public class PizzaController {
    private final PizzaSerivce pizzaSerivce;

    public PizzaController(PizzaSerivce pizzaSerivce){
        this.pizzaSerivce = pizzaSerivce;
    }

    //Con esta función se puede buscar por id, ingresandolo directamente en la url
    @GetMapping("/{idPizza}")
    public ResponseEntity<PizzaEntity> get(@PathVariable int idPizza)
    {
        return ResponseEntity.ok(this.pizzaSerivce.get(idPizza));

    }
}
