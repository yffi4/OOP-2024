package task2;

public class Bicycle implements Moveable{
    private int speed;
    public Bicycle(){
        this.speed = 5;
    }

    @Override
    public void move() {
        System.out.println("The bicycle is moving at " + speed + "km/h");
    }
}
