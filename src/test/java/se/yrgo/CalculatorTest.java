package se.yrgo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCalculateBill(){
        List<String> order = List.of("Lasagne", "Falafel Salad", "Pizza");
        int total = Calculator.calculateBill(order);
        Assertions.assertEquals(404, total, "Should be 404");

    }
}
