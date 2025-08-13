public class ConvertorOctal {

    /**
     * Converte um número decimal para sua representação em octal.
     * @param decimal O número decimal a ser convertido.
     * @return Uma String com o valor octal.
     */
    public static String decimalParaOctal(int decimal) {
        // Usa StringBuilder para construir a string octal de forma eficiente.
        StringBuilder octal = new StringBuilder();

        // Loop principal que continua enquanto o número decimal for maior que zero.
        while (decimal > 0) {
            // O operador '%' (módulo) retorna o resto da divisão por 8.
            // Esse resto será o próximo dígito octal (de 0 a 7).
            // O '.insert(0, ...)' adiciona esse dígito no início da string, garantindo a ordem correta.
            octal.insert(0, decimal % 8);

            // O operador '/=' (divisão e atribuição) divide o número por 8 e atualiza
            // o valor de 'decimal' para a próxima iteração.
            decimal /= 8;
        }

        // Retorna a string octal final.
        return octal.toString();
    }
}