package Task1.A;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();
    public String toString(){
        return "Volume: " + volume() + ", Surface area " + surfaceArea();
    }
}
