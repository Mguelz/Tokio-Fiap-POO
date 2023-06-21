package Aulas.a05;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException {

		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// CAMINHAO

//		Transmissao transmissaoCaminhao = new Transmissao("Manual", "8 marchas");
//		Roda rodaCaminhao = new Roda("Preto", "Mercedes-Benz", 4, 9, 23, 8);
//		Motor motorCaminhao = new Motor("Om 447 La", "Gasolina comum", 12, 12, 1500);
//
//		Caminhao caminhao = new Caminhao("Mercedes-Benz", "Amarelo", "AROCS", "2004", 106, motorCaminhao, rodaCaminhao,
//				transmissaoCaminhao);
//
//		boolean ligadoDesligado = true;
//
//		caminhao.verificarSeEstaLigado(ligadoDesligado);
//		caminhao.acelerar(10, ligadoDesligado, caminhao.getVelocidadeAtual());
//		caminhao.acelerar(20, ligadoDesligado, caminhao.getVelocidadeAtual());
//		caminhao.frear(10, ligadoDesligado, caminhao.getVelocidadeAtual());
//		caminhao.descarregamento();
//		caminhao.mostrarDados();

		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// CARRO

		Transmissao transmissaoCarro = new Transmissao("tipoCambio", "Embreagem");
		Roda rodaCarro = new Roda("cor", "marca", 50, 60, 12, 2);
		Motor motorCaro = new Motor("tipoMotor", "tipoGasolina", 100, 250, 225);
		
		Gasolina gasolina = new Gasolina();
		Alcool alcool = new Alcool();
		
		Carro carro = new Carro("marca", "cor", "modelo", "2010", 200, 50, motorCaro, rodaCarro, transmissaoCarro);
		
		boolean ligadoDesligado = true;

		carro.verificarSeEstaLigado(ligadoDesligado);
		carro.acelerar(10, ligadoDesligado, carro.getVelocidadeAtual());
		carro.acelerar(150, ligadoDesligado, carro.getVelocidadeAtual());
		carro.frear(10, ligadoDesligado, carro.getVelocidadeAtual());
		carro.abastecimento(alcool, 10);
		carro.abastecimento(gasolina, 100);
		System.out.println(carro.tipoDeCombustivel);
//		carro.mostrarDados();

//		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		// MOTO
//
//		Transmissao transmissaoRoda = new Transmissao("tipoCambio", "Embreagem");
//		Roda rodaMoto = new Roda("cor", "marca", 50, 60, 12, 2);
//		Motor motorMoto = new Motor("tipoMotor", "tipoGasolina", 100, 250, 225);
//
//		Moto moto = new Moto("marca", "cor", "modelo", "2020", 150, motorMoto, rodaMoto, transmissaoRoda);
//
//		moto.verificarSeEstaLigado(ligadoDesligado);
//		moto.acelerar(10, ligadoDesligado, moto.getVelocidadeAtual());
//		moto.acelerar(140, ligadoDesligado, moto.getVelocidadeAtual());
//		moto.frear(10, ligadoDesligado, moto.getVelocidadeAtual());
//		moto.mostrarDados();

	}

}
