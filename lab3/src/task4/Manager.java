package task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee{
    private Vector<Employee> teams;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranseNumber, double bonus) {
        super(name, salary, hireDate, insuranseNumber);
        this.bonus = bonus;
        this.teams = new Vector<>();
    }
    public void add(Employee employee){
        teams.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public Vector<Employee> getTeams() {
        return teams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(bonus, manager.bonus) == 0 && Objects.equals(teams, manager.teams);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            int salaryComparison = Double.compare(this.getSalary(), otherManager.getSalary());
            if (salaryComparison != 0) {
                return salaryComparison;
            }
            return Double.compare(this.bonus, otherManager.bonus);
        }
        return super.compareTo(other);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.teams = new Vector<>();
        for (Employee e : this.teams) {
            cloned.teams.add(e.clone());
        }
        return cloned;

    }

    @Override
    public String toString() {
        return "Manager{" +
                "teams=" + teams +
                ", bonus=" + bonus +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
