package Aulas.a05;

public class ExcessoesTryCatch {
	public static void main(String[] args) {
		excessaofinally();
	}

	public static void excessaofinally() {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(2);
		} finally {
			System.out.println(3); // o finally sempre sera executado, mesmo sem capturar um excessao
		}
	}

	public static void excessaoDuasCaputras() {
		int valor1 = 1, valor2 = 0, resultado = 0;

		char[] list = { 1, 2, 3 };

		for (int i = 0; i < list.length; i++) {
			try {
				if (i == 0) {
					resultado = valor1 / valor2;
				} else {
					list[3] = 4;
				}
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Excessao " + e);
			}
			System.out.println("i = " + i + "\nresultado = " + resultado);
		}
	}
}