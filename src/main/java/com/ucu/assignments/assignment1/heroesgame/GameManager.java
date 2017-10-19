package com.ucu.assignments.assignment1.heroesgame;

public class GameManager {

    // Run me
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character firstChar = factory.createCharacter();
        Character secondChar = factory.createCharacter();
        new GameManager().fight(firstChar, secondChar);
    }

    public void fight(Character one, Character two) {
        System.out.printf("Let the battle begin!" + "\nCandidate one = %s[HP: %s, PWR: %s]\nCandidate two = %s[HP: " +
                "%s, PWR: %s]", one.getName(), one.getHp(), one.getPower(), two.getName(), two.getHp(), two.getPower());

        if (one.getName().equals("HOBBIT") && one.getName().equals(two.getName())) {
            System.out.printf("\n We have two hobbits here! It's not a fight it party, let's drink and dance all day!");
            return;
        }

        if (one.getName().equals("ELF") && one.getName().equals(two.getName())) {
            System.out.printf("\nWe have two elves here! It would be very boring fight, go Home! Nothing to watch!");
            return;
        }

        while (one.isAlive() && two.isAlive()) {
            one.kick(two);

            if (two.isAlive()) {
                two.kick(one);
            }
        }

        if (one.isAlive()) {
            makeWinner(one);
        } else {
            makeWinner(two);
        }
    }

    private void makeWinner(Character ch) {
        System.out.printf("\n%s is the WINNER! HP: %s left with PWR: %s.", ch.getName(), ch.getHp(), ch.getPower());
    }
}
