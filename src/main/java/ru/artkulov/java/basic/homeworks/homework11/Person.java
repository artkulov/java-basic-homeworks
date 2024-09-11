package ru.artkulov.java.basic.homeworks.homework11;

public class Person {
    private final String name;
    private final Position position;
    private final Long id;

    public Person(Long id, String name) {
        this(id, name, null);
    }

    public Person(Long id, String name, Position position) {
        if (id < 0) {
            throw new IllegalArgumentException("Идентификатор не может быть меньше нуля: " + id);
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя имеет некорректное значение: " + name);
        }
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }
}
