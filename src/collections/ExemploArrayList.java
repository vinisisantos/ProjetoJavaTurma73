package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		// Criando a Collection
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		Double  numero;
		// Float é uma tipagem, e tem que ser escrito com F maiusculo para diferenciar da tipagem primitiva. 
		
		// Adiciona algumas Notas. 
		 // Observe que a primeira nota é o Objeto Wrapper Double.
		
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/*
		 * Mostra na tela todas as notas adicionadas. 
		 * Observe que a nota duplicada foi adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		System.out.println("Digite o número que você deseja procurar: "); 
		numero = leia.nextDouble();
		
		/**
		 * Mostra a posição (indice) de uma determinada nota. 
		 * Caso existam 2 notas iguais será exibida a posição da primeira nota encontrada.
		 */
		System.out.println("\nA posição da nota é: " + notas.indexOf(numero));
	}

}
