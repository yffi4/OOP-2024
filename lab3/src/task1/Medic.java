package task1;

public class Medic extends Character implements Healable, Defendable{
    public Medic(String name, double health) {
        super(name, health);
    }

    public void heal() {
        System.out.println(name + " heals a teammate!");
    }

    public void defend() {
        System.out.println(name + " protects a teammate with a barrier!");
    }

    public void specialAbility() {
        System.out.println(name + " uses First Aid Kit!");
    }
}
