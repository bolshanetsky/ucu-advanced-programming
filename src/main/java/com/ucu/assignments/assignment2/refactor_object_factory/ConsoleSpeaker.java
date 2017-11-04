package com.ucu.assignments.assignment2.refactor_object_factory;

import lombok.Builder;

@Builder
public class ConsoleSpeaker implements Speaker {

    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
