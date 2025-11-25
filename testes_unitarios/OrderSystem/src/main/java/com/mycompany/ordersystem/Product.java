package com.mycompany.ordersystem;

// import org.junit.jupiter.api.*;
// import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.*;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

