package jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar(); // conecta com o bd
	}

	// insert
	public void insert(Usuario usuario) {
		String sql = "insert into usuario (id, nome, senha, dataCadastro) values (?,?,?,?)"; // esta incompleto, por
																								// isso o
																								// PreparedStatment

		try {
			PreparedStatement ps = conexao.prepareStatement(sql); // pega o comando sql e vincula a conexao e guarda na
																	// variavel, porque o comando do sql esta imcompleto
			// posicoes de acordo com a posição colocadas no sql neste caso - (id, nome, senha, dataCadastro)
			ps.setLong(1, usuario.getId());
			ps.setString(2, usuario.getNome());
			ps.setString(3, usuario.getSenha());
			ps.setDate(4, usuario.getDataCadastro());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// selectAll
	public List<Usuario> selecionarAll() {
		return null;
	}

	// selectBtId
	public Usuario selecionarById(long id) {
		return null;
	}

	// update
	public void update(Usuario usuario) {

	}

	// delete
	public void delete(long id) {

	}

}
