package Aulas.a03;

// quando a classe tem apenas os atributos/contrutores/getters and setters é chamada de classe JavaBeans
public class Cliente {
	private String nomeTutular, cpfTitular, rgTitular, enderecoTitular;

	// contrutor vazio
	public Cliente() {
	}

	public Cliente(String nomeTutular, String cpfTitular, String rgTitular, String enderecoTitular) {
		this.nomeTutular = nomeTutular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
	}

	public String getNomeTutular() {
		return nomeTutular;
	}

	public void setNomeTutular(String nomeTutular) {
		this.nomeTutular = nomeTutular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

}
