package test;

import tr.edu.istiklal.HexConverter;

import java.util.Scanner;

public class TestHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Onaltılık sayı gir: ");
        String hex = input.nextLine();

        try {
            int decimal = HexConverter.hex2Dec(hex);
            System.out.println("Ondalık karşılığı: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Onaltılık sayı değil");
        }
    }
}
