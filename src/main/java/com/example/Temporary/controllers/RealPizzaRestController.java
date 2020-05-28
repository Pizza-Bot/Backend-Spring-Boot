package com.example.Temporary.controllers;

import com.example.Temporary.dto.RealPizzaDTO;
import com.example.Temporary.models.RealPizza;
import com.example.Temporary.service_impl.iRealPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/realpizza")
public class RealPizzaRestController {

    @Autowired
    iRealPizza iRealPizza;

    @PostMapping
    public ResponseEntity<RealPizza> createPizza(@RequestBody RealPizzaDTO realPizzaDTO){
        return new ResponseEntity<>(iRealPizza.createRealPizza(realPizzaDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<RealPizza> updatePizza(@RequestBody RealPizza realPizza){
        return new ResponseEntity<>(iRealPizza.updateRealPizza(realPizza), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePizza(@PathVariable("id") Long id){
        return new ResponseEntity<>(iRealPizza.deletePizza(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RealPizza> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(iRealPizza.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RealPizza>> getAll(){
        return new ResponseEntity<>(iRealPizza.getAll(), HttpStatus.OK);
    }

}
