package task3;

import task3.model.ObjectAction;
import task3.model.Person;

public class Action {

    public static String makeActionOne(Person perOne, Person perTwo) {
        return perOne.getName() + " похлопал " + perTwo.getName() + "а" + " по плечу и показал на задний экран.";
    }

    public static String makeActionTwo(ObjectAction obj) {
        return "На нем было отчетливо видно, как вслед кораблю движутся сквозь атмосферу "
                + obj.getCount() + " " + obj.getDescription() + " " + obj.getName() + ".";
    }

    public static String makeActionThree(ObjectAction obj) {
        return "Увеличение показало " + obj.getCount() + " "
                + obj.getDescription() + " " + obj.getName() + ".";
    }
}
