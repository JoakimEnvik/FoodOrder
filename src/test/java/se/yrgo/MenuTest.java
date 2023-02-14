package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MenuTest {


    @Test
    public void testgetFoodMenu() {
        Menu menu = new Menu();
        Map<String, Integer> actualMenu = menu.getFoodMenu();
        assertEquals(6, actualMenu.size());
        assertEquals(125, actualMenu.get("Lasagne"));
    }

    @Test
    public void testShowMenu() {
        Menu menu = new Menu();
        assertTrue(menu.showMenu().contains("Poke Bowl"));
    }




}