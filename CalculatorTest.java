// CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testelectbill(){
        Calculator obj_unit = new Calculator();
        assertEquals(1200, obj_unit.electbill(500, 300), "Should 1200");
    }
    @Test
    void testwaterbill(){
        Calculator obj_unit = new Calculator();
        assertEquals(1000, obj_unit.waterbill(500, 300), "Should be 1000");
    }

    @Test
    void testwaterbillresult(){
        Calculator obj_unit = new Calculator();
        assertEquals(2500, obj_unit.WaterReultsBill("single"), "Should be 2500");
        assertEquals(3000, obj_unit.WaterReultsBill("double"), "Should be 3000");
    }

    @Test
    void testelectbillresult(){
        Calculator obj_unit = new Calculator();
        assertEquals(2700, obj_unit.electReultsBill("single"), "Should be 2700");
        assertEquals(3200, obj_unit.electReultsBill("double"), "Should be 3200");
    }
}
