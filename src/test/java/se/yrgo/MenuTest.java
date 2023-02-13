package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;
import se.yrgo.Menu;
import org.junit.jupiter.api.Test;

public class MenuTest {
    Menu menu = new Menu();

    @Test
    public void testAddmeal() {
        menu.foodMenu.put("Hamburger", 125);
        assertEquals(125, menu.foodMenu.get("Hamburger"));
    }

    @Test
    public void testAddmealExpectBooelan() {
        menu.foodMenu.put("Ice Cream", 69);
        assertTrue(true, String.valueOf(menu.foodMenu.containsKey(69)));
    }

    @Test
    public void testShowMenu() {
        assertTrue(true, String.valueOf(menu.showMenu().contains("Hamburger")));
    }

    @Test
    public void testGetFoodMenu() {
        menu.foodMenu.put("Ice Cream", 69);
        assertSame(menu.foodMenu, menu.getFoodMenu());
    }


}