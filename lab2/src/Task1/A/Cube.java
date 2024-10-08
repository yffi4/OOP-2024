package Task1.A;

public class Cube extends Shape3D{
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public Cube() {
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

    @Override
    public double surfaceArea() {
        return 6 * edge * edge;
    }
}
