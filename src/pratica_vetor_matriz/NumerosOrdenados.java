package pratica_vetor_matriz;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite o número que você deseja encontrar:");
        int numeroDesejado = Scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroDesejado) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("Número " + numeroDesejado + " não encontrado!");
        }
    }
}

