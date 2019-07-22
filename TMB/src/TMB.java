import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TMB {

	private static Connection conn;
	private static Statement statement;

	public static void accessTMB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tmb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void makeStatement() {
		try {
			statement = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static PreparedStatement makePreparedStatement(String sql) {
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			statement = psmt;
			return psmt;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void closeStatement() {
		try {
			if (statement != null) {
				statement.close();
				statement = null;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static ArrayList<Object[]> executeQuery(String query, String... attributes) {
		try {
			ResultSet resultSet = statement.executeQuery(query);
			return processResultSet(resultSet, attributes);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static ArrayList<Object[]> executePreparedQuery(String... attributes) {
		try {
			PreparedStatement psmt = (PreparedStatement) statement;
			ResultSet resultSet = psmt.executeQuery();
			return processResultSet(resultSet, attributes);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	private static ArrayList<Object[]> processResultSet(ResultSet resultSet, String... attributes) {
		try {
			ArrayList<Object[]> result = new ArrayList<>();
			while (resultSet.next()) {
				Object[] tuple = new Object[attributes.length];
				for(int i = 0; i < tuple.length; i++) {
					tuple[i] = resultSet.getObject(attributes[i]);
				}
				result.add(tuple);
			}
			resultSet.close();
			closeStatement();
			return result;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void executeModification(String modify) {
		try {
			statement.execute(modify);
			closeStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void executePreparedModification() {
		try {
			PreparedStatement psmt = (PreparedStatement) statement;
			psmt.execute();
			closeStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
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
		closeStatement();
		conn.close();
	}
}
