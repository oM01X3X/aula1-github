package reserve;

public class Funcionario4 {

	public String nome;
	public double salario = 0, imposto = 0;
	public double porcentagem = 0;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	public double aumento() {
		return salario * (porcentagem / 100);
	}
	public double salarioAumentado() {
		return salario + aumento();
	}
}
