package task4;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Employee> byName = Comparator.comparing(Person::getName);
    public static Comparator<Employee> byHireDate = Comparator.comparing(Employee::getHireDate);
    public int compare(Employee e1, Employee e2) {
        int nameComparison = e1.getName().compareTo(e2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        return Double.compare(e1.getSalary(), e2.getSalary());
    }

}
