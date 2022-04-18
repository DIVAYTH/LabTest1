package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task3.exception.NameException;
import task3.model.ObjectAction;
import task3.model.Person;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {
    Person perOne;
    Person perTwo;
    ObjectAction objOne;
    ObjectAction objTwo;

    @BeforeEach
    void setUp() throws NameException {
        perOne = new Person("Форд");
        perTwo = new Person("Зафод");
        objOne = new ObjectAction("стрелы", 2, "серебристые");
        objTwo = new ObjectAction("ракеты", 2, "массивные");
    }

    @Test
    void makeActionOneTest() {
        assertEquals("Форд похлопал Зафода по плечу и показал на задний экран.",
                Action.makeActionOne(perOne, perTwo));
    }

    @Test
    void makeActionTwoTest() {
        assertEquals("На нем было отчетливо видно, как вслед кораблю движутся сквозь атмосферу 2 серебристые стрелы.",
                Action.makeActionTwo(objOne));
    }

    @Test
    void makeActionThreeTest() {
        assertEquals("Увеличение показало 2 массивные ракеты.",
                Action.makeActionThree(objTwo));
    }
}