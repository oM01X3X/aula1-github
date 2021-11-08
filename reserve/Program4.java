package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Funcionario4 funcionario = new Funcionario4();
		
		System.out.println("Informe o seu nome: ");
		funcionario.nome = teclado.next();
		System.out.println("Informe o seu salario bruto: ");
		funcionario.salario = teclado.nextDouble();
		System.out.println("Informe o seu imposto: ");
		funcionario.imposto = teclado.nextDouble();
		
		System.out.println("o seu salario liquido é " + funcionario.salarioLiquido());
		
		System.out.println("Informe o seu aumento: ");
		funcionario.porcentagem = teclado.nextDouble();
		
		System.out.println("O seu salario aumentado é $ " + funcionario.salarioAumentado());
		
		
		
		
		
		teclado.close();
	}
}
