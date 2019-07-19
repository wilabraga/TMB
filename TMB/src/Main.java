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
		TMB.closeDatabase();
	}
}
