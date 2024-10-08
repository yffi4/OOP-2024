package Task1.С;

import java.util.Objects;

public class Car {
    private String type;
    private String color;
    private double volumeOfEngine;

    public Car(String type, String color, double volumeOfEngine) {
        this.type = type;
        this.color = color;
        this.volumeOfEngine = volumeOfEngine;
    }
    public Car(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", volumeOfEngine=" + volumeOfEngine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(volumeOfEngine, car.volumeOfEngine) == 0 && Objects.equals(type, car.type) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, volumeOfEngine);
    }

}
