public class Example1 {
    public static void main(String[] args)
    {
        int denominator, numerator, ratio;


        numerator   = 5;
        denominator = 0;
        try {
            ratio = numerator / denominator;
            System.out.println("The answer is: " + ratio);
        }catch  (ArithmeticException e){
            System.out.println("you can't divide by zero");
            e.printStackTrace();
        }
        System.out.println("Done."); // Don't move this line
    }
}
