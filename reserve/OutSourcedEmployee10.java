package reserve;

public class OutSourcedEmployee10 extends Employee10{

	private Double despesaAdicional;
	
	public OutSourcedEmployee10() {
		super();
	}

	public OutSourcedEmployee10(String nome, Integer horasTrabalhadas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + (despesaAdicional/ 100) * 110; 
	}
}
