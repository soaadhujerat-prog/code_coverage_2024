package code_coverage_4.code_coverage_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction3 {

    // ❌ בדיקה שחושפת תקלה – חלוקה באפס (מסלול x > 0)
    @Test
    public void testFunc3_xPositive_divideByZeroBug() {
        int x = 1;

        // מצפים לחריגה בגלל חלוקה באפס בתוך func3
        assertThrows(ArithmeticException.class, () -> Function3.func3(x));
    }

}
