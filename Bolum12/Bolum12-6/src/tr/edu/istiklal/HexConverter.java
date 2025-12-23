package tr.edu.istiklal;

public class HexConverter {
    public static int hex2Dec(String hex) {
        hex = hex.toUpperCase();

        for (char c : hex.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                throw new NumberFormatException("Geçersiz onaltılık karakter");
            }
        }

        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value = (c >= 'A') ? (c - 'A' + 10) : (c - '0');
            decimal = decimal * 16 + value;
        }
        return decimal;
    }
}
