package ProblemaMediaPares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n, total = 0, nPares = 0;
		
		n = sc.nextInt();
		
		double media;
		
		int[] numero = new int[n];
				
		for (int i=0; i<n; i++) {
			System.out.print("Número: ");
			numero[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (numero[i]%2==0) {
				total = total + numero[i];
				nPares++;
			}
		}
		
		if (nPares>0) {
			media = total/nPares;
			
			System.out.printf("Media: %.1f", media);
		}
		else {
			System.out.print("Não há nenhum par");
		}
		
		sc.close();
		

}
}