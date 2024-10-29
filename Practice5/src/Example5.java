import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example5 {
    public static void main(String[] args)
    {
        double                 leftOperand, result, rightOperand;
        String                 leftString, operator, rightString;

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] expressions = input.split("\\s+");
        for (String expression : expressions) {
            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);


            try {
                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid number for left operand in expression: " + leftString);
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid number for right operand in expression: " + rightString);
                    continue;
                }

                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        if (rightOperand != 0) {
                            result = leftOperand / rightOperand;
                        } else {
                            System.out.println("Division by zero is not allowed in expression: " + expression);
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Unknown operator in expression " + expression);
                        continue;
                }

                System.out.println("Result of " + expression + ":" + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in expression" + expression);
            }

        }
    }
}
