/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

/**
 *
 * @author olgac
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User do id "+ id + " não encontrado");
    }
}
