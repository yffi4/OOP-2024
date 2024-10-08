package Task5;

public class PhDStudent extends Person {
    private String supervisor;

    public PhDStudent(String name, int age, Animal pet, String supervisor) {
        super(name, age, pet instanceof Dog ? null : pet);
        this.supervisor = supervisor;
    }

    public PhDStudent(String name, int age, String supervisor) {
        super(name, age);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public void assignAnimal(Animal pet) {
        if (pet instanceof Dog){
            System.out.println("PhDStudent shouldn't have dog");
        }else {
            super.assignAnimal(pet);
        }
    }

    @Override
    public String getOccupation() {
        return toString();
    }

    @Override
    public String toString() {
        return "PhDStudent{" +
                "supervisor='" + supervisor + '\'' +
                "} " + super.toString();
    }
}