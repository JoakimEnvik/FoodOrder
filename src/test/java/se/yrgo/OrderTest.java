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
        String[] test = {"test"};
        assertArrayEquals(test, order.getOrder().toArray());
    }
}
