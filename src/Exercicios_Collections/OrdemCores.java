package Exercicios_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdemCores {

	public static void main(String[] args) {
        
        ArrayList<String> cores = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Mostra as cores escritas 
        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Aqui é feito a ordem das cores, e ignora a escrita em maiuscula ou minuscula 
        Collections.sort(cores, String.CASE_INSENSITIVE_ORDER);

        // É mostrado na tela as cores ordenadas
        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        
        scanner.close();
    }
}
