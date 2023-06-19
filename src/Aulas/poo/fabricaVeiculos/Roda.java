package Aulas.poo.fabricaVeiculos;

public class Roda {

	// Atributos
	private String cor, marca;
	private double pesoSuportado, largura, diametro;
	private int qntdRodas;

	// Construtor vazio
	public Roda() {

	}

	// Construtor
	public Roda(String cor, String marca, double pesoSuportado, double largura, double diametro, int qntdRodas) {
		this.cor = cor;
		this.marca = marca;
		this.pesoSuportado = pesoSuportado;
		this.largura = largura;
		this.diametro = diametro;
		this.qntdRodas = qntdRodas;
	}

	// Getters/setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPesoSuportado() {
		return pesoSuportado;
	}

	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public int getQntdRodas() {
		return qntdRodas;
	}

	public void setQntdRodas(int qntdRodas) {
		this.qntdRodas = qntdRodas;
	}
}
