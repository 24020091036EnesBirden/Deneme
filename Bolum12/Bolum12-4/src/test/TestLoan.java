package test;

import tr.edu.istiklal.Loan;

public class TestLoan {
    public static void main(String[] args) {

        try {
            Loan l1 = new Loan(2.5, 5, 10000);
            System.out.println("Aylık ödeme: " + l1.getAylikOdeme());
            System.out.println("Toplam ödeme: " + l1.getToplamOdeme());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Loan l2 = new Loan(0, 5, 10000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Loan l3 = new Loan(3.5, -2, 5000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Loan l4 = new Loan(3.5, 3, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
