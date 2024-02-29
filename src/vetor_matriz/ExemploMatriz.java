package vetor_matriz;

public class ExemploMatriz {

	public static void main(String[] args) {
		int numeros[][] = {{10, 15, 35}, 
						  {70, 120, 140}, 
						  {50, 100, 150}};
		
		int linha, coluna;
		//double[][] matriz = new double[3][3];
	
		for(linha = 0; linha < 3; linha++) {
			// Esse FOR abaixo vai percorrer as colunas da matriz
			for(coluna = 0; coluna < 3; coluna++) {
			
				System.out.println("Numeros[ " + linha + "][" + coluna + "]" + numeros[linha][coluna]);
			}
		}
	}

}
