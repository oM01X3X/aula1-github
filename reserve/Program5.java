package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Conta5 conta;
		
		System.out.print("informe o numero da conta: ");
		int numeroConta = teclado.nextInt();
		System.out.print("informe o seu nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.print("voce quer fazer o deposito inicial (y/n)? ");
		char resposta = teclado.next().charAt(0);
		if(resposta == 'y') {
			System.out.print("informe o valor depositado: ");
			double depositoInicial = teclado.nextDouble();
			
			conta = new Conta5(numeroConta, nome, depositoInicial);
			
		}else {
			
			conta = new Conta5(numeroConta, nome);		
			
		}
	
		System.out.println();
		System.out.println("dados da conta: ");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.println("deposit money into the account: ");
		double valorDeposito = teclado.nextDouble();
		conta.depositoConta(valorDeposito);
		System.out.println("atualização dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("withdraw money from the account ");
		double sacarConta = teclado.nextDouble();
		conta.sacarConta(sacarConta);
		System.out.println("atualização dados da conta: ");
		System.out.println(conta);
		
	
		teclado.close();
	}
}
