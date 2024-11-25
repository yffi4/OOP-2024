package task2;

public class Car implements Acceleratable{
    private int speed;
    public Car(){
        this.speed = 5;
    }

    @Override
    public void move() {
        System.out.println("The car is move at " + speed + "km/h");
    }

    @Override
    public void accelerate() {
        speed += 40;
        System.out.println("The car is accelerating. Now speed equals " + speed + "km/h");
    }
}
