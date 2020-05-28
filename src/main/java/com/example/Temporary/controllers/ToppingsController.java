package com.example.Temporary.controllers;

import com.example.Temporary.dto.ToppingsDTO;
import com.example.Temporary.models.Toppings;
import com.example.Temporary.service_impl.iToppings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toppings")
public class ToppingsController {

    @Autowired
    iToppings itoppings;

    @PostMapping
    public ResponseEntity<Toppings> createTopping(@RequestBody ToppingsDTO toppingsDTO){
        return new ResponseEntity<>(itoppings.createTopping(toppingsDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Toppings> updateTopping(@RequestBody Toppings toppings){
        return new ResponseEntity<>(itoppings.updateTopping(toppings), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTopping(@PathVariable("id") Long id){
        return new ResponseEntity<>(itoppings.deleteTopping(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Toppings> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(itoppings.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Toppings>> getAll(){
        return new ResponseEntity<>(itoppings.getAll(), HttpStatus.OK);
    }

}
