package Task1;

public class Tester {
    public static void main(String[] args){
        Animal animal = new Animal("dog", 5, 35, "Sharik");
        animal.sleep(5);
        animal.move();
        animal.toString();

        Dog dog = new Dog("mammals", 6, 24, "Reks", "German shepperd", "smooth-haired");
        dog.move();
        dog.sleep(2, 45);
        dog.toString();

    }
}
