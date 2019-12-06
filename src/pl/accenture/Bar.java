package pl.accenture;

import pl.accenture.model.Person;

public class Bar {

    public static void main(String[] args) {
        Person underage = new Person(12,false,false);
        Person pregnant = new Person(21,false,true);
        Person driver   = new Person(30,true,false);
        Person student  = new Person(22,false,false);

        serveDrink(underage);
        serveDrink(pregnant);
        serveDrink(driver);
        serveDrink(student);

    }

    static void serveDrink(Person p) {
        String out = (Person.canDrinkPredicate.test(p)) ? "Milej zabawy" : "Bar zamkniety";
        System.out.println(out);
    }
}
