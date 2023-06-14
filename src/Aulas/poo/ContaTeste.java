package Aulas.poo;

public class ContaTeste {

	public static void main(String[] args) {

		Cliente miguel = new Cliente("Miguel", "1231023810", "2198129312312", "Rua Adalto Fernandez, 283");
		Cliente fabio = new Cliente("Fabio", "312312923", "182381723781", "Rua Emancipado de Oliveira, 423");
		ContaCorrente contaMiguel = new ContaCorrente(miguel, 1234, 9876, "senha", 0);
		ContaCorrente contaFabio = new ContaCorrente(fabio, 1235, 9876, "senha", 0);
		// criando os objetos da Interface
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();

		System.out.println("----------------- Depositando ----------------");
		contaFabio.depositar(10000);
		contaMiguel.depositar(20000);

		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("----------------- Sacando ----------------");
		contaFabio.sacar(1000);
		contaMiguel.sacar(1000);
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("----------------- Transferencia ----------------");
		contaMiguel.transferir(contaFabio, 1000);
		contaMiguel.investimento(cdb, 100.0); // o lca é o objeto da Interface
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("---------------------------------------------------");
		contaFabio.transferir(contaMiguel, 1100);
		contaFabio.investimento(lca, 100.0);
		contaFabio.exibirSaldo();
		System.out.println("");
		contaMiguel.exibirSaldo();

		System.out.println("");
		Conta.exibirContador(); // quantidade de contas que foram criadas
	}

}
