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
        inventoryFile();
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
    public static void inventoryFile (){
        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("inventory.csv"));
            String list;
            while ((list = bufferedReader.readLine())!= null){
                System.out.println(list);
            }


        } catch (Exception e) {
            System.out.println("Something is wrong :( ");
        }

    }
}
