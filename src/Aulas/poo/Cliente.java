package Aulas.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// quando a classe tem apenas os atributos/contrutores/getters and setters é chamada de classe JavaBeans
public class Cliente {
	private String nome, cpf, rg, endereco;
	private final Date dataNascimento; // constante

	// contrutor vazio
	public Cliente() {
		this.dataNascimento = new Date();
	}

	// TODO adicionar os outros atributos ao construtor (cpf, rg, endereco)
	public Cliente(String nomeTitular, String cpf, String rg, String enderecoTitular, String dataNasc)
			throws ParseException {
		this.nome = nomeTitular;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = enderecoTitular;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		this.dataNascimento = format.parse(dataNasc); // ira pegar o String e irá formatar para o tipo Date
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

/*
 * 
 * A classe Cliente é uma composição da classe Conta (isso é uma associação)
 * 
 * Uma conta só existe se ouver
 * 
 * Um cliente Um cliente pode ter apenas uma conta
 * 
 * Ao adicionar a classe Date no construtor é preciso
 * "propagar este possível "erro" colocando o "throws
 * ParseException" depois dos argumentos do constutor"
 * 
 * 
 * 
 * 
 */
