package test;

import tr.edu.istiklal.HexFormatException;

public class HexTest {

    public static int hex2Dec(String hex) throws HexFormatException {
        for (char ch : hex.toCharArray()) {
            if (!isHex(ch)) {
                throw new HexFormatException("Geçersiz karakter: " + ch);
            }
        }

        int dec = 0;
        for (char ch : hex.toCharArray()) {
            dec = dec * 16 + hexValue(ch);
        }
        return dec;
    }

    private static boolean isHex(char ch) {
        return (ch >= '0' && ch <= '9') ||
                (ch >= 'A' && ch <= 'F') ||
                (ch >= 'a' && ch <= 'f');
    }

    private static int hexValue(char ch) {
        if (ch >= '0' && ch <= '9') return ch - '0';
        if (ch >= 'A' && ch <= 'F') return 10 + (ch - 'A');
        return 10 + (ch - 'a');
    }

    public static void main(String[] args) {
        test("1A3F");
        test("12G5");
    }

    public static void test(String hex) {
        try {
            System.out.println(hex + " -> " + hex2Dec(hex));
        } catch (HexFormatException e) {
            System.out.println(hex + " HATA: " + e.getMessage());
        }
    }
}
