package Aulas.pooContinuos;

public class SaldoInsuficiente extends Exception {
	public SaldoInsuficiente(String mensagemDeErro) {
		super(mensagemDeErro);
	}

	@Override
	public String toString() {
		return getMessage(); // Retorna apenas a mensagem de erro (assim nao exibindo o nome do package junto)
	}
	
	
}
