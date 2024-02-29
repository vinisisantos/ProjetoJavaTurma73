package pratica_vetor_matriz;
import java.util.Scanner;

public class LerNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int[] vetor = new int[10];

    
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

      
        System.out.println("\nSegredos nos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }

   
        System.out.println("\n\nNúmeros pares:");
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

      
        int soma = 0;
        for (int numero : vetor) {
            soma += numero;
        }

        
        double media = (double) soma / vetor.length;

     
        System.out.println("\n\nSoma: " + soma);
        System.out.println("Média: " + String.format("%.2f", media));

     
        scanner.close();
    }
}