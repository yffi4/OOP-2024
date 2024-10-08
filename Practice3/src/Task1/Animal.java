package Task1;

public abstract class Animal {
    protected String type;
    protected int age;
    protected int weight;
    protected String name;

    public Animal() {
    }

    public Animal(String type, int age, int weight, String name) {
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(int hours){
        System.out.println(name + " is sleeping for " + hours + " hours.");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public abstract void voice();
    public void voice(int n){
        System.out.println("Animal doing voice for " + n + " times");
        for (int i =0; i < n; i++){
            voice();
        }
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
