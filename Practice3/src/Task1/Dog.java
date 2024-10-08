package Task1;

public class Dog extends Animal{
    private String breed;
    private String wool;



    public Dog(String type, int age, int weight, String name, String breed, String wool) {
        super(type, age, weight, name);
        this.breed = breed;
        this.wool = wool;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String isWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }


    public void sleep(int hours, int minutes) {
        System.out.println(breed + " is sleeping for " + hours + " hours and" + minutes + " minutes");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", wool='" + wool + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public void move(){
        System.out.println("Dog with name: " + name  + " is moving");
    }
}
