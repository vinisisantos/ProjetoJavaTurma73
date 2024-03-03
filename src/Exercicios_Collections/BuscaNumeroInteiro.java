package Exercicios_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaNumeroInteiro {

	public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("List:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

       
        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroProcurado = scanner.nextInt();


        int posicao = numeros.indexOf(numeroProcurado);

       
        if (posicao != -1) {
            System.out.println("\nO número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
        }

        
        scanner.close();
    }
}