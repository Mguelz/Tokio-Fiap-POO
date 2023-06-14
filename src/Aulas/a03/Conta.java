package Aulas.a03;

import java.sql.Date;

public class Conta {

	private int numeroConta, agencia;
	private String senha;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; // composição // todos os dados do cliente esta nesta "variavel/objeto"

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senha = senha;
		this.dataAbertura = new Date(System.currentTimeMillis()); // pega a data do sistema operacional
		System.out.println("Conta criada");
		System.out.println("Data de abertura: " + this.dataAbertura);
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);

		if (teste == true) { // verificar se tem dinheiro na conta
			this.sacar(valor);
		}

		conta.depositar(valor);
	}

	public void exibirSaldo() {
		System.out.println("Cliente: " + this.cliente.getNomeTutular() + " - saldo: " + this.saldo);
	}

	@Override
	public String toString() {
		return "saldo da conta " + saldo;
	}
}
/*
 * Exemplo de um carro
 * 
 * composição é obrigatória
 * rx: rodas, motor, escapamento
 * 
 * associação opcional 
 * ex: multimídia, ar-condicionado
 * 
 * Abstract: proibe a istancia da classe
 */
