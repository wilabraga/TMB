import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TMB {
	
	private static Connection conn;
	private static Statement statement;

	public static void accessTMB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tmb", "root", "root");
		statement = conn.createStatement();
	}
	
	public static ArrayList<Object[]> executeQuery(String query, String... attributes) throws SQLException {
		ResultSet resultSet = statement.executeQuery(query);
		ArrayList<Object[]> result = new ArrayList<>();
		while (resultSet.next()) {
			Object[] tuple = new Object[attributes.length];
			for(int i = 0; i < tuple.length; i++) {
				tuple[i] = resultSet.getObject(attributes[i]);
			}
			result.add(tuple);
		}
		resultSet.close();
		return result;
	}
	
	public static void executeModification(String modify) throws SQLException {
		statement.execute(modify);
	}
	
	public static void printResult(ArrayList<Object[]> result) {
		for (Object[] arr: result) {
			for (Object o: arr) {
				System.out.print(o + "\t");
			}
			System.out.println();
		}
	}
	
	public static void closeDatabase() throws SQLException {
		statement.close();
		conn.close();
	}
}
