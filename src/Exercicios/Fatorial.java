package Exercicios;

/**
 * 
 * Fatorial
 * 
 * O fatorial de um número é o produto dele pelos seus antecessores maiores que
 * 0. O fatorial de um número é a multiplicação desse número por todos os seus
 * antecessores maiores que zero
 * 
 * exemplos 0! = 1 <br>
 * 1! = 1 <br>
 * 2! = 2 . 1 = 2 <br>
 * 3! = 3 . 2 . 1 = 6 <br>
 * 4! = 4. 3 . 2 . 1 = 24 <br>
 * 5! = 5 . 4 . 3 . 2 . 1 = 120 <br>
 * 6! = 6 . 5 . 4 . 3 . 2 . 1 = 720 <br>
 * 7! = 7 . 6 . 5 . 4. 3 . 2 . 1 = 5040 <br>
 * 8! = 8 . 7 . 6 . 5 . 4. 3 . 2 . 1 = 40320 <br>
 * 9! = 9 . 8 . 7 . 6 . 5 . 4. 3 . 2 . 1 = 362.880 <br>
 * 10! = 10 . 9 . 8 . 7 . 6 . 5 . 4. 3 . 2 . 1 = 3.628.800 <br>
 * 
 * @author Miguel Arcanjo
 *
 */
public class Fatorial {

	public static void main(String[] args) {
		int numero = 10, antecessor = numero - 1, multiplicacao = 0;

		multiplicacao = numero * antecessor;
		antecessor--;
		while (true) {
			if (antecessor < 1) {
				break;
			}
			multiplicacao *= antecessor;
			antecessor--;
		}

		System.out.println("O fatorial de " + numero + "! eh = " + multiplicacao);
	}

}
