package test;

import tr.edu.istiklal.BinaryFormatException;

public class BinaryTest {

    public static int bin2Dec(String bin) throws BinaryFormatException {
        for (char ch : bin.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Geçersiz ikilik karakter: " + ch);
            }
        }

        int dec = 0;
        for (char ch : bin.toCharArray()) {
            dec = dec * 2 + (ch - '0');
        }
        return dec;
    }

    public static void main(String[] args) {
        test("1011");   
        test("10201");
    }

    public static void test(String bin) {
        try {
            System.out.println(bin + " -> " + bin2Dec(bin));
        } catch (BinaryFormatException e) {
            System.out.println(bin + " HATA: " + e.getMessage());
        }
    }
}
