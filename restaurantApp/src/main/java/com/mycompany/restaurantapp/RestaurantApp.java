package com.mycompany.restaurantapp;

import people.Customer;
import values.CustomerRole;

public class RestaurantApp {
    
    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT,"123","Karen Marcela" );
        student.sellFood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "Sultanito de tal");
        administrative.sellFood();
    }
}
