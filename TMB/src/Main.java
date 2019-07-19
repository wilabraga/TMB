import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TMB.accessTMB();
		//TMB.executeModification("delete from user");
		//ArrayList<Object[]> result = TMB.executeQuery("SELECT * FROM USER", "ID", "first_name", "minit", "last_name", "password", "passenger_email");
		//TMB.printResult(result);
		System.out.println(Queries.getUserIDs());
		System.out.println(Queries.getPassword(Queries.getUserIDs().get(2)));
		System.out.println(Queries.isAdmin("1"));
		System.out.println(Queries.isAdmin("2"));
		//Queries.addUser("5", "w", "m", "b", "aaa", "##@@");
		System.out.println(Queries.getUserName("1")[0]);
		System.out.println(Queries.getUserName("1")[1]);
		System.out.println(Queries.getStationNames());
		TMB.closeDatabase();
	}
}
