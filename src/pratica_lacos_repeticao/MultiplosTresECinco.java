package pratica_lacos_repeticao;

import java.util.Scanner;

public class MultiplosTresECinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultimoNumero = scanner.nextInt();

        // Verificação do intervalo
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            System.exit(1);
        }

        // Saída de dados
        System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

        // Laço FOR para encontrar e imprimir múltiplos de 3 e 5
        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }

        // Fechando o Scanner
        scanner.close();
    }
}

