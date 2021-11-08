package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		double [] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = teclado.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double alturaMedia = soma / n;
		
		System.out.printf("a altura media é %.2f%n", alturaMedia);
		
		teclado.close();
	}
}
