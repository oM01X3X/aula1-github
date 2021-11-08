package reserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		List<Funcionario6> list = new ArrayList<>();
		
		System.out.println("quantas pessoas voce deseja registrar: ");
		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			
		System.out.println("funcionario #" + (i + 1) + ": ");
		System.out.println("id: ");
		Integer id = teclado.nextInt();
		System.out.println("nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("salario: ");
		Double salary = teclado.nextDouble();
		
		Funcionario6 funcionario = new Funcionario6(nome, id, salary);
		
		list.add(funcionario);
		
		}
	
		
		System.out.println("informe o id do funcionario de recebera aumento: ");
		int idsalary = teclado.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("esse id nao existe!!!");
		} else {
			System.out.print("porcentagem: ");
			double percent = teclado.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("lista de funcionarios: ");
		for (Funcionario6 emp : list) {
			System.out.println(emp);
		}
		 
		teclado.close();
	}
	
	public static Integer position(List<Funcionario6> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
