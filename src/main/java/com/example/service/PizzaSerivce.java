package com.example.service;

import com.example.persistence.entity.PizzaEntity;
import com.example.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaSerivce {
    //Declarar variable
    private final PizzaRepository pizzaRepository;

    //Constructor
    @Autowired
    public PizzaSerivce(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    //Metodo para consultar todas las pizzas que existen.
    public List<PizzaEntity> getAll(){
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity get(int idPizza) {return this.pizzaRepository.findById(idPizza).orElse((null));}
}
