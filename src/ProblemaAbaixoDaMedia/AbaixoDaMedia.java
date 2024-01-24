package ProblemaAbaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		double media, total = 0;
		
		double[] numero = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Número: ");
			numero[i] = sc.nextDouble();
			total = total + numero[i];
		}
		
		media = total/n;
		System.out.printf("\nMEDIA DO VETOR: %.3f\n",media);
		
		System.out.println("Abaixo da média: ");
		for (int i=0; i<n; i++) {
			if (numero[i]<media) {
				System.out.printf("%.1f\n",numero[i]);
			}
		}
		
		sc.close();
	}

}
