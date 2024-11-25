package task1;

public class Warrior extends Character implements Attackble, Defendable{
    public Warrior(String name, double health) {
        super(name, health);
    }
    public void attack(){
        System.out.println(name + " attacks with a sword!");

    }
    public void defend(){
        System.out.println(name + " block with a shield!");
    }
    public void specialAbility(){
        System.out.println(name + " uses an earth power!");
    }
}
