package Aulas.poo;

import java.sql.Date;

public class Conta {

	int numeroConta, agencia;
	String senha;
	Date dataAbertura;
	double saldo;
	Cliente cliente; // composição // todos os dados do cliente esta nesta "variavel/objeto"

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senha = senha;
		this.dataAbertura = new Date(System.currentTimeMillis()); // pega a data do sistema operacional
		System.out.println("Conta criada");
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir() {

	}

	public void exibirSaldo() {
		System.out.println(this.cliente + " - saldo: " + this.saldo);
	}

	@Override
	public String toString() {
		return "Conta [ " + this.cliente + " ]";
	}

}
