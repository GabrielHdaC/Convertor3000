public class ConvertorHexadecimal {

    public static String decimalParaHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int resto = decimal % 16;
            if (resto < 10) {
                hexadecimal.insert(0, (char) ('0' + resto));
            } else {
                hexadecimal.insert(0, (char) ('A' + (resto - 10)));
            }
            decimal /= 16;
        }
        return hexadecimal.toString();
    }
}
