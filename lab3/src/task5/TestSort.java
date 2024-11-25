package task5;

import java.util.Arrays;
import java.util.Date;
import time.Time;
import task4.Employee;
public class TestSort {
    public static void main(String[] args) {

        System.out.println("Testing Chocolate sorting:");
        Chocolate[] chocolates = {
                new Chocolate(50.0, "Twix"),
                new Chocolate(30.0, "Mars"),
                new Chocolate(45.0, "Snickers")
        };

        System.out.println("Before sorting: " + Arrays.toString(chocolates));
        Sort.selectionSort(chocolates);
        System.out.println("After sorting: " + Arrays.toString(chocolates));
        System.out.println();


        System.out.println("Testing Time sorting:");
        Time[] times = {
                new Time(14, 30, 0),  // 2:30:00 PM
                new Time(9, 15, 0),   // 9:15:00 AM
                new Time(18, 45, 30)  // 6:45:30 PM
        };

        System.out.println("Before sorting:");
        for (Time time : times) {
            System.out.println(time.toUniversal());
        }

        Sort.selectionSort(times);

        System.out.println("After sorting:");
        for (Time time : times) {
            System.out.println(time.toUniversal());
        }
        System.out.println();


        System.out.println("Testing Employee sorting:");
        Employee[] employees = {
                new Employee("John", 50000.0, new Date(), "IN001"),
                new Employee("Alice", 75000.0, new Date(), "IN002"),
                new Employee("Bob", 60000.0, new Date(), "IN003")
        };

        System.out.println("Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ": $" + emp.getSalary());
        }

        Sort.selectionSort(employees);

        System.out.println("After sorting:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ": $" + emp.getSalary());
        }


        System.out.println("\nTesting Merge Sort with Chocolates:");
        Chocolate[] chocolates2 = {
                new Chocolate(50.0, "Twix"),
                new Chocolate(30.0, "Mars"),
                new Chocolate(45.0, "Snickers"),
                new Chocolate(35.0, "Bounty")
        };

        System.out.println("Before merge sort: " + Arrays.toString(chocolates2));
        Sort.mergeSort(chocolates2);
        System.out.println("After merge sort: " + Arrays.toString(chocolates2));
    }
}
