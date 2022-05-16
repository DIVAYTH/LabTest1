package task3.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import task3.exception.NameException;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Вадим", "Илья"})
    void personNameInvalidTest(String input) {
        assertThrows(NameException.class,
                () -> Person.getInstance(input)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"Форд", "Зафод"})
    void personNameValidTest(String input) {
        assertDoesNotThrow(() -> Person.getInstance(input));
    }
}