import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertor 3000");
        System.out.println("-------------------------------\n");

        System.out.println("Escolha uma das opções a baixo: ");
        System.out.println(" [1] Binario");
        System.out.println(" [2] Octal");
        System.out.println(" [3] Hexadecimal");
        System.out.println(" [0] Sair\n");
        
        System.out.print("     Opção: ");
        int opcao = scanner.nextInt();

        System.out.println("-------------------------------\n");

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.print("Digite um número decimal: ");
                    int decimal = scanner.nextInt();
                    String binario = ConvertorBinario.decimalParaBinario(decimal);
                    System.out.println("Número em binário: " + binario);
                    break;
                case 2:
                    System.out.print("Digite um número decimal: ");
                    decimal = scanner.nextInt();
                    String octal = ConvertorOctal.decimalParaOctal(decimal);
                    System.out.println("Número em octal: " + octal);
                    break;
                case 3:
                    System.out.print("Digite um número decimal: ");
                    decimal = scanner.nextInt();
                    String hexadecimal = ConvertorHexadecimal.decimalParaHexadecimal(decimal);
                    System.out.println("Número em hexadecimal: " + hexadecimal);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("-------------------------------\n");
            System.out.println("Escolha uma das opções a baixo: ");
            System.out.println(" [1] Binario");
            System.out.println(" [2] Octal");
            System.out.println(" [3] Hexadecimal");
            System.out.println(" [0] Sair\n");
        
            System.out.print("     Opção: ");
            opcao = scanner.nextInt();
            
        }

        scanner.close();
    }
}
