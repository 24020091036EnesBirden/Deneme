package test;

import java.util.Scanner;
public class CalculatorWithExeption{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        String s1 = input.nextLine();
        System.out.println("Enter operator(+,-,*,/ ): ");
        String op = input.nextLine();
        System.out.println("Enter second operand: ");
        String s2 = input.nextLine();
        try {
            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(s2);
            double result = 0;
            if (op.equals("+")) {
                result = num1 + num2;

            }
            else if (op.equals("-")) {
                result = num1 - num2;

            }
            else if (op.equals("*")) {
                result = num1 * num2;

            }
            else if (op.equals("/")) {
                result = num1 / num2;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
            System.out.println("The result is: " + result);


        }
        catch (NumberFormatException e) {
            System.out.println("Error: Wrong operand type (non-numeric value entered");
        }
    }
}
