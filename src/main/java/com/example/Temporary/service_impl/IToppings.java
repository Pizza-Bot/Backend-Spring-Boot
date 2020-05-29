package com.example.Temporary.service_impl;

import com.example.Temporary.dto.ToppingsDTO;
import com.example.Temporary.models.Toppings;

import java.util.List;

public interface IToppings {

    Toppings createTopping(ToppingsDTO toppingsDTO);

    Toppings updateTopping(Toppings toppings);

    String deleteTopping(Long id);

    Toppings getOne(Long id);

    List<Toppings> getAll();

}
