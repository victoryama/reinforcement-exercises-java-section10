package ProblemaMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		double maior;
		int posicao = 0;
		
		double[] numero = new double[n];
		maior = 0.0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Numero: ");
			numero[i] = sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			if (numero[i]>maior) {
				maior = numero[i];
				posicao = i;
			}
		}
		
		System.out.printf("Maior: %.2f\n", maior);
		System.out.printf("Posicao: %d", posicao);
		
		sc.close();
		

	}

}
