/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author olgac
 */
@RestController
@RequestMapping("/api")
public class MyController {
    
    @Autowired
    UserService service; 
    
    @GetMapping
    public String helloWorld(){
        return "Achou que eu tava brincando ?";
    }
    
    @PostMapping("")
    public List<User> addUser(@RequestBody User user) {
        return service.createUser(user);
    }
}
