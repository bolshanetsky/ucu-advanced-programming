package com.ucu.assignments.assignment2.write_enum.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
@AllArgsConstructor
public class Person {

    private final int age;
    private MaritalStatus maritalStatus;
    private String firstName;
    private String lastName;

    @Override
    public String toString(){
        return String.format("%s %s age:%s, %s", getFirstName(), getLastName(), getAge(), getMaritalStatus());
    }
}
