package com.example.Temporary.controllers;


import com.example.Temporary.dto.UserInfoDTO;
import com.example.Temporary.models.UserInfo;
import com.example.Temporary.service_impl.IUserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    IUserInfo iUserInfo;


    @PostMapping
    public ResponseEntity<UserInfo> createUserInfo(@RequestBody UserInfoDTO userInfoDTO){
        return new ResponseEntity<>(iUserInfo.createUserInfo(userInfoDTO), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserInfo> updateUserInfo(@RequestBody UserInfo userInfo){
        return new ResponseEntity<>(iUserInfo.updateUserInfo(userInfo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserInfo(@PathVariable("id") Long id){
        return new ResponseEntity<>(iUserInfo.deleteUserInfo(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserInfo> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(iUserInfo.getOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserInfo>> getAll(){
        return new ResponseEntity<>(iUserInfo.getAll(), HttpStatus.OK);
    }


}
