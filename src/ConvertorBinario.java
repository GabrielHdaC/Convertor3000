public class ConvertorBinario {

    public static String decimalParaBinario(int decimal) {
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            binario.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binario.toString();
    }
}