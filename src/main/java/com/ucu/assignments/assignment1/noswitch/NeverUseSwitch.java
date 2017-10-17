package com.ucu.assignments.assignment1.noswitch;


public class NeverUseSwitch {

    // TASK
    public enum AnimalType {
        DOG,
        CAT,
        COW,
        BATMAN
    }

    // Switch statement which should be substituted
    public void doWork(AnimalType animalType) {
        switch (animalType) {
            case CAT:
                System.out.println("MEAOWWWWW!");
                break;
            case DOG:
                System.out.println("WOOOFFFF!");
                break;
            case COW:
                System.out.printf("MOOOO!");
                break;
            case BATMAN:
                System.out.printf("KARAMBAAAAA!");
                break;
        }
    }

    // SOLUTION

    /**
     * For substituting switch we can use more object oriented way like inheritance and interfaces.
     * All classes are written here just for the sake of readability.
     *
     * Whenever we need to doWork we will call respected method of the class instance.
     */
    interface Creature {
        void doWork();
    }

    class Batman implements Creature {
        public void doWork() {
            System.out.printf("KARAMBAAAAA!");
        }
    }

    class Cat implements Creature {
        public void doWork() {
            System.out.println("MEAOWWWWW!");
        }
    }

    class Dog implements Creature {
        public void doWork() {
            System.out.println("WOOOFFFF!");
        }
    }

    class Cow implements Creature {
        public void doWork() {
            System.out.printf("MOOOO!");
        }
    }
}
