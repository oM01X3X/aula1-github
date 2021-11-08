package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Retangulo3 retangulo = new Retangulo3();
		
		System.out.println("Informe a largura do retangulo: ");
		retangulo.largura = teclado.nextDouble();
		
		System.out.println("Informe a altura do retangulo: ");
		retangulo.altura = teclado.nextDouble();
		
		System.out.println("o tamanho da area é: " + retangulo.area());
		System.out.println("O perimetro da area é: " + retangulo.perimetro());
		
		
		teclado.close();
	}
}
