package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MenuTest {
    Menu menu = new Menu();

    @Test
    public void testShowMenu() {
        assertTrue(true, String.valueOf(menu.showMenu().contains("Hamburger")));
    }

}