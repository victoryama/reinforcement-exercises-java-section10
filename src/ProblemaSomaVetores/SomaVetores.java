package ProblemaSomaVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] resultante = new int[n];
		
		System.out.print("Vetor A: \n");
		for (int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		
		System.out.print("Vetor B: \n");
		for (int i=0; i<n; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			resultante[i] = A[i] + B[i];
		}
	
		
		System.out.print("Vetor resultante:\n");
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n", resultante[i]);
		}
	
		sc.close();
	}

}
