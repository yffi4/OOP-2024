package student;

public class Student {
    private Long id;
    private String name;
    private int yearOfStudy;
    private double grade;
    public Student(String name, double grade) {

        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int incrementYearOfStudy(){
        yearOfStudy++;
        return yearOfStudy;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "name='" + name + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", id=" + id +
                '}';
    }
}
