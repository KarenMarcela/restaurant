package com.mycompany.restaurantapp;


import com.mycompany.restaurantapp.food.Dish;
import com.mycompany.restaurantapp.food.Menu;
import com.mycompany.restaurantapp.people.Customer;
import com.mycompany.restaurantapp.values.CustomerRole;
import com.mycompany.restaurantapp.values.DishType;
import java.util.ArrayList;

public class RestaurantApp {
    
    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192215", "Karen");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "sss", "Sultanito de tal");
        administrative.sellFood();
         
        Menu menu = new Menu();
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huevos, sal y primienta", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo", "Carne, papa, ajo", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa ", "Pasta frescas", 2400, 20);
        Dish lunch2 = new Dish(DishType.LUNCH, "Carne en bistec ", "Carne, ensalda y arroz", 2400, 12);
        Dish dinner1 = new Dish(DishType.DINNER, "Arepa con caldo de costilla ", "Arepa, costilla ", 2400, 18);
        Dish dinner2 = new Dish(DishType.DINNER, "Papa rellena", "Papa, carne y huevo", 2400, 17);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        menu.addDish(lunch2);
        menu.addDish(dinner1);
        menu.addDish(dinner2);
        
        
        System.out.println("--------------------------");
        
        System.out.println("Platos para el desayuno:");
        ArrayList<String> breakfastDishes = menu.getDishesPerType(DishType.BREAKFAST);
        for (String dish : breakfastDishes) {
            System.out.println(dish);
        }
        
        System.out.println("--------------------------");
        
        System.out.println("Platos para el almuerzo:");
        ArrayList<String> lunchDishes = menu.getDishesPerType(DishType.LUNCH);
        for (String dish : lunchDishes) {
            System.out.println(dish);
        }
        
        System.out.println("--------------------------");
        
        System.out.println("Platos para la comida:");
        ArrayList<String> dinnerDishes = menu.getDishesPerType(DishType.DINNER);
        for (String dish : dinnerDishes) {
            System.out.println(dish);
        }
        
        System.out.println("--------------------------");
        
    }
}