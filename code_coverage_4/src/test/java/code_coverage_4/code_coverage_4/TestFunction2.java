package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction2 {

    @Test
    public void T1() { // B1: p != 0  -> TRUE
        float p = 2;
        float q = 20;

        String result = Function2.func2(p, q);
        assertEquals("p=12.00, q=1.67", result);
    }

    @Test
    public void T2() {// B2: p != 0 -> FALSE
        float p = 0;
        float q = 20;

        String result = Function2.func2(p, q);
        //  ( חלוקה באפס ב-float לא זורקת חריגה אלא Infinity/NaN)
        assertTrue("Bug revealed: q became Infinity/NaN due to division by zero",
                result.contains("Infinity") || result.contains("NaN"));
    }

}
