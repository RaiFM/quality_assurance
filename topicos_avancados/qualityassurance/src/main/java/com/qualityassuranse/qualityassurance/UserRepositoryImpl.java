/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author olgac
 */
public class UserRepositoryImpl implements UserRepository {

    List<User> users = new ArrayList<>();
    
    
    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public List<User> createUser(User user) {
        users.add(user);
        return users;
    }

    @Override
    public void deleteUser(User entity) {
        users.remove(entity);
    }
    
}
