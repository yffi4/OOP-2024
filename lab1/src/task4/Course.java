package task4;

import java.util.List;

public class Course {
    private String name;
    private String descriptions;
    private int credits;
    List<String> prerequisites;

    public Course(String name, String descriptions, int credits, List<String> prerequisites) {
        this.name = name;
        this.descriptions = descriptions;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", credits=" + credits +
                ", prerequisites=" + prerequisites +
                '}';
    }
}
