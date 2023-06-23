package Aulas.a06;

import java.sql.Date; // para buscar somente o ano/mes/dia - diferente do utiç que pega muitos outros parametros
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {

	public static void main(String[] args) {
//		Usuario usuario[] = new Usuario[2];
//		usuario[0] = new Usuario(1, "Miguel", "miguel@gmail.com", "miguel123");
//		usuario[1] = new Usuario(2, "Aluisio", "aluisio@gmail.com", "aluisio123");
//
//		for (int i = 0; i < usuario.length; i++) {
//			System.out.println("Nome: " + usuario[i].getNome());
//			System.out.println(" Senha: " + usuario[i].getSenha());
//			System.out.println(" Email: " + usuario[i].getEmail());
//			System.out.println(" Abertura da Conta: " + usuario[i].getDataCadastro());
//			System.out.println("");
//		}

		// adicionando dados para a Lista de Usuarios
		listaUsuario.add(new Usuario(1, "miguel", "miguel@gmail.com", "miguel123"));
		listaUsuario.add(new Usuario(2, "guilherme", "guilherme@gmail.com", "guilherme123"));
		listaUsuario.add(new Usuario(3, "matheus", "matheus@gmail.com", "matheus123"));
		listaUsuario.add(new Usuario(4, "ikram", "ikram@gmail.com", "ikram123"));

		removerUsuario("matheus");
	}

	private int id;
	private String nome, email, telefone, senha;
	private Date dataCadastro;
	private static List<Usuario> listaUsuario = new ArrayList<Usuario>();

	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "[id = " + id + ", nome = " + nome + ", email = " + email + ", senha = " + senha + "]";
	}

	public static List<Usuario> removerUsuario(String nome) {
		System.out.println("Entrou no método de remover usuario");
		Iterator<Usuario> iterator = listaUsuario.iterator(); // recebe a lista atualizada
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
/**
 * List é uma interface
 * 
 * Utilizaremos as classe ArrayList e LinkedList
 * 
 * A lista nao precisa identificar um tamanho na instancia
 * 
 * 
 * Map
 * 
 * armazena valores de chave - valor
 * 
 * 
 * Tipo de acesso Arraylist - randommico LinkedList - sequencial
 * 
 * 
 * 
 * 
 */
