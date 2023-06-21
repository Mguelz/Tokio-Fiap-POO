package Aulas.a05;

public class Alcool implements Combustivel {

	@Override
	public double abastecer(double qtdLitros) {
		if (qtdLitros <= 50) {
			return qtdLitros * 7.5; // fator de rendimento
		} else {
			System.out.println("Nao eh possivel abastecer acima de 50 Litros");
			return 0;
		}
	}

}
