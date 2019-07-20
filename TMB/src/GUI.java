import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI {

	private JFrame frame;
	private JTextField txtid;
	private JTextField txtpw;
	private JTextField txtFirst;
	private JTextField txtMi;
	private JTextField txtLast;
	private JTextField txtEmail;
	private JTextField txtUID;
	private JTextField txtPassword;
	private JTextField txtPasswordagain;
	private JTextField txtComment;
	private JTable table;
	private JPanel panelLogin;
	private JPanel panelRegistration;
	private JPanel panelPassengerLanding;
	private JPanel panelLeaveReview;
	private JPanel panelViewReviews;
	public String loginidattempt;
	public String loginpwattempt;
	public String registerfirst;
	public String registermi;
	public String registerlast;
	public String registeremail;
	public String registerid;
	public String registerpw;
	public String registerpw2;
	public String userfirstname;
	public String userlastname;
	public String[] stars = {"--","1","2","3","4","5"};
	private JTextField txtOldComment;
	public String reviewstationname;
	public String reviewshopping;
	public String reviewconnectionspeed;
	public String reviewcomment;
	public JComboBox comboBox;
	public JComboBox shoppingstars;
	public JComboBox csstars;
	
	
	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		frame.getContentPane().add(panelLogin, "name_75292580775046");
		panelLogin.setLayout(null);
		panelLogin.setVisible(true);
		
		JPanel panelRegistration = new JPanel();
		frame.getContentPane().add(panelRegistration, "name_75295235661086");
		panelRegistration.setLayout(null);
		panelRegistration.setVisible(false);
		
		JPanel panelPassengerLanding = new JPanel();
		frame.getContentPane().add(panelPassengerLanding, "name_75573884258365");
		panelPassengerLanding.setLayout(null);
		panelPassengerLanding.setVisible(false);
		
		JPanel panelViewReviews = new JPanel();
		frame.getContentPane().add(panelViewReviews, "name_76504429508073");
		panelViewReviews.setLayout(null);
		panelViewReviews.setVisible(false);
		
        
        JPanel panelEditReview = new JPanel();
        frame.getContentPane().add(panelEditReview, "name_110293474217147");
        panelEditReview.setLayout(null);
        panelEditReview.setVisible(false);
        
        JPanel panelLeaveReview2 = new JPanel();
        frame.getContentPane().add(panelLeaveReview2, "name_112539121522733");
        panelViewReviews.setVisible(false);
        
        JPanel panelStationInfo = new JPanel();
        frame.getContentPane().add(panelStationInfo, "name_116178640692044");
        panelStationInfo.setLayout(null);
        panelStationInfo.setVisible(false);
		
		//Login
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(6, 6, 61, 16);
		panelLogin.add(lblLogin);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(112, 52, 61, 16);
		panelLogin.add(lblId);
		
		txtid = new JTextField();
		txtid.setBounds(174, 47, 130, 26);
		panelLogin.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(73, 90, 61, 16);
		panelLogin.add(lblPassword);
		
		txtpw = new JTextField();
		txtpw.setBounds(174, 85, 130, 26);
		panelLogin.add(txtpw);
		txtpw.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRegistration.setVisible(true);
				panelLogin.setVisible(false);
			}
		});
		btnRegister.setBounds(73, 198, 117, 74);
		panelLogin.add(btnRegister);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(255, 198, 117, 74);
		panelLogin.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				if (s.equals("Login")){
					loginidattempt = txtid.getText();
					loginpwattempt = txtpw.getText();
				}
			}
		});
		
		//need to determine the user type
			
		//Registration
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(16, 6, 61, 16);
		panelRegistration.add(lblRegister);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(16, 34, 61, 16);
		panelRegistration.add(lblName);
		
		txtFirst = new JTextField();
		txtFirst.setText("First");
		txtFirst.setBounds(16, 62, 130, 26);
		panelRegistration.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtMi = new JTextField();
		txtMi.setText("MI");
		txtMi.setBounds(158, 62, 130, 26);
		panelRegistration.add(txtMi);
		txtMi.setColumns(10);
		
		txtLast = new JTextField();
		txtLast.setText("Last");
		txtLast.setBounds(300, 62, 130, 26);
		panelRegistration.add(txtLast);
		txtLast.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(16, 119, 414, 26);
		panelRegistration.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtUID = new JTextField();
		txtUID.setText("User ID (must be unique)");
		txtUID.setBounds(16, 169, 414, 26);
		panelRegistration.add(txtUID);
		txtUID.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(16, 207, 193, 26);
		panelRegistration.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtPasswordagain = new JTextField();
		txtPasswordagain.setText("Password (again)");
		txtPasswordagain.setBounds(237, 207, 193, 26);
		panelRegistration.add(txtPasswordagain);
		txtPasswordagain.setColumns(10);
		
		JButton btnRegister_1 = new JButton("Register");
		btnRegister_1.setBounds(313, 243, 117, 29);
		panelRegistration.add(btnRegister_1);
		btnRegister_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				if (s.equals("Register")){
					registerfirst = txtFirst.getText();
					registermi = txtMi.getText();
					registerlast = txtLast.getText();
					registeremail = txtEmail.getText();
					registerid = txtUID.getText();
					registerpw = txtPassword.getText();
					registerpw2 = txtPasswordagain.getText(); 
				}
				if (registerpw.contentEquals(registerpw2) == false){
					JOptionPane.showMessageDialog(panelRegistration, "Passwords do not match!");
				}
				if (registerpw.length()<8) {
					JOptionPane.showMessageDialog(panelRegistration, "Password must have at least 8 characters!");
				}
				if (registerpw.contentEquals(registerpw2) && registerpw.length()>=8){
					panelRegistration.setVisible(false);
					panelPassengerLanding.setVisible(true);
				}
			}
		});
		
		//need to check if registerid is unique (not in database) !!!!
		//only used to create passenger accounts !!!
		//display error message
		
		// add all information to the database
		
		

		//passengerlanding
		
		//get user first and last name from database
		
		
		JLabel lblWelcomename = new JLabel("Welcome " + userfirstname + " " + userlastname);
		lblWelcomename.setBounds(6, 6, 200, 16);
		panelPassengerLanding.add(lblWelcomename);
		
		JButton btnLeaveReview = new JButton("Leave Review");
		btnLeaveReview.setBounds(56, 34, 117, 66);
		panelPassengerLanding.add(btnLeaveReview);
		btnLeaveReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Station");
				shoppingstars.setSelectedItem("--");
				csstars.setSelectedItem("--");
				panelLeaveReview2.setVisible(true);
				panelPassengerLanding.setVisible(false);
			}
		});
		
		
		JButton btnViewReviews = new JButton("View Reviews");
		btnViewReviews.setBounds(56, 119, 117, 70);
		panelPassengerLanding.add(btnViewReviews);
		btnViewReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelViewReviews.setVisible(true);
				panelPassengerLanding.setVisible(false);
			}
		});
		
		JButton btnBuyCards = new JButton("Buy Card");
		btnBuyCards.setBounds(56, 201, 117, 71);
		panelPassengerLanding.add(btnBuyCards);
		
		JButton btnGoOnTrip = new JButton("Go On Trip");
		btnGoOnTrip.setBounds(245, 37, 117, 66);
		panelPassengerLanding.add(btnGoOnTrip);
		
		JButton btnViewTrips = new JButton("View Trips");
		btnViewTrips.setBounds(245, 119, 117, 70);
		panelPassengerLanding.add(btnViewTrips);
		
		JButton btnEditTrips = new JButton("Edit Profile");
		btnEditTrips.setBounds(245, 201, 117, 71);
		panelPassengerLanding.add(btnEditTrips);
		panelLeaveReview2.setLayout(null);
		

		
		
		
		//leave reviews
		//take all info and store it in database
		
	
		
		JLabel lblLeaveAReview = new JLabel("Leave a Review");
		lblLeaveAReview.setBounds(35, 10, 93, 16);
		panelLeaveReview2.add(lblLeaveAReview);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Station","test1"}));
		comboBox.setBounds(35, 38, 143, 27);
		panelLeaveReview2.add(comboBox);
		
		//stations should be pulled from the database, stored alphabetically, then aaded to the combo box above

				
		JLabel lblShoppimg = new JLabel("Shopping");
		lblShoppimg.setBounds(35, 94, 59, 16);
		panelLeaveReview2.add(lblShoppimg);
				
		JLabel lblConnectionSpeed = new JLabel("Connection Speed");
		lblConnectionSpeed.setBounds(35, 122, 113, 16);
		panelLeaveReview2.add(lblConnectionSpeed);
			
		JLabel lblComment = new JLabel("Comment (optional)");
		lblComment.setBounds(35, 150, 125, 16);
		panelLeaveReview2.add(lblComment);
				
		JLabel lblRatingstars = new JLabel("Rating (stars)");
		lblRatingstars.setBounds(190, 62, 83, 16);
		panelLeaveReview2.add(lblRatingstars);
				
				
		shoppingstars = new JComboBox(stars);
		shoppingstars.setBounds(189, 90, 64, 27);
		panelLeaveReview2.add(shoppingstars);
				
		csstars = new JComboBox(stars);
		csstars.setBounds(189, 118, 64, 27);
		panelLeaveReview2.add(csstars);
				
		txtComment = new JTextField();
		txtComment.setBounds(35, 173, 392, 69);
		panelLeaveReview2.add(txtComment);
		txtComment.setColumns(10);
				
		JButton btnLeaveReview_1 = new JButton("Submit Review");
		btnLeaveReview_1.setBounds(302, 243, 135, 29);
		panelLeaveReview2.add(btnLeaveReview_1);
		btnLeaveReview_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				if (s.equals("Submit Review")){
					reviewstationname = comboBox.getSelectedItem().toString();
					reviewshopping = shoppingstars.getSelectedItem().toString();
					reviewconnectionspeed = csstars.getSelectedItem().toString();
					reviewcomment = txtComment.getText(); 
				}
				if (reviewstationname.equals("Station")){
					JOptionPane.showMessageDialog(panelLeaveReview, "Station must be selected");
				}
				else if (reviewshopping.equals("--") || reviewconnectionspeed.equals("--")){
					JOptionPane.showMessageDialog(panelLeaveReview, "Please complete both star reviews.");
				}
				else{
					panelPassengerLanding.setVisible(true);
					panelLeaveReview.setVisible(false);
				}
			}
		});
		
		
	
		//View Reviews
		
		JLabel viewreviews = new JLabel("NAME'S REVIEWS");
		viewreviews.setBounds(16, 6, 243, 16);
		panelViewReviews.add(viewreviews);
		
		
		
		Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "R1C4", "R1C5", "R1C6" }};
		Object columnNames[] = { "ID", "Station", "Shopping", "Connection Speed", "Comment", "Approval Status"};
		JTable table = new JTable(rowData, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setLocation(6, 23);
		scrollPane.setSize(444, 249);
		panelViewReviews.add(scrollPane, BorderLayout.CENTER);
		
		
       
       
        
        
        //EDIT REVIEW

        
        JLabel lblEditReview = new JLabel("Edit Review : \"STATION NAME\"");
        lblEditReview.setBounds(17, 18, 270, 16);
        panelEditReview.add(lblEditReview);
        
        JLabel lblReviewStatus = new JLabel("Status");
        lblReviewStatus.setBounds(352, 18, 61, 16);
        panelEditReview.add(lblReviewStatus);
        
        JLabel lblId_1 = new JLabel("ID");
        lblId_1.setBounds(27, 56, 61, 16);
        panelEditReview.add(lblId_1);
        
        JLabel lblShopping = new JLabel("Shopping");
        lblShopping.setBounds(27, 107, 61, 16);
        panelEditReview.add(lblShopping);
        
        JLabel lblConnectionSpeed_1 = new JLabel("Connection Speed");
        lblConnectionSpeed_1.setBounds(27, 145, 155, 16);
        panelEditReview.add(lblConnectionSpeed_1);
        
        JLabel lblComment_1 = new JLabel("Comment");
        lblComment_1.setBounds(27, 161, 61, 16);
        panelEditReview.add(lblComment_1);
        
        txtOldComment = new JTextField();
        txtOldComment.setText("old comment!!!");
        txtOldComment.setBounds(17, 182, 396, 50);
        panelEditReview.add(txtOldComment);
        txtOldComment.setColumns(10);
        
        JLabel lblidNum = new JLabel("\"ID NUM\"");
        lblidNum.setBounds(242, 56, 61, 16);
        panelEditReview.add(lblidNum);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(259, 103, 52, 27);
        panelEditReview.add(comboBox_1);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(259, 141, 52, 27);
        panelEditReview.add(comboBox_2);
        
        JLabel lblRatingstars_1 = new JLabel("Rating (stars)");
        lblRatingstars_1.setBounds(239, 75, 136, 16);
        panelEditReview.add(lblRatingstars_1);
        
        JButton btnDeleteReview = new JButton("Delete Review");
        btnDeleteReview.setBounds(45, 244, 117, 29);
        panelEditReview.add(btnDeleteReview);
        
        JButton btnSaveReview = new JButton("Save Review");
        btnSaveReview.setBounds(245, 244, 117, 29);
        panelEditReview.add(btnSaveReview);
        

        
        
        
        
        
        //STATION INFO
        
        
        JLabel lblStationName = new JLabel("STATION NAME");
        lblStationName.setBounds(6, 6, 127, 16);
        panelStationInfo.add(lblStationName);
        
        JLabel lblStatus = new JLabel("Status : STATUS");
        lblStatus.setBounds(324, 6, 120, 16);
        panelStationInfo.add(lblStatus);
        
        JLabel lblAddress = new JLabel("Address : ADDRESS");
        lblAddress.setBounds(27, 34, 396, 16);
        panelStationInfo.add(lblAddress);
        
        JLabel lblLinesLines = new JLabel("Lines : LINES");
        lblLinesLines.setBounds(29, 65, 255, 16);
        panelStationInfo.add(lblLinesLines);
        
        JLabel lblAverageShopping = new JLabel("Average Shopping : AVGSHOP");
        lblAverageShopping.setBounds(6, 93, 234, 16);
        panelStationInfo.add(lblAverageShopping);
        
        JLabel lblAverageConnectionSpeed = new JLabel("Average Connection Speed : AVGCS");
        lblAverageConnectionSpeed.setBounds(217, 93, 227, 16);
        panelStationInfo.add(lblAverageConnectionSpeed);
        
        JLabel lblReviews = new JLabel("Reviews");
        lblReviews.setBounds(27, 124, 61, 16);
        panelStationInfo.add(lblReviews);
        
        Object rowData2[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "R1C4"}};
		Object columnNames2[] = { "User", "Shopping", "Connection Speed", "Comment"};
		JTable table2 = new JTable(rowData2, columnNames2);
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setLocation(6, 142);
		scrollPane2.setSize(444, 130);
		panelStationInfo.add(scrollPane2, BorderLayout.CENTER);
		
		
        
		
	}
}
	
