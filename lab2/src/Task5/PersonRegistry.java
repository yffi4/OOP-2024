package Task5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private ArrayList<Person> people;
    public PersonRegistry(){
        this.people = new ArrayList<>();
    }
    public void addPeople(Person person){
        people.add(person);
    }
    public void removePeople(Person person){
        people.remove(person);
    }
    public List<Person> findingPeopleWithPets(){
        ArrayList<Person> peopleWithPets = new ArrayList<>();
        for (Person person : people){
            if (person.hasPet()){
                peopleWithPets.add(person);
            }
        }
        return peopleWithPets;
    }
    public List<Person> findingPeopleWithoutPets(){
        ArrayList<Person> peopleWithoutPets = new ArrayList<>();
        for (Person person : people){
            if (!person.hasPet()){
                peopleWithoutPets.add(person);
            }
        }
        return peopleWithoutPets;
    }
    public void printAllUsers(){
        for (Person person : people){
            System.out.println(person.getOccupation());
        }
    }
}
