package Aulas.poo;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException, SaldoInsuficiente {

//		Cliente miguel = new Cliente("Miguel", "1231023810", "2198129312312", "Rua Adalto Fernandez, 283", "10/12/2004");
//		Cliente fabio = new Cliente("Fabio", "129318292", "123542412323", "Rua Emancipado de Oliveira, 423", "19/08/1990");
//		Cliente junior = new Cliente("Junior", "9819283721", "57567243412", "Rua Adalto Marques, 13", "19/01/1990");
//		ContaCorrente contaMiguel = new ContaCorrente(miguel, 1234, 9876, "senha", 0);
//		ContaCorrente contaFabio = new ContaCorrente(fabio, 1235, 9876, "senha", 0);
//		ContaCorrente contaJunior = new ContaCorrente(junior, 1236, 9876, "senha", 0);
//		// criando os objetos da Interface
//		CDB cdb = new CDB();
//		LCI lci = new LCI();
//		LCA lca = new LCA();
//
//		System.out.println("----------------- Depositando ----------------");
//		contaFabio.depositar(10000);
//		contaMiguel.depositar(20000);
//		contaJunior.depositar(1300);
//		
//		contaFabio.exibirSaldo();
//		contaMiguel.exibirSaldo();
//		contaJunior.exibirSaldo();
//
//		System.out.println("----------------- Sacando ----------------");
//		contaFabio.sacar(100);
//		contaMiguel.sacar(100000);
//		contaJunior.sacar(50000);
//		contaFabio.exibirSaldo();
//		contaMiguel.exibirSaldo();
//		contaJunior.exibirSaldo();
//
//		System.out.println("----------------- Transferencia ----------------");
//		contaMiguel.transferir(contaFabio, 1000);
//		contaMiguel.investimento(cdb, 100.0); // o lca é o objeto da Interface
//		contaFabio.exibirSaldo();
//		contaMiguel.exibirSaldo();
//
//		System.out.println("---------------------------------------------------");
//		contaFabio.transferir(contaMiguel, 1100);
//		contaFabio.investimento(lca, 100.0);
//		contaFabio.exibirSaldo();
//		System.out.println("");
//		contaMiguel.exibirSaldo();
//
//		System.out.println("---------------------------------------------------");
//		contaJunior.transferir(contaMiguel, 50);
//		contaJunior.investimento(lci, 20.0);
//		contaMiguel.exibirSaldo();
//		contaJunior.exibirSaldo();
//
//		System.out.println("");
//		Conta.exibirContador(); // quantidade de contas que foram criadas
//		
//		
//		System.out.println(contaFabio);
//		System.out.println(fabio);

		Cliente rodrigo = new Cliente("Rodrigo", "1231023810", "2198129312312", "Rua Adalto Fernandez, 283", "10/12/2004");
		ContaCorrente contaRodrigo = new ContaCorrente(rodrigo, 1234, 9876, "senha", 0);
		contaRodrigo.depositar(100);
		try {
			contaRodrigo.sacar(0);
		} catch(SaldoInsuficiente e) {
			System.out.println(e);
		}
		
		System.out.println("passou");
	}

}
