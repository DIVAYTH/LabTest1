package task3.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import task3.exception.CountException;
import task3.exception.NameException;

import static org.junit.jupiter.api.Assertions.*;

class ObjectActionTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"тумбочки", "гвозди"})
    void objectActionNameInvalidTest(String input) {
        assertThrows(NameException.class,
                () -> ObjectAction.getInstance(input, 2, "массивные")
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"ракеты", "стрелы"})
    void objectActionNameValidTest(String input) {
        assertDoesNotThrow(() ->  ObjectAction.getInstance(input, 2, "массивные"));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8})
    void objectActionCountInvalidTest(int input) {
        assertThrows(CountException.class,
                () ->  ObjectAction.getInstance("ракеты", input, "массивные")
        );
    }

    @Test
    void objectActionCountValidTest() {
        assertDoesNotThrow(() ->  ObjectAction.getInstance("ракеты", 2, "массивные"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"легкие", "вялые"})
    void objectActionDescriptionInvalidTest(String input) {
        assertThrows(NameException.class,
                () ->  ObjectAction.getInstance("ракеты", 2, input)
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"массивные", "серебристые"})
    void objectActionDescriptionValidTest(String input) {
        assertDoesNotThrow(() ->  ObjectAction.getInstance("ракеты", 2, input));
    }
}