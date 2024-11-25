package task1;

public class Mage extends Character implements Attackble, Flyable, Healable{
    public Mage(String name, double health) {
        super(name, health);
    }
    public void attack() {
        System.out.println(name + " casts a fireball!");
    }

    public void heal() {
        System.out.println(name + " casts a healing spell!");
    }

    public void fly() {
        System.out.println(name + " levitates above the ground!");
    }

    public void specialAbility() {
        System.out.println(name + " uses Arcane Explosion!");
    }
}
