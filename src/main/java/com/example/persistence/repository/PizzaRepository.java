package com.example.persistence.repository;


import com.example.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

//Aqui va el repositorio
public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}
