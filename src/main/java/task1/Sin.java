package task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;

public class Sin {

    public static double funcSin(double x) {
        if (isNaN(x)) {
            return NaN;
        }
        double y = 0.0;
        int sign = 1;
        double pow = x;
        double factorial = 1.0;
        for (int i = 1; i < 100; i += 2) {
            factorial *= i;
            y += sign * pow / factorial;
            factorial *= i + 1;
            sign *= -1;
            pow *= x * x;
        }
        return new BigDecimal(Double.toString(y)).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }
}
