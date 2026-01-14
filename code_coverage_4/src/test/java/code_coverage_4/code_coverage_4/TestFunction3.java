package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction3 {

    @Test
    public void T1() {// ❌ בדיקה שחושפת תקלה
        int x = 1;
        assertThrows(ArithmeticException.class, () -> Function3.func3(x));
    }

}
