package pratica_lacos_repeticao;

import java.util.Scanner;

public class SomaNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a soma dos números positivos
        int somaPositivos = 0;

        // Laço DO...WHILE para ler números até que zero seja digitado
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Verificação se o número é positivo
            if (numero > 0) {
                somaPositivos += numero;
            }

        } while (numero != 0);

        // Saída de dados
        System.out.println("A soma dos números positivos é: " + somaPositivos);

        // Fechando o Scanner
        scanner.close();
    }
}

