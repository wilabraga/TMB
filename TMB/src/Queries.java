import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
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
	
	public static void addReview(String ID, int rID, int shopping, int connectionSpeed, String comment, String adminID, String status, Time timestamp, String stationName) {
		String query = ""
				+ "INSERT INTO review "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setInt(2, rID);
			psmt.setInt(3, shopping);
			psmt.setInt(4, connectionSpeed);
			psmt.setString(5, comment);
			psmt.setString(6, adminID);
			psmt.setString(7, status);
			psmt.setTime(8, timestamp);
			psmt.setString(9, stationName);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static ArrayList<Object[]> getReviews(String order) {
		String query = ""
				+ "SELECT rid, station_name, shopping, connection_speed, comment, approval_status "
				+ "FROM review "
				+ "ORDER BY (?) ASC;";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, order);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery("rid", "station_name", "shopping", "connection_speed", "comment", "approval_status");
	}
	
	public static Object[] getReview(int rid, String... attributes) {
		String query = ""
				+ "SELECT *"
				+ "FROM review "
				+ "WHERE rid = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setInt(1, rid);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery(attributes).get(0);
	}
	
	public static void updateReview(int rid, int shopping, int connectionSpeed, String comment, String status, Time timestamp) {
		String query = ""
				+ "UPDATE review "
				+ "SET shopping = (?), connection_speed = (?), comment = (?), approval_status = (?), edit_timestamp = (?) "
				+ "WHERE rid = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setInt(1, shopping);
			psmt.setInt(2, connectionSpeed);
			psmt.setString(3, comment);
			psmt.setString(4, status);
			psmt.setTime(5, timestamp);
			psmt.setInt(6, rid);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static void deleteReview(int rid) {
		String query = ""
				+ "DELETE FROM review "
				+ "WHERE rid = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setInt(1, rid);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static Object[] getStation(String name, String... attributes) {
		String query = ""
				+ "SELECT *"
				+ "FROM station "
				+ "WHERE name = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, name);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery(attributes).get(0);
	}
	
	public static ArrayList<String> getLinesFromStation(String stationName) {
		String query = ""
				+ "SELECT line_name "
				+ "FROM station_on_line "
				+ "WHERE station_name = (?) "
				+ "ORDER BY line_name ASC;";
		ArrayList<String> names = new ArrayList<>();
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, stationName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ArrayList<Object[]> result = TMB.executePreparedQuery("line_name");
		for (Object[] arr: result) {
			names.add((String) arr[0]);
		}
		return names;
	}
	
	public static int[] getAvgRatings(String stationName) {
		String query = ""
				+ "SELECT AVG(shopping), AVG(connection_speed) "
				+ "FROM review "
				+ "WHERE station_name = (?) AND approval_status = 'Approved';";
		ArrayList<int[]> ratings = new ArrayList<>();
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, stationName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Object[] result = TMB.executePreparedQuery("line_name").get(0);
		return new int[] {(int) result[0], (int) result[1]};
	}
}
