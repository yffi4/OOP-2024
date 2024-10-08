package Task1.С;
import java.util.HashSet;
public class Tester {
    public static void main(String[] args){
        Car car1 = new Car("Sedan", "Black", 2.0);
        Car car2 = new Car("Sedan", "Black", 2.0);
        Car car3 = new Car("SUV", "White", 3.5);


        Mercedes mercedes1 = new Mercedes("Sedan", "Black", 3.0, "C-Class");
        Mercedes mercedes2 = new Mercedes("Sedan", "Black", 3.0, "C-Class");
        Mercedes mercedes3 = new Mercedes("SUV", "Silver", 4.0, "GLE");


        HashSet<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(mercedes1);
        carSet.add(mercedes2);
        carSet.add(mercedes3);


        System.out.println("Объекты в HashSet:");
        for (Car car : carSet) {
            System.out.println(car);
        }


        System.out.println("\nПроверка equals():");
        System.out.println("car1 и car2 равны? " + car1.equals(car2));
        System.out.println("mercedes1 и mercedes2 равны? " + mercedes1.equals(mercedes2));
        System.out.println("mercedes1 и car1 равны? " + mercedes1.equals(car1));
    }
}
