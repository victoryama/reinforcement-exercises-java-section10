package ProblemaAprovados;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt(); 
		
		double media;
		String[] nome = new String[n];
		double[] N1 = new double[n];
		double[] N2 = new double[n];
		
				
		for (int i=0; i<n; i++) {
			System.out.printf("Nome, primeira e segunda nota %do aluno: \n",i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			N1[i] = sc.nextDouble();
			N2[i] = sc.nextDouble();			
		}
		
		System.out.print("Alunos aprovados: \n");
		for (int i=0; i<n; i++) {
			media = (N1[i] + N2[i])/2;
			if (media>=6) {
				System.out.println(nome[i]);
			}
			
		}
		
		sc.close();
	}

}
