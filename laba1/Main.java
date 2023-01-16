import oop_laba1.*;

import java.util.Comparator;

public class Main {

    public static void printPeople(People people){
        for (Person person : people.getPersons()){
            System.out.printf("%s\t%s\t%s\n", person.getAge(), person.getHeight(), person.getName());
        }
    }
    public static void main(String[] args) {
        People people = new People(12);

        people.getPersons().add(new Person(18, 180, "Petr"));
        people.getPersons().add(new Person(25, 160, "Oleg"));
        people.getPersons().add(new Person(30, 175, "Alex"));
        people.getPersons().add(new Person(15, 190, "Angelina"));
        people.getPersons().add(new Person(45, 155, "Vlad"));
        people.getPersons().add(new Person(81, 167, "Victor"));
        people.getPersons().add(new Person(44, 193, "Dasha"));
        people.getPersons().add(new Person(12, 200, "Misha"));
        people.getPersons().add(new Person(25, 178, "Sasha"));
        people.getPersons().add(new Person(63, 159, "Pasha"));
        people.getPersons().add(new Person(52, 170, "Ekaterina"));
        people.getPersons().add(new Person(26, 164, "Alexandra"));

        System.out.println("Input data");
        printPeople(people);
        System.out.println();

        System.out.println("Sort by height");
        people.sortByHeight();
        printPeople(people);
        System.out.println();

        System.out.println("Sort by name");
        people.sortByName();
        printPeople(people);
        System.out.println();

        System.out.println("Sort by age");
        people.sortByAge();
        printPeople(people);

        people.saveToFile();
    }
}