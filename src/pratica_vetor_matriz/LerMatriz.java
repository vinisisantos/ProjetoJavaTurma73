package pratica_vetor_matriz;
import java.util.Scanner;

public class LerMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da matriz 3x3
        int[][] matriz = new int[3][3];

        // Aqui faz a leitura dos numeros para fazer o preenchimento da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // mostra todos os elementos da Diagonal Principal
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // mostra todos os elementos da Diagonal Secundária
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }

        // Calcula a soma dos elementos da Diagonal Principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Calcula a soma dos elementos da Diagonal Secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

        
        scanner.close();
    }
}
