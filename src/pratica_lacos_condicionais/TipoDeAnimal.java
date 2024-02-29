package pratica_lacos_condicionais;
import java.util.Scanner;

public class TipoDeAnimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        System.out.println("Digite a terceira palavra:");
        String palavra3 = scanner.nextLine();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("onívoro")) {
                System.out.println("Homem");
            } else if (palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("herbívoro")) {
                System.out.println("Vaca");
            } else if (palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro")) {
                System.out.println("Águia");
            } else if (palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
                System.out.println("Pomba");
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematófago")) {
                System.out.println("Pulga");
            } else if (palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbívoro")) {
                System.out.println("Lagarta");
            } else if (palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("hematófago")) {
                System.out.println("Sanguessuga");
            } else if (palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("onívoro")) {
                System.out.println("Minhoca");
            }
        }

        // Fechando o Scanner
        scanner.close();
    }
}
