package task4;
import student.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {

        List<String> prerequisites = new ArrayList<>();
        prerequisites.add("Math 1010");
        Course course = new Course("Introduction to Java", "Java programming fundamentals", 3, prerequisites);


        GradeBook gradeBook = new GradeBook(course);


        gradeBook.displayMessage();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student names and grades. Type 'done' when finished.");
        while (true) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter grade for " + name + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();


            Student student = new Student(name, grade);
            gradeBook.addStudents(student);
        }


        gradeBook.displayGradeReport();

        
        scanner.close();
    }
}

