package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

// Starter for Search Inventory (Workbook 3a, Section 3-2 Using an ArrayList, Exercise 1).
// main is done: it asks getInventory() for the list and prints every product.
// Your job is getInventory(): fill the list with at least 5 products.
public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);

        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1,"book",2.99));
        inventory.add(new Product(2,"potato",1.99));
        inventory.add(new Product(3,"milk",4.99));
        inventory.add(new Product(4,"laptop",999.99));
        inventory.add(new Product(6,"smart tv",450.99));
        // Write your code here

        return inventory;
    }

}
