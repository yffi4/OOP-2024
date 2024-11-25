package task4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double salary;
    private Date hireDate;
    private String insuranseNumber;

    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, double salary, Date hireDate, String insuranseNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranseNumber = insuranseNumber;
    }

    public Employee(double salary, Date hireDate, String insuranseNumber) {
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranseNumber = insuranseNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setInsuranseNumber(String insuranseNumber) {
        this.insuranseNumber = insuranseNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranseNumber() {
        return insuranseNumber;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranseNumber='" + insuranseNumber + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(hireDate, employee.hireDate) && Objects.equals(insuranseNumber, employee.insuranseNumber);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.setName(this.getName());
        clone.setSalary(this.getSalary());
        clone.setHireDate(this.getHireDate());
        clone.setInsuranseNumber(this.getInsuranseNumber());
        return clone;
    }
}
