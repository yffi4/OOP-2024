package Task5;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal temporaryPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryPet = null;
    }
    public Person(String name, int age, Animal pet) {
        this(name, age);
        if (pet != null) {
            this.pet = pet;
        }
    }
    public void assignAnimal(Animal pet){
        this.pet = pet;
    }
    public void removePet(Animal pet){
        this.pet = null;
    }
    public boolean hasPet(){
        return pet != null;
    }
        public String getOccupation(){
        return this.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getTemporaryPet() {
        return temporaryPet;
    }
    public void compatibility(Animal pet){
        if (pet instanceof Dog && this.hasPet() && this.pet instanceof Cat){
            System.out.println(this.getName() + "can't have both");
            return;
        }
        this.pet = pet;
    }
    public void setTemporaryPet(Animal temporaryPet) {
        this.temporaryPet = temporaryPet;
    }
    public boolean hasTemporaryPet(){
        return this.temporaryPet != null;
    }

    public Person() {
    }
    public void leavePetWith(Person lookingPerson){
        if (!this.hasPet()){
            System.out.println(this.getName() + "has no pet to live");
        }
        if (lookingPerson.hasTemporaryPet()){
            System.out.println(lookingPerson.getName() + "already has a temporary pet");
        }
        if (lookingPerson instanceof PhDStudent && this.pet instanceof Dog) {
            System.out.println("PhD students can’t take care of high-maintenance pets like dogs.");
            return;
        }
        lookingPerson.setTemporaryPet(pet);
        this.removePet(pet);
        System.out.println(this.getName() + " has left their pet with " + lookingPerson.getName() + ".");

    }
    public void retrievePetFrom(Person lookingPerson) {
        if (!lookingPerson.hasTemporaryPet()) {
            System.out.println(lookingPerson.getName() + " has no pet to return.");
            return;
        }

        this.assignAnimal(lookingPerson.getTemporaryPet());
        lookingPerson.removeTemporaryPet();
        System.out.println(this.getName() + " has retrieved their pet from " + lookingPerson.getName() + ".");
    }

    private void removeTemporaryPet() {
        this.temporaryPet = null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(pet, person.pet) && Objects.equals(temporaryPet, person.temporaryPet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet, temporaryPet);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pet +
                ", temporaryPets=" + temporaryPet +
                '}';
    }

}
