package pl.accenture.model;

import java.util.function.Predicate;

public class Person {
    private int age;
    public  int getAge() { return age; }

    private boolean isDriver;
    public  boolean isDriver() { return isDriver; }

    private boolean isPregnant;
    public  boolean isPregnant() { return isPregnant; }

    static public Predicate<Person> canDrinkPredicate = p -> !p.isPregnant() && !p.isDriver() && p.getAge() >= 18;

    public Person(int age, boolean isDriving, boolean isPregnant) {
        this.age = age;
        this.isDriver = isDriving;
        this.isPregnant = isPregnant;
    }
}
