package ProblemaSomaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		double soma = 0.0;
		double media;
		
		
		double[] vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Número " + i + " : ");
			vetor[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma/n;
		
		System.out.print("VALORES: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMÉDIA = %.2f", media);
		
		sc.close();
		
	}

}
