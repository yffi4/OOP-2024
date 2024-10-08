package Task5;

public class Student extends Person{
    private String university;
    private String faculty;

    public Student() {
    }

    public Student(String name, int age, Animal pet, String university, String faculty) {
        super(name, age, pet);
        this.university = university;
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getOccupation() {
        return  toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                "} " + super.toString();
    }
}

