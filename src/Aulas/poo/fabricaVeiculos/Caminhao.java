package Aulas.poo.fabricaVeiculos;

import java.text.ParseException;

public class Caminhao extends Veiculo {

	public Caminhao(String marca, String cor, String modelo, String tipoCombustivel, String anoFabricacao, int potencia)
			throws ParseException {
		super(marca, cor, modelo, tipoCombustivel, anoFabricacao, potencia);
	}

	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		// TODO Auto-generated method stub

	}

	@Override
	public void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarDados(int velocidade) {
		// TODO Auto-generated method stub

	}
}
