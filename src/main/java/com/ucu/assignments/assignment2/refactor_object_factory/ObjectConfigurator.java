package com.ucu.assignments.assignment2.refactor_object_factory;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public interface ObjectConfigurator {
    <T> T configure(Class<T> type, T object);
}
