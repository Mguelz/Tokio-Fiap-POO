package Aulas.poo;

public class ContaTeste {

	public static void main(String[] args) {

		Cliente miguel = new Cliente("Miguel", "1231023810", "2198129312312", "Rua Adalto Fernandez, 283");
		Cliente fabio = new Cliente("Fabio", "312312923", "182381723781", "Rua Emancipado de Oliveira, 423");
		Conta contaMiguel = new Conta(miguel, 1234, 9876, "senha");
		Conta contaFabio = new Conta(fabio, 1235, 9876, "senha");

		// simulações

		System.out.println("----------------- Depositando ----------------");
		// depositar
		contaFabio.depositar(10000);
		contaMiguel.depositar(20000);
		// exibir
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("----------------- Sacando ----------------");
		contaFabio.sacar(1000);
		contaMiguel.sacar(1000);
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("----------------- Transferencia ----------------");
		contaMiguel.transferir(contaFabio, 1000);
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();

		System.out.println("---------------------------------------------------");
		contaFabio.transferir(contaMiguel, 1100);
		contaFabio.exibirSaldo();
		contaMiguel.exibirSaldo();
	}

}
