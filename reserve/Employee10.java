package reserve;

public class Employee10 {

	private String nome;
	private Integer horasTrabalhadas;
	private Double valorPorHora;
	
	public Employee10() {
		
	}
	
	public Employee10(String nome, Integer horasTrabalhadas, Double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
public double pagamento() {
   return valorPorHora * horasTrabalhadas;
}
	
	
}
