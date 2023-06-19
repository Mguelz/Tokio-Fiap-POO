package Aulas.poo.fabricaVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 
 * 1 - elaborar novo projeto denominando fabricaVeiculos; 2 - criar a
 * superclasse Veículo com atributos e métodos genéricos; 3 - criar as
 * subclasses Carro, Moto e Caminhao com atributos e métodos específicos;
 * (herança) 4 - elaborar métodos para ligar, desligar, acelerar, freiar e
 * exibir dados do veiculo; obs1: só é possível acelerar se o veículo estive
 * desligado e velocidade inferior ou igual o limite do veiculo; obs2: só é
 * possível freiar se o veículo estiver em movimento, velocidade nao pode ser
 * negativa; obs3: utilizar composição para rodas, motor, transmissão, entre
 * outros.
 * 
 * 
 * @author Miguel
 *
 */
public abstract class Veiculo {
	protected String marca, cor, modelo, tipoCombustivel;
	protected Date anoFabricacao;
	protected int velocidadeAtual, limiteVeiculo;

	public Veiculo() {
	}

	public Veiculo(String marca, String cor, String modelo, String tipoCombustivel, String anoFabricacao,
			int limiteVeiculo) throws ParseException {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		this.anoFabricacao = format.parse(anoFabricacao);
		this.limiteVeiculo = limiteVeiculo;
		this.velocidadeAtual = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Date getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
			this.velocidadeAtual = velocidadeAtual;
		}
	}

	public abstract boolean verificarSeEstaLigado(boolean valor);

	public abstract void acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual);

	public abstract void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidade);

	public abstract void mostrarDados(int velocidade);

}
