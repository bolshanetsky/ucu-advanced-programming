package com.ucu.assignments.assignment2.refactor_object_factory;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public class InjectRandomIntConfigurator implements ObjectConfigurator {

    private Random random = new Random();

    @Override
    @SneakyThrows
    public <T> T configure(Class<T> type, T o) {

        Field[] fields = type.getDeclaredFields();

        for (java.lang.reflect.Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min(); int max = annotation.max();
                int randomIntValue = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(o, randomIntValue);
            }
        }

        return o;
    }
}
