import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        int percent = scanner.nextInt();
        int result =  balance + (balance * percent /100);
        System.out.println("Result: " + result);
    }
}
