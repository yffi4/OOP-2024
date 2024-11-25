package task1;

public class Dragon extends Character implements Attackble, Flyable, Defendable{
    public Dragon(String name, int health) {
        super(name, health);
    }

    public void attack() {
        System.out.println(name + " breathes fire!");
    }

    public void fly() {
        System.out.println(name + " soars through the sky!");
    }

    public void defend() {
        System.out.println(name + " scales deflect the attack!");
    }

    public void specialAbility() {
        System.out.println(name + " uses Dragon Roar!");
    }
}
