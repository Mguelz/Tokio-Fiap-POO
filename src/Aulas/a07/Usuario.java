package Aulas.a07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EXERCICIO 1
 * 1. Crie uma classe Usuario 
 * 2. Adicione os atributos idUsuario, nome e senha
 * 3. Crie um construtor 
 * 4. Adicione métodos getters e setters 
 * 5. Faça sua classe implementar a interface Comparable<Usuario> 
 * 6. Adicione os métodos (add unimplemented methods) pelo quickfix 
 * 7. Implemente no método compareTo:
 * 
 * public int compareTo(Usuario user){
 * 
 * if(this.getIdUsuario()<user.getIdUsuario()){
 * 
 * return -1;
 * 
 * } if (this.getIdUsuario()>user.getIdUsuario()){
 * 
 * return 1;
 * 
 * } return 0;
 * 
 * } 
 * 
 * 8. Crie uma classe de teste com método main 
 * 9. Crie 5 usuários e adicione a uma lista de usuários 
 * 10. Utilize Collections.sort para ordenar os usuários da lista; Collections.sort(usuarios) 
 * 11. Faça um laço com foreach para imprimir o id dos usuários já ordenados.
 * 
 * EXERCICIO 2
 * • Implemente chaves para os usuários da classe Usuarios.
 * • Crie um método para recuperar os objetos pelas chaves e imprima uma lista de nome de usuários.
 * 
 * @author Miguel
 *
 */
public class Usuario implements Comparable<Usuario> {

	public static void main(String[] args) {
		// exercicio 1
		System.out.println("Exercicio 1");
		List<Usuario> listaUsuario = new ArrayList<Usuario>();

		listaUsuario.add(new Usuario(1, "miguel", "miguel123"));
		listaUsuario.add(new Usuario(4, "jose", "jose123"));
		listaUsuario.add(new Usuario(2, "marta", "marta123"));
		listaUsuario.add(new Usuario(5, "joaquim", "joaquim123"));
		listaUsuario.add(new Usuario(3, "edson", "edson123"));

		ordenarPorId(listaUsuario);
		imprimirListaUsuario(listaUsuario);

		// exercicio 2
		System.out.println("\nExercicio 2");
		Map<String, Usuario> mapUsuario = new HashMap<>(); // criando um map de Usuario onde k = String / v = Usuario
		mapUsuario.put("miguel", listaUsuario.get(0));
		mapUsuario.put("marta", listaUsuario.get(2));
		mapUsuario.put("edson", listaUsuario.get(4));
		mapUsuario.put("jose", listaUsuario.get(1));
		mapUsuario.put("joaquim", listaUsuario.get(3));
		imprimirMapUsuario(mapUsuario);
		// ---------------------------------------------------------------------------
		System.out.println("\nRecuperando a senha de acordo com o nome dado: ");
		recuperarSenhaUsuario(mapUsuario, "miguel");
	}

	private int idUsuario;
	private String nome, senha;

	public Usuario(int idusuario, String nome, String senha) {
		this.idUsuario = idusuario;
		this.nome = nome;
		this.senha = senha;

//		mapUsuario.put(nome, this);

	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
		if (this.getIdUsuario() < user.getIdUsuario()) {
			return -1;
		}
		if (this.getIdUsuario() > user.getIdUsuario()) {
			return 1;
		}
		return 0;
	}

	/**
	 * 
	 * Ordena os dados de acordo com o id
	 * 
	 * @param listaUsuario
	 */
	public static void ordenarPorId(List<Usuario> listaUsuario) {
		Collections.sort(listaUsuario);
	}

	public static void imprimirListaUsuario(List<Usuario> listaUsuario) {
		for (Usuario id : listaUsuario) {
			System.out.println(id);
		}
	}

	public static void imprimirMapUsuario(Map<String, Usuario> map) {
		System.out.println("Lista de nomes de usuarios:");
		for (String nomeUsuario : map.keySet()) {
			System.out.println(nomeUsuario);
		}
	}

	public static void recuperarSenhaUsuario(Map<String, Usuario> map, String nome) {
		Usuario usuario = map.get(nome);
		if (usuario != null) {
			System.out.println("senha recuperada de " + nome + ": " + usuario.getSenha());
		} else {
			System.out.println("Usuario nao " + nome + " encontrado!");
		}
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario = " + idUsuario + ", nome = " + nome + ", senha = " + senha + "]";
	}

}
