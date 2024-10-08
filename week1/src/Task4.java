import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (int) (Math.pow(b, 2) - 4 * a * c);
        double x1 = 0;
        double x2 = 0;

        if (d < 0){

            System.out.println("D is negative");

        } else if (d == 0) {
            x1 = (double) -b / 2 * a;
            System.out.println(x1);
        }else{
            x1 = -b + Math.sqrt(d)/ 2 * a;
            x2 = -b - Math.sqrt(d) / 2 * a;
            System.out.println(x1 + " " + x2);
        }
    }
}
