package Aulas.a06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		// lista tipo String
//		List<String> lista = new ArrayList<String>();
//		lista.add("Miguel");
//		lista.add("Matheus");
//		lista.add("Guilherme");
//		lista.add("Jessica");
//		lista.add("Ikram");
//		lista.add("Isabelle");

		// lista tipo Usuario
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		Usuario jessica = new Usuario(4, "jessica", "jessica@gmail.com", "jessica123");
		Usuario ikram = new Usuario(5, "ikram", "ikram @gmail.com", "ikram 123");

		listaUsuario.add(new Usuario(1, "miguel", "miguel@gmail.com", "miguel123"));
		listaUsuario.add(new Usuario(2, "guilherme", "guilherme@gmail.com", "guilherme123"));
		listaUsuario.add(new Usuario(3, "matheus", "matheus@gmail.com", "matheus123"));
		// ou
		listaUsuario.add(jessica);
		listaUsuario.add(ikram);

		System.out.println("fim");

		// imprimindo as collections
//		imprimirListString(lista);
//		imprimirListUsuario(listaUsuario);

		removerUsuario(listaUsuario, "ikram"); // removendo um nome da collection listaUsuario
		imprimirListUsuario(listaUsuario);

	}

	public static void imprimirListString(List<String> lista) {
		for (String list : lista) {
			System.out.println(list);
		}
	}

	public static void imprimirListUsuario(List<Usuario> listaUsuario) {
		for (Usuario list : listaUsuario) {
			System.out.println(list);
		}
	}

//	public static List<Usuario> removerUsuario(String nome) {
//		Iterator<Usuario> iterator = listaUsuario.iterator(); // recebe a lista atualizada
//		while (iterator.hasNext()) {
//			Usuario usuario = iterator.next();
//			if (usuario.getNome().equals(nome)) {
//				iterator.remove();
//			}
//		}
//		return listaUsuario;
//	}
	public static List<Usuario> removerUsuario(List<Usuario> listaUsuario, String nome) {
		System.out.println("Entrou no método de remover usuario");
		Iterator<Usuario> iterator = listaUsuario.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome().equals(nome)) {
				iterator.remove();
				System.out.println("Removendo o usuario: " + nome);
			}
		}
		return listaUsuario;
	}
}
