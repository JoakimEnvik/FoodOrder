package se.yrgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalculatorTest {

    @Test
    public void testCalculateBill(){
        Menu menu = new Menu();
        List<String> order = List.of("Lasagne", "Falafel Salad", "Pizza");
        int total = Calculator.calculateBill(order);
        Assertions.assertEquals(404, total, "Should be 404");

    }
}
