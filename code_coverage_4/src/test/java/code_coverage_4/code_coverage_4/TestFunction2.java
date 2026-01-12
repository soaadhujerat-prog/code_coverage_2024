package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFunction2 {

    // T1: p != 0  -> TRUE
    @Test
    public void testFunc2_pNotZero() {
        float p = 2;
        float q = 20;

        // p = p + 10 => 12
        // q = q / p  => 20/12 = 1.666...
        String result = Function2.func2(p, q);

        // format("%.2f") => 12.00 and 1.67
        assertEquals("p=12.00, q=1.67", result);
    }

    // T2: p == 0 -> FALSE (מגלה תקלה: חלוקה באפס ב-float לא זורקת חריגה אלא Infinity/NaN)
    @Test
    public void testFunc2_pIsZero_revealsBug() {
        float p = 0;
        float q = 20;

        String result = Function2.func2(p, q);

        // הפלט יהיה: "p=0.00, q=Infinity" (או NaN במקרה אחר)
        assertTrue("Bug revealed: q became Infinity/NaN due to division by zero",
                result.contains("Infinity") || result.contains("NaN"));
    }

}
