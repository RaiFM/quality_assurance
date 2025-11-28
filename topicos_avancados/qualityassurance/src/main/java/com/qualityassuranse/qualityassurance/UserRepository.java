/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author olgac
 */
public interface UserRepository {
     List<User> findAll();
    
    List<User> createUser(User user) ;
    
    void deleteUser(User entity);
}
