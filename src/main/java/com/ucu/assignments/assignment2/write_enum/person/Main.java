package com.ucu.assignments.assignment2.write_enum.person;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public class Main {

    private final static DataFactory dataFactory = new DataFactory();

    @SneakyThrows
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        PersonReader personReader = new PersonReader(personService);

        // Test default behavior
//        while (true) {
//            personReader.readPerson();
//
//            Thread.sleep(100);
//        }

        // Test same person behavior
        Person person = new Person(dataFactory.getNumberBetween(0, 100),
                MaritalStatus.findByDbCode(dataFactory.getNumberBetween(1, 4)),
                dataFactory.getFirstName(),
                dataFactory.getLastName());
        while (true) {
            personReader.readPerson(person);
            personReader.readPerson(person);
            Thread.sleep(1000);
        }
    }
}
