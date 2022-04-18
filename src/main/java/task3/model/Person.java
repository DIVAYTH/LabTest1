package task3.model;

import task3.exception.NameException;

public class Person {
    private String name;

    public Person(String name) throws NameException {
        if (name != null && (name.equals("Форд") || name.equals("Зафод"))) {
            this.name = name;
        } else {
            throw new NameException("Неправильное имя");
        }
    }

    public String getName() {
        return name;
    }
}
