package Aulas.poo;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senha, double saldoInvestimento) {
		super(cliente, numeroConta, agencia, senha);
		this.saldoInvestimento = saldoInvestimento;
	}

	public double getSaldoInvestimento() {
		return saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}

	@Override
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;

		System.out.println("Cliente: " + this.cliente.getNomeTutular() + " - saldo: " + this.saldo);
		System.out.println("Saldo de Investimento: " + this.saldoInvestimento);
		System.out.println("Saldo Total: " + saldoTotal);

	}

}
