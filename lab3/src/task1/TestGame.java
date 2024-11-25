package task1;

public class TestGame {
    public static void main(String[] args){
        Character warrior = new Warrior("Aragorn", 100);
        Character mage = new Mage("Gandalf", 80);
        Character medic = new Medic("Florence", 90);
        Character dragon = new Dragon("Smaug", 200);


        warrior.getInfo();
        warrior.takeDamage(20);
        warrior.specialAbility();
        ((Attackble) warrior).attack();

        mage.getInfo();
        mage.takeDamage(10);
        mage.specialAbility();
        ((Flyable) mage).fly();
        ((Healable) mage).heal();

        medic.getInfo();
        medic.takeDamage(15);
        medic.specialAbility();
        ((Healable) medic).heal();

        dragon.getInfo();
        dragon.takeDamage(50);
        dragon.specialAbility();
        ((Flyable) dragon).fly();
        ((Attackble) dragon).attack();
    }
}
