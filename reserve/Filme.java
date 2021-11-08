package reserve;

public class Filme {

	private String nome;
	private String autor;
	private Integer ano;
	
	
	public Filme() {
	}


	public Filme(String nome, String autor, Integer ano) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
}
