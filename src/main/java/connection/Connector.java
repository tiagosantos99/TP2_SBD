package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	private static final String URL = "jdbc:mysql://localhost:3306/db_edc"; // NorthWindor another schema
	private static final String USER = "root"; // or userXX
	private static final String PASSWORD = "root";
	
	/** get MySQL Connection */
	public static Connection getConnection(String url, String user, String password) {
		try{
			return DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			System.out.println("Erroaoconectarcom a base de dados: "+ e.getMessage());
			return null;
		}
	}
	
	/** executaum comandoSQL de alteraçãode dados: insert, update, delete, ...*/
	private static int execute_change(String command, Connection conn) throws SQLException{
		System.out.println("Structure/data change: "+ command);
		// criarum statement para execuçãodirecta
		Statement stm= conn.createStatement();
		// executaro comando
		int retVal= stm.executeUpdate(command);
		// libertarstatement
		stm.close();
		return retVal;
	}
	
	
	private static void showDataFromSelect(String select, Connection conn) throws SQLException{
		System.out.println("Data from: "+ select+ "\n");
		// criarum comandopara execuçãodirecta
		Statement stm = conn.createStatement();
		// executaro comando
		stm.executeQuery(select);
		// obtero result set
		ResultSet rs = stm.getResultSet();
		// mostraro conteúdodo resultSet
		showDataFromResultSet(rs);
		// libertaro ResultSet
		rs.close();
		// libertarstatement
		stm.close();
	}
	
	
	private static void showDataFromResultSet(ResultSet rs) throws SQLException{
		// obtero númerode colunasdevolvidas
		int ncols= rs.getMetaData().getColumnCount();
		// para cadalinha-mostraro seuconteúdo
		while(rs.next()) {
			// obteratributos:começaem1
			for(int i = 1; i <= ncols; ++i) {
			// obtercomoObject,
			// pois nãose sabe o que foipedido
			Object val = rs.getObject(i);
			// mostrarvalordo atributo
			System.out.print(val);
			// separadorde atributo
			if(i < ncols)
				System.out.print(" -");
			}
			// separadorde linha
			System.out.println();
		}
	}
	
	/*
	public static void main(String[] args) throws SQLException{
		// open/get connection do BD
		Connection conn= getConnection(URL, USER, PASSWORD);
		System.out.println("Connected to BD: "+ URL+ " -user: "+ USER);
		System.out.println("\n");
		// create table T1
		try{
			execute_change("CREATE TABLE T1 (id INT, name VARCHAR(255))", conn);
		} catch(SQLException ex) {
			System.out.println("Erronainserçãode dados: " + ex.getMessage());
		}
		
		System.out.println("\n");
		// add data to T1
		try{
			execute_change("INSERT INTO T1 (id, name) VALUES (1,'John')", conn);
			execute_change("INSERT INTO T1 (id, name) VALUES (2,'Anna')", conn);
		} catch(SQLException ex) {
			System.out.println("Erronainserçãode dados: " + ex.getMessage());
		}
		
		System.out.println("\n");
		// show data from T1
		showDataFromSelect("SELECT * FROM T1 ORDER BY id", conn);
		System.out.println("\n");
		
		try{
			execute_change("DROP TABLE T1", conn);
		} catch(SQLException ex) {
			System.out.println("Erronaeliminaçãoda tabelaT1: " + ex.getMessage());
		}
		System.out.println("\n");
		// close connection
		conn.close();
		System.out.println("End.");
	}*/
}
