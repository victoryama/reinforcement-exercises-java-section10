package ProblemaDadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nHomens = 0;
		double media, total = 0, maior = 0, menor = 3;
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);					
		}
		
		for (int i=0; i<n; i++) {
			if (altura[i]<menor) {
				menor = altura[i];
			}
			else {
				maior = altura[i];
				}
			if (genero[i] =='M') {
				nHomens++;
			}
			else {
				total = total + altura[i];
			}
		}
		
		media = total/(n-nHomens);
		
		
		System.out.printf("Menor: %.2f\n",menor);
		System.out.printf("Maior: %.2f\n", maior);
		System.out.printf("Media das mulheres: %.2f\n", media);
		System.out.printf("Numero de homens: %d", nHomens);
		
		sc.close();
	}

}
