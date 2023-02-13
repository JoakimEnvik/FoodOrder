package se.yrgo;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map <String, Integer> foodMenu = new HashMap<>();

    public Menu() {
        this.foodMenu = foodMenu;
        addMeal();
    }

    private void addMeal() {
        foodMenu.put("Lasagne", 125);
        foodMenu.put("Pizza", 140);
        foodMenu.put("Entrecote", 260);
        foodMenu.put("Poke Bowl", 149);
        foodMenu.put("Falafel Salad", 139);
        foodMenu.put("Ice Cream", 69);
    }

    public String showMenu() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : foodMenu.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" costs ");
            sb.append(entry.getValue());
            sb.append( " kr ");
            sb.append("\n");
        }
        return sb.toString();
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }
}