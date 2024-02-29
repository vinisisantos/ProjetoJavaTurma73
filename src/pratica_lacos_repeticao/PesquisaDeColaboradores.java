package pratica_lacos_repeticao;

import java.util.Scanner;

public class PesquisaDeColaboradores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar estatísticas
        int pessoasBackend = 0;
        int mulheresFrontend = 0;
        int homensMobileAcima40 = 0;
        int naoBinariosFullStackMenores30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;

        // Laço WHILE para continuar a leitura dos dados
        char continuarLeitura = 'S';
        while (continuarLeitura == 'S' || continuarLeitura == 's') {
            // Leitura de informações do colaborador
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Identidade de Gênero (1 a 6): ");
            int identidadeGenero = scanner.nextInt();

            System.out.print("Pessoa Desenvolvedora (1 a 4): ");
            int pessoaDesenvolvedora = scanner.nextInt();

            // Verificação das categorias e contagem
            switch (pessoaDesenvolvedora) {
                case 1: // Backend
                    pessoasBackend++;
                    break;
                case 2: // Frontend
                    if (identidadeGenero == 1 || identidadeGenero == 4) {
                        mulheresFrontend++;
                    }
                    break;
                case 3: // Mobile
                    if (identidadeGenero == 2 || identidadeGenero == 5) {
                        if (idade > 40) {
                            homensMobileAcima40++;
                        }
                    }
                    break;
                case 4: // FullStack
                    if (identidadeGenero == 3) {
                        if (idade < 30) {
                            naoBinariosFullStackMenores30++;
                        }
                    }
                    break;
            }

            // Atualização das estatísticas
            totalPessoas++;
            somaIdades += idade;

            // Pergunta se deseja continuar a leitura
            System.out.print("Deseja continuar a leitura dos dados? (S/N): ");
            continuarLeitura = scanner.next().charAt(0);
        }

        // Saída de dados
        System.out.println("O número de pessoas desenvolvedoras Backend: " + pessoasBackend);
        System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileAcima40);
        System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinariosFullStackMenores30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

        // Verificação para evitar divisão por zero
        if (totalPessoas > 0) {
            double mediaIdade = (double) somaIdades / totalPessoas;
            System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
        } else {
            System.out.println("Nenhuma pessoa respondeu à pesquisa.");
        }

        // Fechando o Scanner
        scanner.close();
    }
}

