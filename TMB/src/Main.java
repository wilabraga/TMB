import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TMB.accessTMB();
		ArrayList<Object[]> result = TMB.executeQuery("SELECT * FROM USER", "ID", "first_name", "minit", "last_name", "password", "passenger_email");
		TMB.printResult(result);
	}
}
