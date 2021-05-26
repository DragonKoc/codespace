package advanced.alfa.lesson25.theory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateClass {
    @Test
    public void testCalcSum() {
        MyCalculate testobj = new MyCalculate();
        assertEquals(4, testobj.calcSum(2, 2));
    }
}
