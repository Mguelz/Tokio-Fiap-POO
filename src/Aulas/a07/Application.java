package Aulas.a07;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Usuario> listausuario = new ArrayList<Usuario>();
		
		listausuario.add(new Usuario(1, "miguel", "miguel123"));
		listausuario.add(new Usuario(4, "jose", "jose123"));
		listausuario.add(new Usuario(2, "marta", "marta123"));
		listausuario.add(new Usuario(5, "joaquim", "joaquim123"));
		listausuario.add(new Usuario(3, "edson", "edson123"));

		Usuario.ordenarPorId(listausuario);
		Usuario.imprimirListaUsuario(listausuario);
	}

	

}
