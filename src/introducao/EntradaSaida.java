package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		//DECLARANDO VARIAVEIS
		String nome;
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Bom dia, " + nome + "\nVocê tem " + idade + " anos.");	}

}