package reserve;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Informe o nome do filme: ");
	String nome = teclado.nextLine();
	System.out.println("Informe o nome do autor: ");
	String autor = teclado.nextLine();
	System.out.println("Informe o ano de lançamento do filme: ");
	int ano = teclado.nextInt();
	
	Filme filme = new Filme(nome, autor, ano);
	
System.out.println(filme);
	
	teclado.close();
	}
}
