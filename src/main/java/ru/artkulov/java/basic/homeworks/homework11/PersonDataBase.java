package ru.artkulov.java.basic.homeworks.homework11;

import java.util.*;

public class PersonDataBase {
    private final Map<Long, Person> persons = new HashMap<>();
    ;
    static final Set<Position> MANAGER_POSITIONS = Set.of(
            Position.MANAGER,
            Position.DIRECTOR,
            Position.BRANCH_DIRECTOR,
            Position.SENIOR_MANAGER
    );

    public Person findById(Long id) {
        if (id == null) return null;
        return persons.get(id);


    }

    public void add(Person person) {
        if (person != null) {
            persons.put(person.getId(), person);
        }
    }

    public boolean isManager(Person person) {
        return person != null
                && person.getPosition() != null
                && MANAGER_POSITIONS.contains(person.getPosition());
    }

    public boolean isEmployee(Long id) {
        return id != null
                && persons.containsKey(id)
                && !isManager(persons.get(id));
    }
}
