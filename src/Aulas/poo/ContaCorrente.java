package Aulas.poo;

/**
 * 
 * tipos de investimento
 * 
 * CDB 13.75% de taxa anua
 * 
 * LCA 9.00%
 * 
 * CDI 9.50%
 * 
 * @author Miguel Arcanjo
 *
 */
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

	public void investimento(Produto produto, Double valor) {
		boolean teste = this.sacar(valor);
		if(teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
		
	}

}

/*
 * strategy - dessign pattern, para redução de IFs
 * 
 * 
 * 
 * investir ifs -
 * 
 * double rendimento, capital; if (tipoInvestimento.equals("CDB")) { rendimento
 * = valor * 0.1375; capital = valor + rendimento; this.saldoInvestimento +=
 * capital; } else if (tipoInvestimento.equals("LCA")) { capital = valor * 1.09;
 * // encurtando o primeiro if this.saldoInvestimento += capital; } else {
 * capital = (valor * 1.095); this.saldoInvestimento += capital; }
 */
