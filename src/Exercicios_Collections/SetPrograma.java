package Exercicios_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetPrograma {
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new HashSet<>();

       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            conjunto.add(valor);
        }

       
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

     
        scanner.close();
    }
}

