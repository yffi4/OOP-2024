package Task5;

public class Tester {
    public static void main(String[] args) {
        Person grisha = new Employee("Grisha", 30, "Engineer", "Director");
        Person masha = new PhDStudent("Masha", 26, new Cat("Musya", 4), "Pakita");


        // Create instances of animals
        Animal rizhik = new Cat("Rizhik", 5);
        Animal graf = new Dog("Graf", 4);


        grisha.assignAnimal(rizhik);
        grisha.assignAnimal(graf);

        PersonRegistry registry = new PersonRegistry();
        registry.addPeople(grisha);
        registry.addPeople(masha);

        grisha.leavePetWith(masha);

        registry.printAllUsers();

        grisha.retrievePetFrom(masha);

        registry.printAllUsers();
    }
}

