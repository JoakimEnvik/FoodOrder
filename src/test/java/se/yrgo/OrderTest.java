package se.yrgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    Order order = new Order();

    @Test
    public void listOrderExist() {
        assertNotNull(order.getOrder());
    }
    @Test
    public void addingToListAndGettingFromList() {
        order.addToOrder("test");
        order.addToOrder("test2");
        String[] test = {"test", "test2"};
        assertArrayEquals(test, order.getOrder().toArray());
        assertEquals(2, order.getOrder().size());
    }
}
