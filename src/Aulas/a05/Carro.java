package Aulas.a05;

/**
 * 
 * @author Miguel
 *
 */

public class Carro extends Veiculo {

	private double tanque, qtdNoTanque, rendimentoTotal;

	public Carro(String marca, String cor, String modelo, String anoDeFabrica, int limiteMaximo, double tanque,
			Motor motor, Roda roda, Transmissao transmissao) {
		super(marca, cor, modelo, anoDeFabrica, limiteMaximo, motor, roda, transmissao);
		this.tanque = tanque;
	}

	@Override
	public boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual + qtdParaAcelerar;
		verificarSeEstaLigado(ligadoDesligado);
		if (ligadoDesligado == true && velocidadeDesejada <= this.limiteMaximo && qtdParaAcelerar > 0) {
			this.velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Acelerando...");
			System.out.println("Velocidade atual " + this.velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.err.println("Nao eh possivel acelerar, pois o Carro esta desligado");
		} else if (velocidadeDesejada >= this.limiteMaximo) {
			this.velocidadeAtual = this.limiteMaximo;
			System.err.println("Nao eh possivel acelerar, pois a velocidade maxima é " + this.limiteMaximo);
			System.err.println("Velocidade atual " + this.limiteMaximo + "Km/h");
		} else {
			System.err.println("A quantidade de voce deseja acelerar nao eh valida");
		}
		return false;
	}

	public double getQtdCombustivel() {
		return tanque;
	}

	public void setQtdCombustivel(double qtdCombustivel) {
		this.tanque = qtdCombustivel;
	}

	public double getCapacidadeRodagem() {
		return rendimentoTotal;
	}

	public void setCapacidadeRodagem(double capacidadeRodagem) {
		this.rendimentoTotal = capacidadeRodagem;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

	public double getQtdNoTanque() {
		return qtdNoTanque;
	}

	public void setQtdNoTanque(double qtdNoTanque) {
		this.qtdNoTanque = qtdNoTanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

	@Override
	public void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual - qtdParaFrear;
		if (ligadoDesligado == true && velocidadeDesejada > 0) {
			velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Freando");
			System.out.println("Velocidade atual " + velocidadeAtual + "Km/h");
		} else if (velocidadeDesejada < 0) {
			System.err.println(
					"Nao eh possivel frear mais, pois a velocidade atual do caro eh " + velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.err.println("O carro esta desligado");
		}

	}

	@Override
	public void mostrarDados() {
		System.out.println("Carro: " + this.getMarca() + " - " + this.getModelo() + " - " + this.getCor() + " - "
				+ this.anoDeFabrica + " - " + this.getLimiteMaximo() + "Km/h" + "\nQuantidade de Combustivel - "
				+ this.tanque + motor + roda + transmissao);
		System.out.println("\n-----------------------------------------");
	}

	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		if (valor == true) {
			return true;
		}
		return false;
	}

	/**
	 * abastece o carro com o combustivel desejado, seja ele gasolina ou alcool
	 * 
	 * @param tipoCombustivel
	 * @param qtdDesejada
	 */
	public void abastecimento(Combustivel tipoCombustivel, double qtdDesejada) {
		double rendimentoDoAbastecimento = 0;
		if (this.qtdNoTanque + qtdDesejada > 0 && qtdNoTanque + qtdDesejada <= this.tanque) { // verifica a quantidade que tem no tanque + a quantidade para abastecimento
			this.qtdNoTanque += qtdDesejada;
			rendimentoDoAbastecimento += tipoCombustivel.abastecer(qtdDesejada);
			this.rendimentoTotal += rendimentoDoAbastecimento;
			System.out.println("\nQuantidade de combustivel abastecido --> " + qtdDesejada);
			System.out.println("Capacidade maxima de rodagem do abastecimento --> " + rendimentoDoAbastecimento + "Km/h");
			System.out.println("Rodagem total do carro --> " + rendimentoTotal + "Km/h");
			System.out.println("Quantidade no tanque --> " + this.qtdNoTanque);
		} else {
			System.out
					.println("\nA capacidade maxima do tanque eh de: " + tanque + " Litros, voce excedeu a capacidade!");
			verificarSeEstaLigado(false); // desligar o carro se o combustivel chegar a 0
		}

	}

}
