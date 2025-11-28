/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.qualityassuranse.qualityassurance;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author olgac
 */
public class UserServiceTest {
    
    public UserServiceTest() {
    }
    
    @Mock
    private UserRepository repository;
    
    
    @InjectMocks
    private UserService instance;
    
    @BeforeAll
    public static void setUpClass() {
        
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class UserService.
     */
    @Test
    @DisplayName("Deve encontrar todos")
    public void testFindAll() {
        
        User user = new User(1L, "Gabriel", Rule.ADM);
        
        when(repository.findAll()).thenReturn(List.of(user));
        List expResult = List.of(user);
        List result = instance.findAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of createUser method, of class UserService.
     */
    @Test
    @DisplayName("Deve criar um usuário corretamente")
    public void testCreateUser() {
        
        System.out.println("createUser");
        
        // usuário de exemplo
        User user = new User(1L, "negocia", Rule.MEMBER);
        
        // usuario já está no banco
        when(repository.findAll()).thenReturn(List.of(user));
        
        
        assertThrows(UserAlredyExistsException.class,() -> instance.createUser(user));
        
    }
    
}
