package Aulas;

public class Aula05FuncaoRecursiva {
	public static void main(String[] args) {
//		Aula05FuncaoRecursiva aula5 = new Aula05FuncaoRecursiva();
//		double valor = 0;

	}

	boolean estaLigado = false;
	int velocimetro;
	double valor;

	public void acelerar(double valor) {
		if (this.estaLigado == true) {
			this.velocimetro += valor;
		} else {
			this.ligar();
			this.acelerar(valor); // função recursiva
		}

	}

	public void ligar() {
		System.out.println("Ligar");
	}
}
/*
 * polimorfismo
 * 
 * metodos com o mesmo nome e assinatura, porem, aquilo que esta dentro do
 * método é/pode ser totalmente diferente em cada uma das classes
 * 
 * quando voce utiliza a herança, basicamente esta forcando o polimorfismo
 * 
 * Interface não é classe - ou seja, nao consegue insanciar
 * 
 * na interface é escrito somente métodos, em que estes métodos serão abstratos
 * 
 * e nas classes filhas voce ira implementar nelas os métodos da interface
 * 
 * e voce tem que instanciar na "subclasse" todos os metodos, porem, voce pode
 * deixar estes metodos em branco e nao quebrar o código
 * 
 * seria como se fosse a classe mae e suas subclasses herdassem os seus metodos
 * 
 * 1 - no código seria Cliente implements Validação 
 * 2 - Gerente extends Funcionario implements Validacao 
 * 3 - Secretaria extends Funcionario
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */