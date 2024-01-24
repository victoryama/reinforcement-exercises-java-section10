package exercicioSomaVetor;
import java.util.Scanner;
import java.util.Locale;

public class somaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Número: ");
			vetor[i] = sc.nextInt();								
		}
		
		double soma = 0;
		
		System.out.print("VALORES= ");
		
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
			System.out.print(" " + vetor[i]);
		}
				
		double media = soma/vetor.length;
		
		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMEDIA = %.1f", media);
		
		
		sc.close();

		
	}

}
