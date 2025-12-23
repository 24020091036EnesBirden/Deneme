package tr.edu.istiklal;

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {

        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1) {

            throw new IllegalTriangleException("Geçersiz üçgen kenarları!");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
