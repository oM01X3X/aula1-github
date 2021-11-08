package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Trimestre2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Student2 student= new Student2();
		System.out.println("Informe as suas notas do trimestre");
		System.out.println("nome: ");
		student.nome = teclado.next();
		System.out.println("informe a primeira nota: ");
		student.nota1 = teclado.nextDouble();
		System.out.println("Informe a segunda nota: ");
		student.nota2 = teclado.nextDouble();
		System.out.println("Informe a terçeira nota: ");
		student.nota3 = teclado.nextDouble();
		
		System.out.printf("nota final: %.2f\n", student.notaFinal());
		System.out.println();
		if(student.notaFinal() < 60.0) {
			System.out.println("reprovado");
		}else {
			System.out.println("parabens " + student.nome + " voce foi aprovado");
		}
		
		
	teclado.close();	
	}
}
