package Aulas.a06;

public class Vetores {
	public static void main(String[] args) {
		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);
		System.out.println("");
		VetorforEach(x);
	}

	/**
	 * Popula os valores no vetor x
	 * 
	 * @param x
	 */
	public static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}

	/**
	 * Imprime os valores do vetor x da forma tradicional
	 * 
	 * @param x
	 */
	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + "\t");
			System.out.print(x[i] + " | ");
		}
	}

	/**
	 * Imprime os valores do vetor x utilizando o for each
	 * 
	 * @param x
	 */
	public static void VetorforEach(int[] x) {
		for (int i : x) { // pra cada indice do vetor "x" faça sysout
//			System.out.print(i + "\t");
			System.out.print(i + " | ");
		}
	}
}
/*
 * for each
 * 
 * pra cada indice do vetor "x" faça a instrução
 * 
 */
