package code_coverage_4.code_coverage_4;

public class Function3 {

    public static String func3(int x) {
        int result = 10;
        if (x > 0) {
            result = result / x;
        }
        result = result / 0;
        return String.format("result=%d", result);
    }
}
