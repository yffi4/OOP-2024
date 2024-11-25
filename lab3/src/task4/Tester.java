package task4;
import java.util.*;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee("Alice", 55000, new Date(120, 1, 1), "INS123");
        Employee e2 = new Employee("Alice", 50000, new Date(121, 2, 15), "INS124");
        Employee e3 = new Employee("Charlie", 45000, new Date(122, 5, 10), "INS125");

        Manager m1 = new Manager("David", 70000, new Date(119, 0, 1), "INS126", 10000);
        Manager m2 = new Manager("Eve", 70000, new Date(120, 3, 20), "INS127", 15000);

        m1.add(e1);
        m1.add(e2);
        m2.add(e3);

        // === Тестирование toString ===
        System.out.println("=== Тестирование toString() ===");
        System.out.println(e1);
        System.out.println(m1);

        // === Тестирование equals ===
        System.out.println("\n=== Тестирование equals() ===");
        Employee e4 = new Employee("Alice", 50000, new Date(120, 1, 1), "INS123");
        System.out.println("e1.equals(e4): " + e1.equals(e4));
        System.out.println("m1.equals(m2): " + m1.equals(m2));

        // === Тестирование clone ===
        System.out.println("\n=== Тестирование clone() ===");

        Manager m1CloneTest = (Manager) m1.clone();
        System.out.println("Оригинал до изменений:");
        System.out.println("m1: " + m1);
        System.out.println("Клон: " + m1CloneTest);

        m1CloneTest.add(new Employee("Eve", 60000, new Date(124, 0, 1), "INS999"));

        System.out.println("\nПосле изменений клона:");
        System.out.println("Оригинал m1: " + m1);
        System.out.println("Клон m1CloneTest: " + m1CloneTest);

        System.out.println("\nПроверка на глубокое клонирование (разные ссылки на команды):");
        System.out.println("m1.team == m1CloneTest.team: " + (m1.getTeams() == m1CloneTest.getTeams()));

        // === Тестирование compareTo ===
        System.out.println("\n=== Тестирование compareTo ===");
        System.out.println("m1.compareTo(m2): " + m1.compareTo(m2));
        System.out.println("e1.compareTo(e2): " + e1.compareTo(e2));


        System.out.println("\n=== Тестирование компараторов ===");
        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2, e3, m1, m2));


        employees.sort(Comparators.byName);
        System.out.println("\nСортировка по имени:");
        for (Employee e : employees) {
            System.out.printf("%s (%s)%n", e.getName(), e.getClass().getSimpleName());
        }


        employees.sort(Comparators.byHireDate);
        System.out.println("\nСортировка по дате приема:");
        for (Employee e : employees) {
            System.out.printf("%s - %s%n", e.getName(), e.getHireDate());
        }

        Comparators comparators = new Comparators();
        System.out.println(comparators.compare(e1, e2));
        Collections.sort(employees);
        System.out.println("\nСортировка по зарплате:");
        for (Employee e : employees) {
            System.out.printf("%s: %.2f%n", e.getName(), e.getSalary());
        }
    }
}
