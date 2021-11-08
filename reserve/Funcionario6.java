package reserve;

public class Funcionario6 {

	private String nome;
	private Integer id;
	private Double salary;
	
	public Funcionario6() {
		
	}
	
	public Funcionario6(String nome, int id, double salary) {
		super();
		this.nome = nome;
		this.id = id;
		this.salary = salary;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void increaseSalary(double percentage) {
		salary = salary + salary * percentage / 100.0;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id +  ", nome= " + nome + String.format(", salary= %.2f",  salary) + "]";
	}
}
