package Exercicios;

/**
 * Este algoritimo é capaz de verificar o quanto que foi doado de uma empresa
 * para uma ONG sera investido nas despesas
 * 
 * @author Miguel Arcanjo
 *
 */
public class ONG {
	public static void main(String[] args) {
		double valorInvestimento = 6214.28;
//		valorInvestimento = -1;

//		valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da doacao"));

		if (valorInvestimento < 0) { // verifica se é valor negativo
			System.out.println("Valor Invalido");
		} else if (valorInvestimento > 1000.00) {
			System.out.println("Investimento de 15%");
			System.out.println(acimaDeMil(valorInvestimento));
		} else {
			System.out.println("Investimento de 5%");
			System.out.println(qualquerValor(valorInvestimento));
			// JOptionPane
//			JOptionPane.showMessageDialog(null, "Investimento de 5%");
//			JOptionPane.showMessageDialog(null, qualquerValor(valorInvestimento));
		}

	}

	/**
	 * é possivel multiplicar um numero por 15% para saber qual o valor que sera
	 * investido na ONG
	 * 
	 * @param valor
	 * @return
	 */
	private static double qualquerValor(double valor) {
		valor *= 0.05;
		return valor;
	}

	/**
	 * é possivel multiplicar um numero por 5% para saber qual o valor que sera
	 * investido na ONG
	 * 
	 * @param valor
	 * @return
	 */
	private static double acimaDeMil(double valor) {
		valor *= 0.15;
		return valor;
	}
}
