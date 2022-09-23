package lista.lista9;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];
		int numerosGerados[] = new int[25];
		int indice = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				boolean condicao = true;
				int numero = 0;
				while(condicao) {
					int numeroAleatorio = random.nextInt(99);
					condicao = IntStream.of(numerosGerados).anyMatch(n -> n == numeroAleatorio);
					numero = numeroAleatorio;
				}
				matriz[i][j] = numero;
				numerosGerados[indice] = numero;
				indice++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
}
