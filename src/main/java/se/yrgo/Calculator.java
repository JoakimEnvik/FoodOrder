package se.yrgo;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Calculator {

    public static int calculateBill(List<String> bill) {
        Menu menu = new Menu();
        int total = 0;
        for (Map.Entry<String, Integer> entry : Menu.foodMenu.entrySet()) {
            for (String meal: bill) {
                if(meal.equals(entry.getKey()))
                    total += entry.getValue();
            }

        }
        return total;
    }
}
