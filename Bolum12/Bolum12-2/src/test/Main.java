package test;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[ ] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[ ] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        try {
            System.out.println(months[a-1]+" "+dom[a-1]);

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
    }

}
