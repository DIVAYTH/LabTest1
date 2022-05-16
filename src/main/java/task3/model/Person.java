package task3.model;

import task3.exception.NameException;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public static Person getInstance(String name) throws NameException {
        if (name != null && (name.equals("Форд") || name.equals("Зафод"))) {
            return new Person(name);
        } else {
            throw new NameException("Неправильное имя");
        }
    }

    public String getName() {
        return name;
    }
}
