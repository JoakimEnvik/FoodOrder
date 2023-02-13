package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<String> order;

    public Order() {
        order = new ArrayList<>();
    }

    public void addToOrder(String pic) {
        order.add(pic);
    }
    public List getOrder() {
        return order;
    }

}
