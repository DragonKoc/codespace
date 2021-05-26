package advanced.alfa.lesson25.theory;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void test() {
        String obj1 = "junit1";
        String obj2 = "junit1";
        String obj3 = "test_ok";
        String obj4 = "test_ok";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
//        Описание данных для проверки
        assertEquals(obj1, obj2);
        assertSame(obj3, obj4);
        assertNotSame(obj2, obj4);
        assertNotNull(obj1);
        assertNull(obj5);
        assertTrue(var1 != var2);
        assertArrayEquals(arr1, arr2);

    }
}
