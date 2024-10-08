package Task1.С;

import java.util.Objects;

public class Mercedes extends Car{
    private String model;

    public Mercedes(String type, String color, double volumeOfEngine, String model) {
        super(type, color, volumeOfEngine);
        this.model = model;
    }

    public Mercedes() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mercedes)) return false;
        if (!super.equals(o)) return false;
        Mercedes mercedes = (Mercedes) o;
        return Objects.equals(model, mercedes.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}
