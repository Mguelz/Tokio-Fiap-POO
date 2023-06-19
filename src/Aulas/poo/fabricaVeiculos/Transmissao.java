package Aulas.poo.fabricaVeiculos;

public class Transmissao {
	private String tipoCombio, embreagem;

	public Transmissao() {
	}

	public Transmissao(String tipoCombio, String embreagem) {
		this.tipoCombio = tipoCombio;
		this.embreagem = embreagem;
	}

	public String getTipoCombio() {
		return tipoCombio;
	}

	public void setTipoCombio(String tipoCombio) {
		this.tipoCombio = tipoCombio;
	}

	public String getEmbreagem() {
		return embreagem;
	}

	public void setEmbreagem(String embreagem) {
		this.embreagem = embreagem;
	}

}
