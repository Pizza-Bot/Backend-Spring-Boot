package com.example.Temporary.controllers;

import com.example.Temporary.dto.TotalOrderDTO;
import com.example.Temporary.models.TotalOrder;
import com.example.Temporary.service_impl.ITotalOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/totalorder")
public class TotalOrderController {

    @Autowired
    ITotalOrder iTotalOrder;

    @PostMapping
    public ResponseEntity<TotalOrder> createTotalOrder(@RequestBody TotalOrderDTO totalOrderDTO){
        return new ResponseEntity<>(iTotalOrder.createTotalOrder(totalOrderDTO), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TotalOrder> updateTotalOrder(@PathVariable("id") Long id, @RequestBody TotalOrderDTO totalOrderDTO){
        return new ResponseEntity<>(iTotalOrder.updateTotalOrder(id, totalOrderDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMapping(@PathVariable("id") Long id){
        return new ResponseEntity<>(iTotalOrder.deleteTotalOrder(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TotalOrder> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(iTotalOrder.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TotalOrder>> getAll(){
        return new ResponseEntity<>(iTotalOrder.getAll(), HttpStatus.OK);
    }

}
