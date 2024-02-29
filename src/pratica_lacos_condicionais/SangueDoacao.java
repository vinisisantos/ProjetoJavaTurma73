package pratica_lacos_condicionais;

import java.util.Scanner;

public class SangueDoacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o Nome do doador: ");
        String nomeDoador = scanner.nextLine();

        System.out.print("Digite a Idade do doador: ");
        int idadeDoador = scanner.nextInt();

        System.out.print("Primeira doação de sangue? ");
        boolean primeiraDoacao = scanner.nextBoolean();

      
        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
                System.out.println(nomeDoador + " não está apto para doar sangue!");
            } else {
                System.out.println(nomeDoador + " está apto para doar sangue!");
            }
        } else {
            System.out.println(nomeDoador + " não está apto para doar sangue!");
        }

      
        scanner.close();
    }
}

