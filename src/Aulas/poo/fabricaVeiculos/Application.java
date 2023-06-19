package Aulas.poo.fabricaVeiculos;

import java.text.ParseException;

public class Application {
	public static void main(String[] args) throws ParseException {
		Carro carro = new Carro("renout", "preto", "marca", "gasolina", "10/10/2000", 100);

		boolean ligarDesligar = true;

		carro.verificarSeEstaLigado(ligarDesligar);
		carro.acelerar(10, ligarDesligar, carro.getVelocidadeAtual());
		carro.acelerar(100, ligarDesligar, carro.getVelocidadeAtual());
		carro.frear(10, ligarDesligar, carro.getVelocidadeAtual());
	}
}
