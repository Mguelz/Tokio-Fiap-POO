package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conectar() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "root", "root");
		} catch (SQLException e) {
			System.out.println("Erro na conexao" + e + "\n");
			throw new RuntimeException(e);
		}
	}
}
