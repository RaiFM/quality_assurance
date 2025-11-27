/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

/**
 *
 * @author raife
 */
public class Main {

    public static void main(String[] args) {
        
        Order o1 = new Order();
        
        // Products
        Product p1 = new Product("Cap", 20);
        Product p2 = new Product("Shirt", 40);
        
        // OrderItem
        OrderItem op1 = new OrderItem(p1, 1);
        OrderItem op2 = new OrderItem(p2, 3);
        
        // Add items
        o1.addItem(op1);
        o1.addItem(op2);
        
        double total = o1.calculateTotal();
        
        System.out.println("Total do pedido: " + total);
    }
    
}
