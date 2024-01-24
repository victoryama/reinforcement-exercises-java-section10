package ProblemaNumerosPares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
	
		int nPares;
		
		nPares = 0;
		
		int[] numero = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Número: ");
			
			numero[i] = sc.nextInt();
		}
		
		System.out.print("\nPares: ");
		
		for (int i=0; i<n; i++) {
			if (numero[i]%2==0) {
				System.out.printf("%d ", numero[i]);
				nPares++;
			}
		}
		
		System.out.printf("\nQuantidade de PARES: %d", nPares);
		
		sc.close();
		
	}

}
