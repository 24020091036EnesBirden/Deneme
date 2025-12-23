package test;
import tr.edu.istiklal.*;
public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(3, 4, 10);
            System.out.println("Üçgen oluşturuldu.");
        } catch (IllegalTriangleException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            Triangle t2 = new Triangle(3, 4, 5);
            System.out.println("Geçerli üçgen oluşturuldu.");
        } catch (IllegalTriangleException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
