package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction1 {

    @Test
    public void T1() { // ✅ בדיקה תקינה
        int x = 2;
        int y = 0;
        int z = 20;
        int result = Function1.func1(x, y, z);
        assertEquals(1, result);
    }

    @Test
    public void T2() { // ❌ בדיקה שחושפת תקלה – חלוקה באפס
        int x = 0;
        int y = 1;
        int z = 10;
        assertThrows(ArithmeticException.class, () -> Function1.func1(x, y, z));
    }

}

