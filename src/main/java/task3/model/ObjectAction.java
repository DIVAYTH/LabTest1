package task3.model;

import task3.exception.CountException;
import task3.exception.NameException;

public class ObjectAction {
    private String name;
    private int count;
    private String description;

    public ObjectAction(String name, int count, String description) throws CountException, NameException {
        if (name != null && (name.equals("ракеты") || name.equals("стрелы"))) {
            this.name = name;
        } else {
            throw new NameException("Неправильное имя");
        }

        if (count != 2) {
            throw new CountException("Неправильное количество");
        } else {
            this.count = count;
        }

        if (description != null && (description.equals("серебристые") || description.equals("массивные"))) {
            this.description = description;
        } else {
            throw new NameException("Неправильное название");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
