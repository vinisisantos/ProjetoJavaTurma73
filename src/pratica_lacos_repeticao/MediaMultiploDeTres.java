package pratica_lacos_repeticao;

import java.util.Scanner;

public class MediaMultiploDeTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a soma e a quantidade de números múltiplos de 3
        int somaMultiplosDeTres = 0;
        int quantidadeMultiplosDeTres = 0;

        // Laço DO...WHILE para ler números até que zero seja digitado
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Verificação se o número é múltiplo de 3
            if (numero % 3 == 0 && numero != 0) {
                somaMultiplosDeTres += numero;
                quantidadeMultiplosDeTres++;
            }

        } while (numero != 0);

        // Cálculo da média
        double mediaMultiplosDeTres = quantidadeMultiplosDeTres > 0 ? (double) somaMultiplosDeTres / quantidadeMultiplosDeTres : 0;

        // Saída de dados
        System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplosDeTres);

        // Fechando o Scanner
        scanner.close();
    }
}

