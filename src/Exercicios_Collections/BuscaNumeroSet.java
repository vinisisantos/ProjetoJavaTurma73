package Exercicios_Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BuscaNumeroSet {

	public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
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

      
        if (numeros.contains(numeroProcurado)) {
            System.out.println("\nO número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
        }

       
        scanner.close();
    }
}