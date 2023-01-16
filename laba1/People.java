package oop_laba1;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class People {
    private ArrayList<Person> persons;

    public People(int ArraySize) {
        persons = new ArrayList<Person>(ArraySize);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void sortByName() {
        persons.sort(Comparator.comparing(Person::getName));
    }

    public void sortByAge() {
        persons.sort(Comparator.comparing(Person::getAge));
    }

    public void sortByHeight() {
        persons.sort(Comparator.comparing(Person::getHeight));
    }

    public void saveToFile() {
        try {
            String str = "Name Age Height\n";
            FileWriter writer = new FileWriter("people.txt");
            writer.write(str);
            for (Person person : persons){
                writer.write(person.stringize());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}