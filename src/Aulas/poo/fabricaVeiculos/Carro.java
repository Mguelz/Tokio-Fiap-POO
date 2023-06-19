package Aulas.poo.fabricaVeiculos;

import java.text.ParseException;

public class Carro extends Veiculo {

	public Carro(String marca, String cor, String modelo, String tipoCombustivel, String anoFabricacao,
			int limiteVeiculo) throws ParseException {
		super(marca, cor, modelo, tipoCombustivel, anoFabricacao, limiteVeiculo);
	}

	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		if (valor == true) {
			return true;
		}
		return false;
	}

	@Override
	public void acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual + qtdParaAcelerar;
		verificarSeEstaLigado(ligadoDesligado);
		if (ligadoDesligado == true && velocidadeDesejada <= this.limiteVeiculo) {
			this.velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Acelerando...");
			System.out.println("Velocidade atual " + this.velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.out.println("Nao eh possivel acelerar, pois o Carro esta desligado");
		} else if (velocidadeDesejada >= this.limiteVeiculo) {
			this.velocidadeAtual = this.limiteVeiculo;
			System.out.println("Nao eh possivel acelerar, pois a velocidade maxima é " + this.limiteVeiculo);
			System.out.println("Velocidade atual " + this.limiteVeiculo + "Km/h");
		}

	}

	@Override
	public void frear(int qtdParaFrear, boolean ligadoDesligado, int valocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual - qtdParaFrear;
		if (ligadoDesligado == true && velocidadeDesejada > 0) {
			velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Freando");
			System.out.println("Velocidade atual " + velocidadeAtual + "Km/h");
		} else if (velocidadeDesejada < 0) {
			System.out.println(
					"Nao eh possivel frear mais, pois a velocidade atual do caro eh " + velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.out.println("O carro esta desligado");
		}
	}

	@Override
	public void mostrarDados(int velocidadeAtual) {
		System.out.println("Velocidade Atual " + velocidadeAtual);
		System.out.println("");
	}

}
