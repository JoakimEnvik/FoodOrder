package se.yrgo;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map <String, Integer> foodMenu = new HashMap<>();

    /**
     * Constructor wich also calls the method addMeal to add meals to the
     * HashMap foodMenu
     */

    public Menu() {
        this.foodMenu = foodMenu;
        addMeal();
    }

    /**
     * Adds dishes and their price to the foodMenu
     */
    private void addMeal() {
        foodMenu.put("Lasagne", 125);
        foodMenu.put("Pizza", 140);
        foodMenu.put("Entrecote", 260);
        foodMenu.put("Poke Bowl", 149);
        foodMenu.put("Falafel Salad", 139);
        foodMenu.put("Ice Cream", 69);
    }

    /**
     * Puts the keys and values from the HashMap into a StringBuilder, using a foorEach-loop,
     * so it becomes appropriate to use as a presentation of the menu
     * @return sb.toString  Returns a String format of the StringBuilder
     */
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

    /**
     * Getter for the foodMenu
     * @return HashMap foodMenu
     */
    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }
}