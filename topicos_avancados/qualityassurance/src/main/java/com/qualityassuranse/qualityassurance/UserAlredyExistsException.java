/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

/**
 *
 * @author olgac
 */
public class UserAlredyExistsException extends RuntimeException{
     public UserAlredyExistsException(Long id) {
        super("User do id "+ id + " já existe");
    }

    UserAlredyExistsException() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
