package com.mycompany.restaurantapp;


import com.mycompany.restaurantapp.food.Dish;
import com.mycompany.restaurantapp.food.Menu;
import com.mycompany.restaurantapp.people.Customer;
import com.mycompany.restaurantapp.values.CustomerRole;
import com.mycompany.restaurantapp.values.DishType;

public class RestaurantApp {
    
    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT,"123","Karen Marcela" );
        student.sellFood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "Sultanito de tal");
        administrative.sellFood();
        
        Menu menu = new Menu(); 
        
        Dish breakFast1 = new Dish(DishType.BREAKFAST, "Huevos fritos","Huevos con sal y pimiento",2400,20);
        Dish breakFast2 = new Dish(DishType.BREAKFAST, "Caldo","Carne, papa, ajo",2400,20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa","Pastas frescas",2400,20);
        
        menu.addDish(breakFast1);
        menu.addDish(breakFast2);
        menu.addDish(lunch1);
        
        System.out.println(menu.getDichesPerType(DishType.BREAKFAST));
    }
}
