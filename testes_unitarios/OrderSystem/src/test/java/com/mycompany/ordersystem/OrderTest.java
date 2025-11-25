/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ordersystem;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.ordersystem.*;

/**
 *
 * @author raife
 */
public class OrderTest {
    
    private Order order;
    
    public OrderTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        System.out.println("Starting test suite for the order system...");
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
        System.out.println("All tests finished.");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        order = new Order();
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        System.out.println("Test executed successfully.");
    }

    /**
     * Test of addItem method, of class Order.
     */
    @org.junit.jupiter.api.Test
    public void testAddItem() {
        System.out.println("addItem");
        
        Product product = new Product("Keyboard", 100);
        OrderItem item = new OrderItem(product, 1);
        
        order.addItem(item);

        assertEquals(1, order.getItemCount());
        assertTrue(order.getItems().contains(item));
    }

    /**
     * Test of removeItem method, of class Order.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        
        Product product = new Product("Headset", 200);
        OrderItem item = new OrderItem(product, 1);

        order.addItem(item);
        order.removeItem(item);

        assertEquals(0, order.getItemCount());
        assertFalse(order.getItems().contains(item));
    }

    /**
     * Test of getItems method, of class Order.
     */
    @org.junit.jupiter.api.Test
    public void testGetItems() {
        System.out.println("getItems");
        
        Product p1 = new Product("Monitor", 800);
        Product p2 = new Product("Mouse", 50);

        order.addItem(new OrderItem(p1, 1));
        order.addItem(new OrderItem(p2, 3));
        
        List<OrderItem> result = order.getItems();

        assertEquals(2, result.size());
    }

    /**
     * Test of getItemCount method, of class Order.
     */
    //@org.junit.jupiter.api.Test
    //public void testGetItemCount() {
//        System.out.println("getItemCount");
//        Order instance = new Order();
//        int expResult = 0;
//        int result = instance.getItemCount();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of calculateTotal method, of class Order.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateTotal() {
        System.out.println("CalculateTotal");
        Product p1 = new Product("Monitor", 800);
        Product p2 = new Product("Mouse", 50);

        order.addItem(new OrderItem(p1, 1));
        order.addItem(new OrderItem(p2, 2));

        double total = order.calculateTotal();

        assertEquals(900, total);
    }
    
}
