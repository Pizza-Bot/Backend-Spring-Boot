package com.example.Temporary.controllers;
import com.example.Temporary.dto.PizzaOrderDTO;
import com.example.Temporary.models.PizzaOrder;
import com.example.Temporary.service_impl.IPizzaOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizza-order")
public class PizzaOrderController {

    @Autowired
    IPizzaOrder iPizzaOrder;

    @PostMapping
    public ResponseEntity<PizzaOrder> createPizzaOrder(@RequestBody PizzaOrderDTO pizzaOrderDTO){
        return new ResponseEntity<>(iPizzaOrder.createPizzaorder(pizzaOrderDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PizzaOrder> updatePizzaOrder(@PathVariable("id") Long id, @RequestBody PizzaOrderDTO pizzaOrderDTO){
        return new ResponseEntity<>(iPizzaOrder.updatePizza(id, pizzaOrderDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePizzaOrder(@PathVariable("id") Long id){
        return new ResponseEntity<>(iPizzaOrder.deletePizza(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PizzaOrder> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(iPizzaOrder.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<PizzaOrder>> getAll(){
        return new ResponseEntity<>(iPizzaOrder.getAll(), HttpStatus.OK);
    }

}
