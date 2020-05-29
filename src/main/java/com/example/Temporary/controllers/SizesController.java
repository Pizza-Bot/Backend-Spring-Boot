package com.example.Temporary.controllers;


import com.example.Temporary.dto.SizesDTO;
import com.example.Temporary.models.Sizes;
import com.example.Temporary.service_impl.ISize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sizes")
public class SizesController {

    @Autowired
    ISize size;

    @PostMapping
    public ResponseEntity<Sizes> createOne(@RequestBody SizesDTO sizesDTO){
        return new ResponseEntity<>(size.createSize(sizesDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Sizes> update(@RequestBody Sizes sizes){
        return new ResponseEntity<>(size.updateSize(sizes), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        return new ResponseEntity<>(size.deleteSize(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sizes> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(size.getOne(id), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Sizes>> getAll(){
        return new ResponseEntity<>(size.getAll(), HttpStatus.OK);
    }


}
