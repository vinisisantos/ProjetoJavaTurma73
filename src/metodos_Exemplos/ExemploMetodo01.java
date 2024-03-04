package metodos_Exemplos;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		mensagem();
	}
	// valor1 + valor2 = resultado
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void mensagem() {
		System.out.println("Olá, turma 73!");
	}
}
