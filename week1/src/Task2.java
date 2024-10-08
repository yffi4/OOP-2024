import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int area = Math.abs(num * num);
        int perimeter = 4 * num;
        double diagonal = num * Math.sqrt(2);
        System.out.println("Area: " + area + "; Perimeter: " + perimeter + "; Diagonal: " + diagonal);
    }
}
