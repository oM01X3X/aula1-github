package reserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee10> list = new ArrayList<>();

		System.out.print("informe a quantidade de funcionarios: ");
		int qtd = sc.nextInt();
			
		for(int i=1; i<=qtd; i++) {
			System.out.println("Funcionario #" + i + " data: ");
			System.out.print("O funcionario é terceirizado: (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("horas: ");
			int hrs = sc.nextInt();
			System.out.println("valor por hora: ");
			double valor = sc.nextDouble();
			if(ch == 's') {
				System.out.println("informe o valor adicional: ");
				double adicional = sc.nextDouble();
				list.add(new OutSourcedEmployee10(name, hrs, valor, adicional));
			}
			else {
				list.add(new Employee10(name, hrs, valor));
			}
		}
		
	    System.out.println();
	    System.out.println("pagamentos: ");
	    for(Employee10 emp : list) {
	    	System.out.println(emp.getNome() + " - $" + String.format("%.2f", emp.pagamento()));
			
		}
		sc.close();
	}
}
