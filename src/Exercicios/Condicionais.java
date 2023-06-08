package Exercicios;

public class Condicionais {
	public static void main(String[] args) {

		// balanca dos metais
		// considere 3 netaus dustubtis = ouro, prata e bronze
		// escreva um algoritimo para exibir o mais pesado.
		// fazer com if-else encadeado

		double ouro = 500, prata = 1000, bronze = 300;
		
		// MINHA FORMA
//		int pesadoOuro = 0, pesadoPrata = 0, pesadoBronze = 0;
//
//		if (ouro > prata) {
//			pesadoOuro++;
//		}
//		if (ouro > bronze) {
//			pesadoOuro++;
//		}
//		if (prata > ouro) {
//			pesadoPrata++;
//		}
//		if (prata > bronze) {
//			pesadoPrata++;
//		} else {
//			pesadoBronze = pesadoBronze + 2;
//		}
//
//		if (pesadoOuro == 2) {
//			System.out.println("o mais pesado eh o Ouro");
//		} else if (pesadoPrata == 2) {
//			System.out.println("o mais pesado eh o Prata");
//		} else {
//			System.out.println("o mais pesado eh o Bronze");
//		}

		// PROFESSOR
		if (ouro > prata) {
			if (ouro > bronze) {
				System.out.println("Ouro eh o mais pesado");
			} else {
				System.out.println("Bronze eh o mais pesado");
			}
		} else if (prata > ouro) {
			if (prata > bronze) {
				System.out.println("Prata eh mais pesado");
			} else {
				System.out.println("Bronze eh o mais pesado");
			}
		}

		// REFATORADO
		if (ouro > prata && ouro > bronze) {
			System.out.println("Ouro eh mais pesado");
		} else if (prata > bronze) {
			System.out.println("Prata eh mais pesado");
		} else {
			System.out.println("Bronze eh mais pesado");
		}
	}
}
