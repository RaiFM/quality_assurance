/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

/**
 *
 * @author olgac
 */
public class UserNotExistsException extends RuntimeException {
    public UserNotExistsException(Long id){
        super("Usuário do id: "+id+" não encontrado");
    }
}
