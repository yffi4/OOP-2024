package task1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        while(true){

            System.out.println("Enter number (Q to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            double value = Double.parseDouble(input);
            data.addData(value);
        }
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());
        scanner.close();
    }
}
