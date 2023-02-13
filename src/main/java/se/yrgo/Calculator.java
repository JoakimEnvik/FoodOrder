package se.yrgo;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Calculator {
    /**
     * Method that takes a list with an order and compares it to the menu with prices.
     * when a String from the order matches a String from the menu it takes the price and adds it to the total
     * then it returns the total sum of the order.
     * @param order
     * @return
     */
    public static int calculateBill(List<String> order) {
        Menu menu = new Menu();
        int total = 0;
        for (Map.Entry<String, Integer> entry : menu.getFoodMenu().entrySet()) {
            for (String meal: order) {
                if(meal.equals(entry.getKey()))
                    total += entry.getValue();
            }

        }
        return total;
    }
}
