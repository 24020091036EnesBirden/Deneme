package test;
import tr.edu.istiklal.*;
public class TestFraction {
    public static void main(String[] args) {

        try {
            Fraction f1 = new Fraction(3, 4);
            System.out.println("tr.edu.istiklal.Fraction oluşturuldu: 3/4");
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }

        try {
            Fraction f2 = new Fraction(5, 0);
            System.out.println("tr.edu.istiklal.Fraction oluşturuldu: 5/0");
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
