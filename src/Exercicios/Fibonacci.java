package Exercicios;

/**
 * 
 * Sequencia de Fibonacci
 * 
 * é uma sequência de números inteiros iniciados por zero e um, no qual cada
 * termo subsequente corresponde a soma dos dois números anteriores: 0,1, 1, 2,
 * 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584...
 * 
 * @author Miguel Arcanjo
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		lacoWhile();
		lacoFor();
	}

	private static void lacoWhile() {
		int primeiroNumero = 0, segundoNumero = 1, soma = 1;

		System.out.println("----------------------------- Utilizando o laco While -----------------------------");
		System.out.println(primeiroNumero);
		System.out.println(segundoNumero);
		while (segundoNumero < 1000000000) {
			soma = primeiroNumero + segundoNumero;
			System.out.println(soma);

			primeiroNumero = segundoNumero;
			segundoNumero = soma;

		}

	}

	private static void lacoFor() {
		int n = 27; // quantidade de numeros para mostrar no console
		int termo1 = 0;
		int termo2 = 1;

		System.out.println("----------------------------- Utilizando o laco For -----------------------------");

		for (int i = 1; i <= n; i++) {
			System.out.print(termo1 + " ");

			// Calcula o próximo termo somando os dois termos anteriores
			int proximoTermo = termo1 + termo2;

			// Atualiza os valores dos termos anteriores para o próximo cálculo
			termo1 = termo2;
			termo2 = proximoTermo;
		}
	}

}
