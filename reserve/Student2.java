package reserve;

public class Student2 {

	public double nota1 = 0;
	public double nota2 = 0;
	public double nota3 = 0;
	public String nome;
	
public double notaFinal() {
	return nota1 + nota2 + nota3;	
	}
public void resultado() {
	if(notaFinal() > 60) {
		System.out.println("aprovado");
	}else {
		System.out.println("reprovado");
	}
	
}
}
