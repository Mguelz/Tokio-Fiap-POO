package Aulas.a07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioProfessor implements Comparable<Usuario> {
	static Map<Object, Object> mapa = new HashMap<Object, Object>();// Não é declarado nenhum tipo pois o map pode guardar diversos tipos.

	public static void main(String[] args) {
		System.out.println("---------- Lista Desordenada -------------");

		Usuario guilherme = new Usuario(3, "Guilherme R", "123321");
		Usuario emerson = new Usuario(2, "Emerson", "abc");
		Usuario miguel = new Usuario(1, "Miguel", "123456");
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		listaUsuario.add(guilherme);
		listaUsuario.add(emerson);
		listaUsuario.add(miguel);

		// Iterando a lista.
		for (Usuario user : listaUsuario) {
			System.out.println("Id: " + user.getIdUsuario() + " -- Nome: " + user.getNome());
		}

		// Reordena a lista conforme a regra definida no CompareTo.
		Collections.sort(listaUsuario);

		System.out.println("\n---------- Lista Ordenada ----------------");

		// Iterando a lista ordenada.
		for (Usuario usuario : listaUsuario) {
			System.out.println("Id: " + usuario.getIdUsuario() + " -- Nome: " + usuario.getNome());
		}

		System.out.println("\n---------- Usuario Recuperado ----------------");

		Map<String, Usuario> map = new HashMap<String, Usuario>();

		map.put("miguel", miguel);

		Object objeto = map.get("miguel");
		Usuario usuario = (Usuario) objeto;
		System.out.println("Usuario - " + usuario.getNome() + " id - " + usuario.getIdUsuario());

	}

	private long idUsuario;
	private String nome, senha;

	public UsuarioProfessor(long id, String nome, String senha) {
		this.idUsuario = id;
		this.nome = nome;
		this.senha = senha;
	}

	public long getId() {
		return idUsuario;
	}

	public void setId(long id) {
		this.idUsuario = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int compareTo(Usuario user) {
		if (this.getId() < user.getIdUsuario()) {
			return -1;
		}
		if (this.getId() > user.getIdUsuario()) {
			return 1;
		}
		return 0;
	}

}
