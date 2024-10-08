import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = "";
        for (int i = str1.length() - 1; i>= 0; i--){
            str2 += str1.charAt(i);
        }
        if (str2.equals(str1)){
            System.out.println("isPalindrome");
        }else{
            System.out.println("noPalindrome");
        }
    }
}
