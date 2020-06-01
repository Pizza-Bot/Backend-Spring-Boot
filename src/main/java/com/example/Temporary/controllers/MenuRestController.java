package com.example.Temporary.controllers;


import com.example.Temporary.dto.MenuDTO;
import com.example.Temporary.models.Menu;
import com.example.Temporary.service_impl.MenuImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuRestController {

    @Autowired
    MenuImpl menuImpl;

    @PostMapping()
    public ResponseEntity<Menu> createMenu(@RequestBody MenuDTO menuDTO){

        return new ResponseEntity<>(menuImpl.createMenu(menuDTO), HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable("id") Long id,  @RequestBody MenuDTO menuDTO){
        return new ResponseEntity<>(menuImpl.updateMenu(id, menuDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenu(@PathVariable("id") Long id){
        return new ResponseEntity<>(menuImpl.deleteMenu(id), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Menu> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(menuImpl.getMenu(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Menu>> getAll(){
        return new ResponseEntity<>(menuImpl.getAll(), HttpStatus.OK);
    }



}
