package ProblemasAlturas;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		int menores = 0;
		double total, alturaMedia, percentualMenor;
		total = 0.0;
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		for (int i=0; i<n; i++) {
			total = total + altura[i];
			
			if (idade[i]<16) {
				menores++;
				
			}
		}
		
		alturaMedia = total/n;
		percentualMenor = ((double)menores/n)*100.0;
		
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenor);
		
		for (int i=0; i<n; i++) {
			if (idade[i]<16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
		

	}

}
