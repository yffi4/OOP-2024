package task4;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }
    public void displayMessage(){
        System.out.println("Welcome to the GradeBook for " + course.getName() + "!");
    }
    public void addStudents(Student student){
        students.add(student);
    }
    public double determineClassAverage(){
        double total = 0.0;
        for (Student student : students){
            total += student.getGrade();
        }
        return total / students.size();
    }

    public void displayGradeReport() {
        if (students.isEmpty()) {
            System.out.println("No students in the gradebook.");
            return;
        }

        double highestGrade = Double.NEGATIVE_INFINITY;
        double lowestGrade = Double.POSITIVE_INFINITY;
        String highestGradeStudent = "";
        String lowestGradeStudent = "";

        for (Student student : students) {
            double grade = student.getGrade();
            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeStudent = student.getName();
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestGradeStudent = student.getName();
            }
        }

        System.out.println("Class Average: " + determineClassAverage());
        System.out.println("Highest Grade: " + highestGrade + " (Student: " + highestGradeStudent + ")");
        System.out.println("Lowest Grade: " + lowestGrade + " (Student: " + lowestGradeStudent + ")");
        outputBarChart();
    }


    public void outputBarChart() {
        int[] gradeDistribution = new int[11];

        for (Student student : students) {
            int gradeIndex = (int) (student.getGrade() / 10);
            gradeDistribution[gradeIndex]++;
        }


        System.out.println("Grade Distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public String toString() {
        return "GradeBook for " + course.getName() + " with " + students.size() + " students.";
    }
}
