package jdbcConnection;

public class ConnectionFactoryTest {

	public static void main(String[] args) {
		 UsuarioDAO dao = new UsuarioDAO();
		Usuario miguel = new Usuario(1, "Miguel", "miguel123");
		dao.insert(miguel);

	}

}
