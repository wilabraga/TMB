import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	TMB.accessTMB();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	//	TMB.closeDatabase();
	}
}
