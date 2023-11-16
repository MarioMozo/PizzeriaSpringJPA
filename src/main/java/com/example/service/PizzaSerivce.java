package com.example.service;

import com.example.persistence.entity.PizzaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaSerivce {
    //Declarar variable
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    //Constructor
    public PizzaSerivce(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    //Metodo para consultar todas las pizzas que existen.
    public List<PizzaEntity> getAll(){
        return this.jdbcTemplate.query("SELECT * FROM pizza", new BeanPropertyRowMapper<>(PizzaEntity.class));
    }
}
