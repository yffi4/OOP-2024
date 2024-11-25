package task5;

import java.util.Objects;

public class Chocolate implements Comparable<Chocolate>{
    private double weight;
    private String name;

    public Chocolate() {
    }

    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chocolate chocolate)) return false;
        return Double.compare(weight, chocolate.weight) == 0 && Objects.equals(name, chocolate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public int compareTo(Chocolate o) {
        return Double.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
