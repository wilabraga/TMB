import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Queries {
	
	public static ArrayList<String> getUserIDs() {
		String query = ""
				+ "SELECT ID "
				+ "FROM user;";
		ArrayList<String> IDs = new ArrayList<>();
		TMB.makeStatement();
		ArrayList<Object[]> result = TMB.executeQuery(query, "ID");
		for (Object[] arr: result) {
			IDs.add((String) arr[0]);
		}
		return IDs;
	}
	
	public static String getPassword(String ID) {
		String query = ""
				+ "SELECT password "
				+ "FROM user "
				+ "WHERE ID=(?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return (String) TMB.executePreparedQuery("password").get(0)[0];
	}
	
	public static boolean isAdmin(String ID) {
		String query = ""
				+ "SELECT ID "
				+ "FROM admin "
				+ "WHERE ID = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery("ID").size() > 0;
	}
	
	public static void addUser(String ID, String fName, String mInit, String lName, String password, String email) {
		String query = ""
				+ "INSERT INTO user "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setString(2, fName);
			psmt.setString(3, mInit);
			psmt.setString(4, lName);
			psmt.setString(5, password);
			psmt.setString(6, email);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static String[] getUserName(String ID) {
		String query = ""
				+ "SELECT first_name, last_name "
				+ "FROM user "
				+ "WHERE ID = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		Object[] result = TMB.executePreparedQuery("first_name", "last_name").get(0);
		return new String[] {(String) result[0], (String) result[1]};
	}
	
	public static ArrayList<String> getStationNames() {
		String query = ""
				+ "SELECT name "
				+ "FROM station "
				+ "ORDER BY name ASC;";
		ArrayList<String> names = new ArrayList<>();
		TMB.makeStatement();
		ArrayList<Object[]> result = TMB.executeQuery(query, "name");
		for (Object[] arr: result) {
			names.add((String) arr[0]);
		}
		return names;
	}
}
