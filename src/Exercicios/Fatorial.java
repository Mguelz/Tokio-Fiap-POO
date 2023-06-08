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

/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
RASCUNHO FEITO ANTES DE PASSAR PARA A IDE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
//variaveis
NUMERO
ANTECESSOR = NUMERO - 1
CONTINUAR_LAÇO = true

pegar o numero NUMERO e multiplicar ele por todos os antecessores dele

então:
if(ANTECESSOR FOR MENOR QUE 1){
CONTINUAR LACO = false
}
NUMERO = NUMERO * ANTECESSOR
ANTECESSOR -1

REPETIR LACO



Obs: No final das contas, tive que fazer alguns ajustes no código para que funcionasse certinho

*/