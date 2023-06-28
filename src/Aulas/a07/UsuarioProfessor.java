package Aulas.a07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * 
 * 
 * 
 * PEGAR ESSA CLASSE QUE ALGUEM FEZ                                                                                                                                    (PQP)
 * 
 * 
 * 
 * @author Miguel
 *
 */
public class UsuarioProfessor implements Comparable<Usuario> {
	static Map<Object, Object> mapa = new HashMap<Object, Object>();//Não é declarado nenhum tipo pois o map pode guardar diversos tipos.
	public static void main(String[] args) {
		Usuario guilherme = new Usuario(3, "Guilherme R", "123321");
		Usuario emerson = new Usuario(2, "Emerson", "abc");
		Usuario miguel = new Usuario(1, "Miguel", "123456");
		List<Usuario> users = new ArrayList<Usuario>();
		users.add(guilherme);
		users.add(emerson);
		users.add(miguel);
		
		
		//Iterando a lista.
		for (Usuario user : users) {
			System.out.println(user.getNome());
		}
		
		
		
		//Reordena a lista conforme a regra definida no CompareTo.
		Collections.sort(users);
		
		//Iterando a lista ordenada.
		for (Usuario user : users) {
			System.out.println(user.getNome());
		}

		
		mapa.put(guilherme.getIdUsuario(), guilherme);
		mapa.put(miguel.getIdUsuario(),miguel);
		mapa.put(emerson.getIdUsuario(),emerson);
		
		//Recuperando o objeto por meio da chave:
//		guilherme.recuperaUsuario();
		
	}

	private long id;
	private String nome, senha;

	public UsuarioProfessor(long id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

//	public static void recuperaUsuario() {
//		Object objeto = mapa.get(this.getId());
//		Usuario usuario = (Usuario) objeto;
//		System.out.println("O usuario selecionado foi: " + usuario.getNome());
//	}
}
