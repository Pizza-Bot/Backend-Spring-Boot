package com.example.Temporary.service_impl;

import com.example.Temporary.dto.RealPizzaDTO;
import com.example.Temporary.models.RealPizza;

import java.util.List;

public interface iRealPizza {

    RealPizza createRealPizza(RealPizzaDTO realPizzaDTO);

    RealPizza updateRealPizza(RealPizza realPizza);

    String deletePizza(Long id);

    RealPizza getOne(Long id);

    List<RealPizza> getAll();

}
