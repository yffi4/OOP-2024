package Task5;

public class Employee extends Person{
    private String profession;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String name, int age, Animal pet, String profession, String jobTitle) {
        super(name, age, pet);
        this.profession = profession;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, String profession, String jobTitle) {
        super(name, age);
        this.profession = profession;
        this.jobTitle = jobTitle;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "profession='" + profession + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                "} " + super.toString();
    }

}
