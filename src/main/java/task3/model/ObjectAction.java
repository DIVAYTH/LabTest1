package task3.model;

import task3.exception.CountException;
import task3.exception.NameException;

public class ObjectAction {
    private final String name;
    private final int count;
    private final String description;

    public ObjectAction(String name, int count, String description) {
        this.name = name;
        this.count = count;
        this.description = description;
    }

    public static ObjectAction getInstance(String name, int count, String description) throws NameException {
        if (name != null && (name.equals("ракеты") || name.equals("стрелы"))) {
            if (count == 2) {
                if (description != null && (description.equals("серебристые") || description.equals("массивные"))) {
                    return new ObjectAction(name, count, description);
                } else {
                    throw new NameException("Неправильное название");
                }
            } else {
                throw new CountException("Неправильное количество");
            }
        } else {
            throw new NameException("Неправильное имя");
        }
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String getDescription() {
        return description;
    }
}
