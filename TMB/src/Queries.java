import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
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
				+ "SELECT AVG(shopping) AS avg_shopping, AVG(connection_speed) AS avg_speed "
				+ "FROM review "
				+ "WHERE station_name = (?) AND approval_status = 'Approved';";
		ArrayList<int[]> ratings = new ArrayList<>();
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, stationName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Object[] result = TMB.executePreparedQuery("avg_shopping", "avg_speed").get(0);
		return new int[] {(int) result[0], (int) result[1]};
	}
	
	public static int getNumStops(String lineName) {
		String query = ""
				+ "SELECT COUNT(station_name) AS num_stations"
				+ "FROM station_on_line "
				+ "WHERE line_name = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, lineName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Object[] result = TMB.executePreparedQuery("num_stations").get(0);
		return (int) result[0];
	}
	
	public static ArrayList<Object[]> getStationsFromLine(String lineName, String order) {
		String query = ""
				+ "SELECT station_name, order_number "
				+ "FROM station_on_line "
				+ "WHERE line_name = (?) "
				+ "ORDER BY (?) ASC;";
		ArrayList<Object[]> stations = new ArrayList<>();
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, lineName);
			psmt.setString(2, order);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery("station_name", "order_number");
	}
	
	public static Object[] getUserInfo(String ID, String... attributes) {
		String query = ""
				+ "SELECT *"
				+ "FROM user "
				+ "WHERE ID = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery(attributes).get(0);
	}
	
	public static void updateUser(String originalID, String newID, String fName, String mInit, String lName, String password, String email) {
		String query = ""
				+ "UPDATE user "
				+ "SET ID = (?), first_name = (?), last_name = (?), password = (?), passenger_email = (?) "
				+ "WHERE ID = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, newID);
			psmt.setString(2, fName);
			psmt.setString(3, mInit);
			psmt.setString(4, lName);
			psmt.setString(5, password);
			psmt.setString(6, email);
			psmt.setString(7, originalID);
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static void deleteUserAccount(String ID) {
		String query = ""
				+ "DELETE FROM user "
				+ "WHERE ID = (?);";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
		query = ""
				+ "DELETE FROM review "
				+ "WHERE passenger_ID = (?);";
		psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
		query = ""
				+ "DELETE FROM card "
				+ "WHERE user_ID = (?);";
		psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
		query = ""
				+ "DELETE FROM trip "
				+ "WHERE user_ID = (?);";
		psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static void buyCard(String ID, String type, Timestamp purchaseDate, int usesLeft, Date expirationDate) {
		String query = ""
				+ "INSERT INTO card "
				+ "VALUES ((?), (?), (?), (?), (?));";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setString(2, type);
			psmt.setTimestamp(3, purchaseDate);
			psmt.setInt(4, usesLeft);
			psmt.setDate(5, expirationDate);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static ArrayList<Object[]> getUserValidCards(String ID, String... attributes) {
		String query = ""
				+ "SELECT * "
				+ "FROM card "
				+ "WHERE user_ID = (?) AND uses_left > 0 AND expiration_date >= CURDATE();";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery(attributes);
	}
	
	public static void embark(String ID, String type, Timestamp purchaseDate, Timestamp startTime, Timestamp endTime, String startStation, String endStation) {
		String query = ""
				+ "UPDATE card "
				+ "SET uses_left = uses_left - 1 "
				+ "WHERE user_ID = (?) AND type = (?) AND purchase_date_time = (?));";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setString(2, type);
			psmt.setTimestamp(3, purchaseDate);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
		query = ""
				+ "INSERT INTO trip "
				+ "VALUES ((?), (?), (?), (?), (?), (?), (?));";
		psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setString(2, type);
			psmt.setTimestamp(3, purchaseDate);
			psmt.setTimestamp(4, startTime);
			psmt.setTimestamp(5, endTime);
			psmt.setString(6, startStation);
			psmt.setString(7, endStation);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		TMB.executePreparedModification();
	}
	
	public static ArrayList<Object[]> getUserValidCards(String ID, String type, Timestamp purchaseDate, String order, String... attributes) {
		String query = ""
				+ "SELECT * "
				+ "FROM trip "
				+ "WHERE user_ID = (?) AND type = (?) AND purchase_date_time = (?)) "
				+ "ORDER BY (?) ASC;";
		PreparedStatement psmt = TMB.makePreparedStatement(query);
		try {
			psmt.setString(1, ID);
			psmt.setString(2, type);
			psmt.setTimestamp(3, purchaseDate);
			psmt.setString(4, type);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return TMB.executePreparedQuery(attributes);
	}
}
