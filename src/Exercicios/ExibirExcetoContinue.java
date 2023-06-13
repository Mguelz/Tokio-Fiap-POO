package Exercicios;

/**
 * 
 * Exibir numeros de 0 a 100 exceto 50 a 75
 * 
 * @author Miguel Arcanjo
 *
 */
public class ExibirExcetoContinue {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i >= 50 && i <= 75) {
				continue;
			}
			System.out.println(i);
		}
	}
}
