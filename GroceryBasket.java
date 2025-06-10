package jyothi;
import java.util.HashMap;

public class GroceryBasket {
    public static void main(String[] args) {
        HashMap<String, Integer> basket = new HashMap<>();
        basket.
        put("Apples", 40);
        basket.put("Milk", 50);
        basket.put("Bread", 30);
        basket.put("Eggs", 60);
        basket.put("Rice", 100);
        int totalCost = 0;
        for (int price : basket.values()) {
            totalCost += price;
        }
        System.out.println("Total cost of all items: ₹" + totalCost);
        basket.put("Milk", 55); 
        basket.remove("Bread");
        System.out.println("\nUpdated Basket:");
        for (String item : basket.keySet()) {
            System.out.println(item + ": ₹" + basket.get(item));
        }
        totalCost = 0;
        for (int price : basket.values()) {
            totalCost += price;
        }
        System.out.println("Total cost after update/removal: ₹" + totalCost);
    }
}