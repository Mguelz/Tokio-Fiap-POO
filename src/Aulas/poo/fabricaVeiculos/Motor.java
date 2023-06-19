package Aulas.poo.fabricaVeiculos;

public class Motor {
	private String tipoMotor, tipoCombustivel, potencia;
	private int qtdLitros, cilindrada, torque;

	public Motor() {
	}

	public Motor(String tipoMotor, String tipoCombustivel, String potencia, int qtdLitros, int cilindrada, int torque) {
		this.tipoMotor = tipoMotor;
		this.tipoCombustivel = tipoCombustivel;
		this.potencia = potencia;
		this.qtdLitros = qtdLitros;
		this.cilindrada = cilindrada;
		this.torque = torque;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(int qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

}
