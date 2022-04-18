package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Double.NaN;

public class SinTest {

    @ParameterizedTest
    @ValueSource(doubles = {4*Math.PI/6, 3*Math.PI/4,
            2*Math.PI/3, Math.PI, 7*Math.PI/6, 5*Math.PI/4, 5*Math.PI/3})
    void leftHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, Sin.funcSin(value));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI / 2, -Math.PI / 3, -Math.PI / 4,
            -Math.PI / 6, 0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2})
    void rightHalfSinTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, Sin.funcSin(value));
    }

    @ParameterizedTest
    @ValueSource(doubles = {21, 32.7777,5, 18, 0.3, 18, 1.3, 0.0001})
    void differentValuesTest(Double value) {
        double expected = new BigDecimal(Double.toString(Math.sin(value)))
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        Assertions.assertEquals(expected, Sin.funcSin(value));
    }

    @Test
    void nanArgTest() {
        Assertions.assertTrue(Double.isNaN(Sin.funcSin(NaN)));
    }
}
