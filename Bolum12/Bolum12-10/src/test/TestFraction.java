package test;

import tr.edu.istiklal.*;


public class TestFraction {
    public static void main(String[] args) {

        test(3, 4);
        test(5, 0);
        test(10, 2);
    }

    private static void test(int n, int d) {
        try {
            Fraction f = new Fraction(n, d);
            System.out.println("Oluşturuldu: " + f);
        }
        catch (NullDenominatorException e) {
            System.out.println("HATA: " + e.getMessage());
        }
    }
}
