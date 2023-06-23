package Aulas.a07;

import java.util.Collections;
import java.util.List;

/**
 * 
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
 * 8. Crie uma classe de teste com método main 
 * 9. Crie 5 usuários e adicione a uma lista de usuários 
 * 10. Utilize Collections.sort para ordenar os usuários da lista; Collections.sort(usuarios) 
 * 11. Faça um laço com foreach para imprimir o id dos usuários já ordenados.
 * 
 * 
 * 
 * @author Miguel
 *
 */
public class Usuario implements Comparable<Usuario> {
	private int idUsuario;
	private String nome, senha;

	public Usuario(int idusuario, String nome, String senha) {
		this.idUsuario = idusuario;
		this.nome = nome;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idusuario) {
		this.idUsuario = idusuario;
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

	@Override
	public String toString() {
		return "Usuario [idUsuario = " + idUsuario + ", nome = " + nome + ", senha = " + senha + "]";
	}

}
