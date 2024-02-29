package pratica_lacos_repeticao;

import java.util.Scanner;

public class ContagemDeIdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar o total de pessoas menores de 21 anos e maiores de 50 anos
        int menoresDe21 = 0;
        int maioresDe50 = 0;

        // Leitura inicial
        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();

        // Laço WHILE para ler idades até que seja digitada uma idade negativa
        while (idade >= 0) {
            // Verificação da idade e contagem
            if (idade < 21) {
                menoresDe21++;
            } else if (idade > 50) {
                maioresDe50++;
            }

            // Leitura da próxima idade
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        // Saída de dados
        System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);

        // Fechando o Scanner
        scanner.close();
    }
}

