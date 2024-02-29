package pratica_lacos_condicionais;
import java.util.Scanner;

public class SomaABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui são as entradas de dados
        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o número C: ");
        int C = scanner.nextInt();

        // Nessa parte é feito o processamento e a saída dos dados
        int somaAB = A + B;

        System.out.println(A + " + " + B + " = " + somaAB + " " + (somaAB > C ? ">" : (somaAB < C ? "<" : "=")) + " " + C);

        // Usando if para fazer a verificação 
        if (somaAB > C) {
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (somaAB < C) {
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println("A Soma de A + B é Igual a C");
        }

        
        scanner.close();
    }
}
