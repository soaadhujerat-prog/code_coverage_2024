package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction1 {
    // ✅ בדיקה תקינה
    @Test
    public void testFunc1_validInput() {
        int x = 2;
        int y = 0;
        int z = 20;

        int result = Function1.func1(x, y, z);

        // חישוב צפוי:
        // if (x != 0 && y == 0) => true → res = z / 10 = 2
        // res = res / x = 2 / 2 = 1
        assertEquals(1, result);
    }

    // ❌ בדיקה שחושפת תקלה – חלוקה באפס
    @Test
    public void testFunc1_divideByZeroBug() {
        int x = 0;
        int y = 1;
        int z = 10;

        // כאן אנחנו מצפים לחריגה בגלל res / x
        assertThrows(ArithmeticException.class, () -> Function1.func1(x, y, z));
    }

}

