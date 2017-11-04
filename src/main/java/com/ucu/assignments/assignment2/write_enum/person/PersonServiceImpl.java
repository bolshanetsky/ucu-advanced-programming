package com.ucu.assignments.assignment2.write_enum.person;

import org.fluttercode.datafactory.impl.DataFactory;

public class PersonServiceImpl implements PersonService {

    private final static DataFactory dataFactory = new DataFactory();

    @Override
    public Person getPerson() {
        return new Person(dataFactory.getNumberBetween(0, 100),
                MaritalStatus.findByDbCode(dataFactory.getNumberBetween(1, 4)),
                dataFactory.getFirstName(),
                dataFactory.getLastName());
    }

    @Override
    public void savePerson(Person person) {
        System.out.println("saving... " + person);
    }
}
