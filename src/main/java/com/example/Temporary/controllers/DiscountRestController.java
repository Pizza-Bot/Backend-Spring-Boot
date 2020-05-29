package com.example.Temporary.controllers;

import com.example.Temporary.dto.DiscountDTO;
import com.example.Temporary.models.Discount;
import com.example.Temporary.service_impl.IDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discount")
public class DiscountRestController {

    @Autowired
    IDiscount iDiscount;

    @PostMapping
    public ResponseEntity<Discount> createDiscount(@RequestBody DiscountDTO discountDTO){
        return new ResponseEntity<>(iDiscount.craeteDiscount(discountDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Discount> updateDiscount(@RequestBody Discount discount){
        return new ResponseEntity<>(iDiscount.updateDiscount(discount), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDiscount(@PathVariable("id") Long id){
        return new ResponseEntity<>(iDiscount.deleteDiscount(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discount> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(iDiscount.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Discount>> getAll(){
        return new ResponseEntity<>(iDiscount.getAll(), HttpStatus.OK);
    }

}
