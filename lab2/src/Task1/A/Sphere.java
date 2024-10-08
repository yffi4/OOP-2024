package Task1.A;

public class Sphere extends Shape3D{
    private double radius;
    private double height;

    public Sphere(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Sphere() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
