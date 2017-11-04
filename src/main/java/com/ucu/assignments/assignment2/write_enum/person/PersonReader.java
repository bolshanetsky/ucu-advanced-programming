package com.ucu.assignments.assignment2.write_enum.person;

import java.util.ArrayList;
import java.util.List;

public class PersonReader {

    private final PersonService personService;
    private List<Person> personsRead;

    public PersonReader(PersonService personService) {
        this.personService = personService;
        this.personsRead = new ArrayList<>();
    }

    public void readPerson() {
        Person person = personService.getPerson();
        readPerson(person);
    }

    public void readPerson(Person person) {
        if (!personsRead.isEmpty() && person.equals(personsRead.get(personsRead.size() - 1))) {
            System.out.println(person.getLastName() + ", You again??");
        } else {
            System.out.println(person.toString() + "  Marital dbCode = " + person.getMaritalStatus().getDbCode());
        }
        personsRead.add(person);
    }
}
