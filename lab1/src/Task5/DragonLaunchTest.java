package Task5;


import java.util.Vector;

public class DragonLaunchTest {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();

        DragonLaunch dragonLaunch = new DragonLaunch(people);

        dragonLaunch.kidnap(new Person("Vlad", Gender.G));
        dragonLaunch.kidnap(new Person("Daniil", Gender.B));
        dragonLaunch.kidnap(new Person("Aru", Gender.G));
        dragonLaunch.kidnap(new Person("Margo", Gender.G));

        boolean result = dragonLaunch.canEscape();

        if (result) {
            System.out.println("The dragon will have lunch.");
        } else {
            System.out.println("No one to eat");
        }


    }
}