package problema_negativos;
import java.util.Locale;
import java.util.Scanner;

public class negativos {

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
		
		System.out.print("Números negativos: ");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i]<0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
		
	}

}
