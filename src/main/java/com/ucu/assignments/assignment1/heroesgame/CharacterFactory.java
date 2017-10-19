package com.ucu.assignments.assignment1.heroesgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {

    public Character createCharacter() {
        List<Character>  characters = new ArrayList<Character>();
        characters.add(new Hobbit());
        characters.add(new Knight());
        characters.add(new King());
        characters.add(new Elf());

        return characters.get(new Random().nextInt(characters.size()));
    }
}
