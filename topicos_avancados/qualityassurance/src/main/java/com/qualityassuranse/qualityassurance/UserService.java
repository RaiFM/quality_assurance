/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author olgac
 */
@Service
public class UserService {
    
    @Autowired
    UserRepository repository;

    List<User> findAll(){
        return repository.findAll();
    }
    
    List<User> createUser(User user) {
        if (repository.findAll().contains(user)) throw new UserAlredyExistsException(user.getId());
        return repository.createUser(user);
    }
    
    void deleteUser(User entity){
       if (!repository.findAll().contains(entity)) throw new UserNotExistsException(entity.getId());
       repository.deleteUser(entity);
    }
    
    
    
    
    
    
}
