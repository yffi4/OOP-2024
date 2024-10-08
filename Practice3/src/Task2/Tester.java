package Task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add a new person");
            System.out.println("2. Print info of all persons");
            System.out.println("3. Exit");
            int variance = scanner.nextInt();
            scanner.nextLine();

            switch (variance) {
                case 1:
                    System.out.println("Enter 1 for Student or 2 for Staff: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter address: ");
                    String address = scanner.nextLine();

                    if (type == 1) {

                        System.out.println("Enter program: ");
                        String program = scanner.nextLine();

                        System.out.println("Enter year: ");
                        int year = scanner.nextInt();

                        System.out.println("Enter fee: ");
                        double fee = scanner.nextDouble();

                        people.add(new Student(name, address, program, year, fee));
                    } else if (type == 2) {

                        System.out.println("Enter school: ");
                        String school = scanner.nextLine();

                        System.out.println("Enter pay: ");
                        double pay = scanner.nextDouble();

                        people.add(new Staff(name, address, school, pay));
                    }
                    break;

                case 2:

                    for (Person person : people) {
                        System.out.println(person);
                        if (person instanceof Staff){

                            ((Staff)person).getSchool();
                        }
                    }
                    break;

                case 3:

                    scanner.close();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
