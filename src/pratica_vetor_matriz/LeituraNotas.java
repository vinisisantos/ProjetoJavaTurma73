package pratica_vetor_matriz;

import java.util.Scanner;

public class LeituraNotas {
    public static void main(String[] args) {
        double[][] notas = new double[10][4];
        // Armazena as notas
        double[] medias = new double[10];

        Scanner leia = new Scanner(System.in);

        // Preenchimento da matriz com as notas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leia.nextDouble();
            }
        }

        // Calculando as médias e armazenando no vetor
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }

        // Exibindo as médias na tela
        System.out.println("Médias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }
    }
}
