package com.ucu.assignments.assignment2.refactor_object_factory;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
