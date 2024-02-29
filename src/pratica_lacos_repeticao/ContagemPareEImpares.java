package pratica_lacos_repeticao;

import java.util.Scanner;

public class ContagemPareEImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar os números pares e ímpares
        int pares = 0;
        int impares = 0;

        // Laço FOR para ler 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verificação se o número é par ou ímpar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Saída de dados
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        // Fechando o Scanner
        scanner.close();
    }
}
