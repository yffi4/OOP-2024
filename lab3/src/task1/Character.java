package task1;

public abstract class Character {
    protected String name;
    protected double health;

    public Character(){

    }

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
    public void takeDamage(double damage){
        health -= damage;
        if (health <= 0){
            health = 0;
            System.out.println("Character dead");
        }
    }
    public abstract void specialAbility();
}
