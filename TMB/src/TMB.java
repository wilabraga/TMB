import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TMB {

	public void accessTMB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tmb", "root", "root");
		Statement statement = conn.createStatement();
		ResultSet resultset = statement.executeQuery("select * from user");
		while(resultset.next()) {
			System.out.println(resultset.getString(2));
		}
		resultset.close();
		System.out.println("yeet");
	}
}
