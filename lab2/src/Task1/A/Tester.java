package Task1.A;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Choose the number: ");
            System.out.println("1 for cylinder");
            System.out.println("2 for sphere");
            System.out.println("3 for cube");
            System.out.println("Q for quit");
            String input = scanner.nextLine();
            if (input.equals("1") || input.equals("2")){
                System.out.println("Enter the radius and height: ");
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();
                if (input.equals("1")){
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Volume: " + cylinder.volume() + ", Surface area " + cylinder.surfaceArea());
                }else {
                    Sphere sphere = new Sphere(radius, height);
                    System.out.println("Volume: " + sphere.volume() + ", Surface area " + sphere.surfaceArea());
                }

            }else if (input.equals("3")){
                System.out.println("Enter the edge: ");
                double edge = scanner.nextDouble();
                Cube cube = new Cube(edge);
                System.out.println(cube.toString());
            }else if(input.equalsIgnoreCase("Q")){
                break;
            }
        }
    }

}
