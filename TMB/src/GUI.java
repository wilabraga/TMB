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
import javax.swing.ButtonGroup;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


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
	//SESSION INFORMATION --JB
	public String userfirstname;
	public String userlastname;
	public String userID;
	public boolean isAdmin;
	public String[] stars = {"--","1","2","3","4","5"};
	private JTextField txtOldComment;
	public String reviewstationname;
	public String reviewshopping;
	public String reviewconnectionspeed;
	public String reviewcomment;
	public JComboBox comboBox;
	public JComboBox shoppingstars;
	public JComboBox csstars;
	private JTextField txtFirstName;
	private JTextField txtMiddlein;
	private JTextField txtLastname;
	private JTextField txtEmail_1;
	private JTextField txtUserid;
	private JTextField txtPassword_1;
	private JTextField txtPassword_2;
	private JTextField txtFirstname;
	private JTextField txtMiddlein_1;
	private JTextField txtLastname_1;
	private JTextField txtUserid_1;
	private JTextField txtPassword_3;
	private JTextField txtPassword_4;
	private JTextField txtStationName;
	private JTextField txtStreetAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtPostalCode;
	private JTextField txtOrder;
	private JTextField txtLineName;
	private JTextField txtOrder_1;
	public JLabel lblWelcomename;
	public JLabel lblWelcomeName;
	
	



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
        
		JPanel panelLineSummary = new JPanel();
		frame.getContentPane().add(panelLineSummary, "name_116847732626867");
		panelLineSummary.setLayout(null);
		panelLineSummary.setVisible(false);
		
		
		JPanel panelBuyCard = new JPanel();
		frame.getContentPane().add(panelBuyCard, "name_118269236130479");
		panelBuyCard.setLayout(null);
		panelBuyCard.setVisible(false);
		
		
		JPanel panelEditProfile = new JPanel();
		frame.getContentPane().add(panelEditProfile, "name_117153285834010");
		panelEditProfile.setLayout(null);
		panelEditProfile.setVisible(false);
		
		JPanel panelViewTrips = new JPanel();
		frame.getContentPane().add(panelViewTrips, "name_118708450389034");
		panelViewTrips.setLayout(null);
		
		
		JPanel panelGoOnATrip = new JPanel();
		frame.getContentPane().add(panelGoOnATrip, "name_118392332897193");
		panelGoOnATrip.setLayout(null);
		panelGoOnATrip.setVisible(false);
		
		JPanel panelUpdateTrip = new JPanel();
		frame.getContentPane().add(panelUpdateTrip, "name_118936376777311");
		panelUpdateTrip.setLayout(null);
		
		JPanel panelAdminLanding = new JPanel();
		frame.getContentPane().add(panelAdminLanding, "name_119110396471857");
		panelAdminLanding.setLayout(null);
		
		
		JPanel panelPendingReviews = new JPanel();
		frame.getContentPane().add(panelPendingReviews, "name_119320537598432");
		panelPendingReviews.setLayout(null);
		
		
		JPanel panelEditProfileAD = new JPanel();
		frame.getContentPane().add(panelEditProfileAD, "name_119594530220165");
		panelEditProfileAD.setLayout(null);
		
		JPanel panelAddStation = new JPanel();
		frame.getContentPane().add(panelAddStation, "name_120015002666853");
		panelAddStation.setLayout(null);
		
		
		JPanel panelAddLine = new JPanel();
		frame.getContentPane().add(panelAddLine, "name_120405071029218");
		panelAddLine.setLayout(null);
		
		
		JPanel panelLineSummaryAD = new JPanel();
		frame.getContentPane().add(panelLineSummaryAD, "name_120586777795513");
		panelLineSummaryAD.setLayout(null);
		
		JPanel panelStationInfoAD = new JPanel();
		frame.getContentPane().add(panelStationInfoAD, "name_120703525918700");
		panelStationInfoAD.setLayout(null);
		
		
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
					ArrayList<String> ids = Queries.getUserIDs();
					boolean idExists = false;
					for(String id: ids) {
						if (id.equals(loginidattempt)) {
							idExists = true;
						}
					}
					
					if (idExists) {
						if (loginpwattempt.equals(Queries.getPassword(loginidattempt))) {
							isAdmin = Queries.isAdmin(loginidattempt);
							userfirstname = Queries.getUserName(loginidattempt)[0];
							//JOptionPane.showMessageDialog(panelLogin, Queries.getUserName(loginidattempt)[0]);
							userlastname = Queries.getUserName(loginidattempt)[1];
							userID = loginidattempt;
							
							if (isAdmin) {
								lblWelcomeName.setText("Welcome " + userfirstname + " " + userlastname);
								panelAdminLanding.setVisible(true);
								panelLogin.setVisible(false);
							} else {
								lblWelcomename.setText("Welcome " + userfirstname + " " + userlastname);
								panelPassengerLanding.setVisible(true);
								panelLogin.setVisible(false);
							}
						} else {
							JOptionPane.showMessageDialog(panelLogin, "Incorrect password!");
						}
					} else {
						JOptionPane.showMessageDialog(panelLogin, "User ID does not exist! Haven't created an account yet? Click 'register'!");
					}
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
				//MAKE SURE ID DOESN'T EXIST
				ArrayList<String> ids = Queries.getUserIDs();
				boolean idExists = false;
				for(String id: ids) {
					if (id.equals(registerid)) {
						idExists = true;
					}
				}
				if (idExists) {
					JOptionPane.showMessageDialog(panelRegistration, "User ID already exists!");
				}
				if (registerpw.contentEquals(registerpw2) && registerpw.length()>=8 && !idExists){
					//ADDING TO DATABASE --JB
					Queries.addUser(registerid, registerfirst, registermi, registerlast, registerpw, registeremail);
					
					userfirstname = registerfirst;
					userlastname = registerlast;
					userID = registerid;
					lblWelcomename.setText("Welcome " + userfirstname + " " + userlastname);
					JOptionPane.showMessageDialog(panelRegistration, "Registration Successful!");
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
		
		
		lblWelcomename = new JLabel("Welcome " + userfirstname + " " + userlastname);
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
		btnBuyCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBuyCard.setVisible(true);
				panelPassengerLanding.setVisible(false);
			}
		});
		btnBuyCards.setBounds(56, 201, 117, 71);
		panelPassengerLanding.add(btnBuyCards);
		
		JButton btnGoOnTrip = new JButton("Go On Trip");
		btnGoOnTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelGoOnATrip.setVisible(true);
				panelPassengerLanding.setVisible(false);
				
			}
		});
		btnGoOnTrip.setBounds(245, 37, 117, 66);
		panelPassengerLanding.add(btnGoOnTrip);
		
		JButton btnViewTrips = new JButton("View Trips");
		btnViewTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelViewTrips.setVisible(true);
				panelPassengerLanding.setVisible(false);
			}
		});
		btnViewTrips.setBounds(245, 119, 117, 70);
		panelPassengerLanding.add(btnViewTrips);
		
		JButton btnEditTrips = new JButton("Edit Profile");
		btnEditTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEditProfile.setVisible(true);
				panelPassengerLanding.setVisible(false);
			}
		});
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
		scrollPane.setLocation(6, 54);
		scrollPane.setSize(444, 218);
		panelViewReviews.add(scrollPane, BorderLayout.CENTER);
		
		ButtonGroup rdbtnViewReviews = new ButtonGroup();
		
		JRadioButton rdbtnID = new JRadioButton("");
		rdbtnID.setBounds(26, 34, 37, 23);
		panelViewReviews.add(rdbtnID);
		
		JRadioButton rdbtnStation = new JRadioButton("");
		rdbtnStation.setBounds(90, 34, 51, 23);
		panelViewReviews.add(rdbtnStation);
		
		JRadioButton rdbtnShopping = new JRadioButton("");
		rdbtnShopping.setBounds(170, 34, 37, 23);
		panelViewReviews.add(rdbtnShopping);
		
		JRadioButton rdbtnConnectionSpeed = new JRadioButton("");
		rdbtnConnectionSpeed.setBounds(242, 34, 28, 23);
		panelViewReviews.add(rdbtnConnectionSpeed);
		
		JRadioButton rdbtnComment = new JRadioButton("");
		rdbtnComment.setBounds(321, 34, 28, 23);
		panelViewReviews.add(rdbtnComment);
		
		JRadioButton rdbtnApprovalStatus = new JRadioButton("");
		rdbtnApprovalStatus.setBounds(394, 34, 28, 23);
		panelViewReviews.add(rdbtnApprovalStatus);
		
		rdbtnViewReviews.add(rdbtnID);
		rdbtnViewReviews.add(rdbtnStation);
		rdbtnViewReviews.add(rdbtnShopping);
		rdbtnViewReviews.add(rdbtnConnectionSpeed);
		rdbtnViewReviews.add(rdbtnComment);
		rdbtnViewReviews.add(rdbtnComment);
       
       
        
        
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
		
		
		
		
		
		
		//LINE SUMMARY 
		

		
		JLabel lblLineLine = new JLabel("Line : LINE#");
		lblLineLine.setBounds(6, 6, 145, 16);
		panelLineSummary.add(lblLineLine);
		
		JLabel lblStops = new JLabel("# Stops");
		lblStops.setBounds(366, 6, 61, 16);
		panelLineSummary.add(lblStops);
		
		Object rowData3[][] = { { "Row1-Column1", "Row1-Column2"}};
		Object columnNames3[] = { "Station", "Order"};
		JTable table3 = new JTable(rowData3, columnNames3);
		JScrollPane scrollPane3 = new JScrollPane(table3);
		scrollPane3.setLocation(6, 50);
		scrollPane3.setSize(434, 2228);
		panelLineSummary.add(scrollPane3, BorderLayout.CENTER);
		
		JRadioButton rdbtnStationLS = new JRadioButton("");
		rdbtnStationLS.setBounds(93, 26, 46, 23);
		panelLineSummary.add(rdbtnStationLS);
		
		JRadioButton rdbtnOrder = new JRadioButton("");
		rdbtnOrder.setBounds(275, 26, 33, 23);
		panelLineSummary.add(rdbtnOrder);
		
		ButtonGroup rdbtnLineSummary = new ButtonGroup();
		rdbtnLineSummary.add(rdbtnStationLS);
		rdbtnLineSummary.add(rdbtnOrder);
		
			
		
		// Edit Profile
		
		
		JLabel lblEditProfile = new JLabel("Edit Profile");
		lblEditProfile.setBounds(17, 6, 118, 16);
		panelEditProfile.add(lblEditProfile);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(17, 23, 61, 16);
		panelEditProfile.add(lblName_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("FIRSTNAME");
		txtFirstName.setBounds(5, 46, 130, 26);
		panelEditProfile.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtMiddlein = new JTextField();
		txtMiddlein.setText("MIDDLEIN");
		txtMiddlein.setBounds(159, 46, 130, 26);
		panelEditProfile.add(txtMiddlein);
		txtMiddlein.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setText("LASTNAME");
		txtLastname.setBounds(301, 46, 130, 26);
		panelEditProfile.add(txtLastname);
		txtLastname.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(17, 84, 61, 16);
		panelEditProfile.add(lblEmail);
		
		txtEmail_1 = new JTextField();
		txtEmail_1.setText("EMAIL");
		txtEmail_1.setBounds(90, 79, 130, 26);
		panelEditProfile.add(txtEmail_1);
		txtEmail_1.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(17, 127, 61, 16);
		panelEditProfile.add(lblUserId);
		
		txtUserid = new JTextField();
		txtUserid.setText("USERID");
		txtUserid.setBounds(100, 122, 130, 26);
		panelEditProfile.add(txtUserid);
		txtUserid.setColumns(10);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(27, 165, 61, 16);
		panelEditProfile.add(lblPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(270, 165, 130, 16);
		panelEditProfile.add(lblConfirmPassword);
		
		txtPassword_1 = new JTextField();
		txtPassword_1.setText("PASSWORD");
		txtPassword_1.setBounds(27, 193, 130, 26);
		panelEditProfile.add(txtPassword_1);
		txtPassword_1.setColumns(10);
		
		txtPassword_2 = new JTextField();
		txtPassword_2.setText("PASSWORD");
		txtPassword_2.setBounds(253, 188, 130, 26);
		panelEditProfile.add(txtPassword_2);
		txtPassword_2.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(34, 229, 117, 29);
		panelEditProfile.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(249, 229, 117, 29);
		panelEditProfile.add(btnUpdate);
		
		
		
		// BUY CARD
	
		
		JButton btnTmes = new JButton("T-mes");
		btnTmes.setBounds(40, 58, 117, 77);
		panelBuyCard.add(btnTmes);
		
		JButton btnT = new JButton("T-10");
		btnT.setBounds(245, 58, 117, 71);
		panelBuyCard.add(btnT);
		
		JButton btnT_1 = new JButton("T-50/30");
		btnT_1.setBounds(40, 170, 117, 71);
		panelBuyCard.add(btnT_1);
		
		JButton btnTjove = new JButton("T-jove");
		btnTjove.setBounds(245, 170, 117, 77);
		panelBuyCard.add(btnTjove);
		
		JLabel lblBuyCard = new JLabel("Buy Card");
		lblBuyCard.setBounds(22, 6, 61, 16);
		panelBuyCard.add(lblBuyCard);
		
		//GO ON A TRIP
		
	
		
		JLabel lblGoonatrip = new JLabel("Go on a Trip");
		lblGoonatrip.setBounds(17, 6, 187, 16);
		panelGoOnATrip.add(lblGoonatrip);
		
		JLabel lblStartStation = new JLabel("Start Station");
		lblStartStation.setBounds(60, 50, 144, 16);
		panelGoOnATrip.add(lblStartStation);
		
		JLabel lblCardUsed = new JLabel("Card Used");
		lblCardUsed.setBounds(60, 151, 109, 16);
		panelGoOnATrip.add(lblCardUsed);
		
		JComboBox comboBoxStation = new JComboBox();
		comboBoxStation.setBounds(290, 46, 52, 27);
		panelGoOnATrip.add(comboBoxStation);
		
		JComboBox comboBoxCard = new JComboBox();
		comboBoxCard.setBounds(290, 151, 52, 27);
		panelGoOnATrip.add(comboBoxCard);
		
		JButton btnEmbark = new JButton("Embark");
		btnEmbark.setBounds(235, 203, 153, 55);
		panelGoOnATrip.add(btnEmbark);
		

		
		
		//MY TRIPS
		

		
		JLabel lblMyTrips = new JLabel("My Trips");
		lblMyTrips.setBounds(6, 6, 61, 16);
		panelViewTrips.add(lblMyTrips);
		panelViewTrips.setVisible(false);
		
		Object rowData4[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "R1C4", "R1C5"}};
		Object columnNames4[] = { "Start DateTime", "End DateTime", "CardUsed", "From", "To"};
		JTable table4 = new JTable(rowData4, columnNames4);
		JScrollPane scrollPane4 = new JScrollPane(table4);
		scrollPane4.setLocation(6, 23);
		scrollPane4.setSize(444, 249);
		panelViewTrips.add(scrollPane4, BorderLayout.CENTER);
		
		
		
		//UPDATE TRIP
		
		JLabel lblUpdateTrip = new JLabel("Update Trip");
		lblUpdateTrip.setBounds(6, 6, 142, 16);
		panelUpdateTrip.add(lblUpdateTrip);
		
		JLabel lblStartStationUpdate = new JLabel("Start Station     STATION NAME");
		lblStartStationUpdate.setBounds(40, 48, 223, 16);
		panelUpdateTrip.add(lblStartStationUpdate);
		
		JLabel lblEndStation = new JLabel("End Station");
		lblEndStation.setBounds(40, 106, 108, 16);
		panelUpdateTrip.add(lblEndStation);
		
		JComboBox comboBoxEndStation = new JComboBox();
		comboBoxEndStation.setBounds(237, 102, 52, 27);
		panelUpdateTrip.add(comboBoxEndStation);
		
		JLabel lblCardUsedUpdate = new JLabel("Card Used      CARD USED");
		lblCardUsedUpdate.setBounds(40, 180, 330, 16);
		panelUpdateTrip.add(lblCardUsedUpdate);
		
		JButton btnUpdateTrip = new JButton("Update");
		btnUpdateTrip.setBounds(263, 222, 117, 50);
		panelUpdateTrip.add(btnUpdateTrip);
		
		
		
		
		//ADMIN LANDING
		
		
		lblWelcomeName = new JLabel("Welcome " + userfirstname + " " + userlastname);
		lblWelcomeName.setBounds(6, 6, 297, 16);
		panelAdminLanding.add(lblWelcomeName);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setBounds(365, 6, 61, 16);
		panelAdminLanding.add(lblAdmin);
		
		JButton btnViewTripsAD = new JButton("View Trips");
		btnViewTripsAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelViewTrips.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnViewTripsAD.setBounds(31, 34, 117, 51);
		panelAdminLanding.add(btnViewTripsAD);
		
		JButton btnBuyCard = new JButton("Buy Card");
		btnBuyCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBuyCard.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnBuyCard.setBounds(31, 95, 117, 51);
		panelAdminLanding.add(btnBuyCard);
		
		JButton btnGoOnTrip_1 = new JButton("Go on Trip");
		btnGoOnTrip_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelGoOnATrip.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnGoOnTrip_1.setBounds(31, 158, 117, 51);
		panelAdminLanding.add(btnGoOnTrip_1);
		
		JButton btnReviewPassengerReviews = new JButton("Review Passenger Reviews");
		btnReviewPassengerReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPendingReviews.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnReviewPassengerReviews.setBounds(31, 225, 194, 47);
		panelAdminLanding.add(btnReviewPassengerReviews);
		
		JButton btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEditProfileAD.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnEditProfile.setBounds(276, 30, 117, 59);
		panelAdminLanding.add(btnEditProfile);
		
		JButton btnAddStation = new JButton("Add Station");
		btnAddStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAddStation.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnAddStation.setBounds(276, 107, 117, 59);
		panelAdminLanding.add(btnAddStation);
		
		JButton btnAddLine = new JButton("Add Line");
		btnAddLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAddLine.setVisible(true);
				panelAdminLanding.setVisible(false);
			}
		});
		btnAddLine.setBounds(276, 178, 117, 51);
		panelAdminLanding.add(btnAddLine);
		
		
		//Pending reviews
		

		JLabel lblPendingReviews = new JLabel("Pending Reviews");
		lblPendingReviews.setBounds(6, 6, 128, 16);
		panelPendingReviews.add(lblPendingReviews);

		Object rowData5[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "R1C4", "R1C5"}};
		Object columnNames5[] = { "User", "Station", "Shopping", "Connection Speed", "Comment"};
		JTable table5 = new JTable(rowData5, columnNames5);
		JScrollPane scrollPane5 = new JScrollPane(table5);
		scrollPane5.setLocation(6, 23);
		scrollPane5.setSize(356, 249);
		panelPendingReviews.add(scrollPane5, BorderLayout.CENTER);
		
		JButton btnApprove = new JButton("AP");
		btnApprove.setBounds(356, 35, 49, 29);
		panelPendingReviews.add(btnApprove);
		
		JButton btnRej = new JButton("REJ");
		btnRej.setBounds(395, 35, 49, 29);
		panelPendingReviews.add(btnRej);
		
		
		//ADMIN EDIT PROFILE

		
		JLabel lblEditProfile_1 = new JLabel("Edit Profile");
		lblEditProfile_1.setBounds(6, 6, 124, 16);
		panelEditProfileAD.add(lblEditProfile_1);
		
		JLabel lblAdmin_1 = new JLabel("Admin");
		lblAdmin_1.setBounds(383, 6, 61, 16);
		panelEditProfileAD.add(lblAdmin_1);
		
		JLabel lblName_2 = new JLabel("Name");
		lblName_2.setBounds(6, 38, 61, 16);
		panelEditProfileAD.add(lblName_2);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("FIRSTNAME");
		txtFirstname.setBounds(16, 57, 130, 26);
		panelEditProfileAD.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtMiddlein_1 = new JTextField();
		txtMiddlein_1.setText("MIDDLEIN");
		txtMiddlein_1.setBounds(158, 57, 130, 26);
		panelEditProfileAD.add(txtMiddlein_1);
		txtMiddlein_1.setColumns(10);
		
		txtLastname_1 = new JTextField();
		txtLastname_1.setText("LASTNAME");
		txtLastname_1.setBounds(314, 57, 130, 26);
		panelEditProfileAD.add(txtLastname_1);
		txtLastname_1.setColumns(10);
		
		JLabel lblUserId_1 = new JLabel("User ID");
		lblUserId_1.setBounds(6, 95, 61, 16);
		panelEditProfileAD.add(lblUserId_1);
		
		txtUserid_1 = new JTextField();
		txtUserid_1.setText("USERID");
		txtUserid_1.setBounds(103, 95, 130, 26);
		panelEditProfileAD.add(txtUserid_1);
		txtUserid_1.setColumns(10);
		
		JLabel lblPassword_2 = new JLabel("Password");
		lblPassword_2.setBounds(6, 147, 61, 16);
		panelEditProfileAD.add(lblPassword_2);
		
		JLabel lblConfirmPassword_1 = new JLabel("Confirm Password");
		lblConfirmPassword_1.setBounds(218, 147, 146, 16);
		panelEditProfileAD.add(lblConfirmPassword_1);
		
		txtPassword_3 = new JTextField();
		txtPassword_3.setText("Password");
		txtPassword_3.setBounds(218, 169, 130, 26);
		panelEditProfileAD.add(txtPassword_3);
		txtPassword_3.setColumns(10);
		
		txtPassword_4 = new JTextField();
		txtPassword_4.setText("Password");
		txtPassword_4.setBounds(6, 169, 130, 26);
		panelEditProfileAD.add(txtPassword_4);
		txtPassword_4.setColumns(10);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setBounds(33, 218, 117, 54);
		panelEditProfileAD.add(btnDelete_1);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setBounds(228, 218, 117, 54);
		panelEditProfileAD.add(btnUpdate_1);
		
		
		//Add Station
		

		
		JLabel lblAddStation = new JLabel("Add Station");
		lblAddStation.setBounds(6, 6, 97, 16);
		panelAddStation.add(lblAddStation);
		
		txtStationName = new JTextField();
		txtStationName.setText("Station Name");
		txtStationName.setBounds(6, 26, 130, 26);
		panelAddStation.add(txtStationName);
		txtStationName.setColumns(10);
		
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(266, 26, 130, 26);
		panelAddStation.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(6, 64, 130, 26);
		panelAddStation.add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setText("State");
		txtState.setBounds(164, 64, 130, 26);
		panelAddStation.add(txtState);
		txtState.setColumns(10);
		
		txtPostalCode = new JTextField();
		txtPostalCode.setText("Postal/Zip Code");
		txtPostalCode.setBounds(314, 64, 130, 26);
		panelAddStation.add(txtPostalCode);
		txtPostalCode.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(16, 102, 52, 27);
		panelAddStation.add(comboBox_3);
		
		txtOrder = new JTextField();
		txtOrder.setText("Order");
		txtOrder.setBounds(134, 102, 130, 26);
		panelAddStation.add(txtOrder);
		txtOrder.setColumns(10);
		
		JButton btnAddLine_1 = new JButton("Add Line");
		btnAddLine_1.setBounds(314, 102, 117, 29);
		panelAddStation.add(btnAddLine_1);
		
		JButton btnAddStation_1 = new JButton("Add Station");
		btnAddStation_1.setBounds(314, 243, 117, 29);
		panelAddStation.add(btnAddStation_1);
		
		Object rowData6[][] = { { "Row1-Column1", "Row1-Column2"}};
		Object columnNames6[] = { "Line", "Order"};
		JTable table6 = new JTable(rowData6, columnNames6);
		JScrollPane scrollPane6 = new JScrollPane(table6);
		scrollPane6.setLocation(26, 140);
		scrollPane6.setSize(353, 100);
		panelAddStation.add(scrollPane6, BorderLayout.CENTER);
		
		
		
		// Add Line

		
		txtLineName = new JTextField();
		txtLineName.setText("Line Name");
		txtLineName.setBounds(6, 34, 130, 26);
		panelAddLine.add(txtLineName);
		txtLineName.setColumns(10);
		
		JLabel lblAddLine = new JLabel("Add Line");
		lblAddLine.setBounds(6, 6, 61, 16);
		panelAddLine.add(lblAddLine);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(6, 73, 140, 27);
		panelAddLine.add(comboBox_4);
		
		txtOrder_1 = new JTextField();
		txtOrder_1.setText("Order");
		txtOrder_1.setBounds(172, 72, 130, 26);
		panelAddLine.add(txtOrder_1);
		txtOrder_1.setColumns(10);
		
		JButton btnAddStation_2 = new JButton("Add Station");
		btnAddStation_2.setBounds(327, 72, 117, 29);
		panelAddLine.add(btnAddStation_2);
		
		JButton btnAddLine_2 = new JButton("Add Line");
		btnAddLine_2.setBounds(314, 243, 117, 29);
		panelAddLine.add(btnAddLine_2);
        
		
		Object rowData7[][] = { { "Row1-Column1", "Row1-Column2"}};
		Object columnNames7[] = { "Station", "Order"};
		JTable table7 = new JTable(rowData7, columnNames7);
		JScrollPane scrollPane7 = new JScrollPane(table7);
		scrollPane7.setLocation(26, 125);
		scrollPane7.setSize(353, 115);
		panelAddLine.add(scrollPane7, BorderLayout.CENTER);
		
		
		// Line Summary AD  NEEDS WORK
		

		JLabel lblLineNum = new JLabel("Line NUMBER");
		lblLineNum.setBounds(6, 6, 146, 16);
		panelLineSummaryAD.add(lblLineNum);
		
		JLabel lblNumStop = new JLabel("NUM Stops");
		lblNumStop.setBounds(327, 8, 100, 16);
		panelLineSummaryAD.add(lblNumStop);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.setBounds(327, 225, 117, 47);
		panelLineSummaryAD.add(btnUpdate_2);
		
		
		
		
		//Station Info AD
		
		
		JLabel lblStationName_1 = new JLabel("STATION NAME");
		lblStationName_1.setBounds(6, 6, 122, 16);
		panelStationInfoAD.add(lblStationName_1);
		
		JLabel lblStatus_1 = new JLabel("Status :");
		lblStatus_1.setBounds(256, 6, 61, 16);
		panelStationInfoAD.add(lblStatus_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(332, 2, 94, 27);
		panelStationInfoAD.add(comboBox_5);
		
		JLabel lblAddressAddress = new JLabel("Address : ADDRESS");
		lblAddressAddress.setBounds(16, 34, 264, 16);
		panelStationInfoAD.add(lblAddressAddress);
		
		JLabel lblLines = new JLabel("Lines : LINES");
		lblLines.setBounds(6, 62, 284, 16);
		panelStationInfoAD.add(lblLines);
		
		JLabel lblAverageShopping_1 = new JLabel("Average Shopping : AVGSHOP");
		lblAverageShopping_1.setBounds(6, 94, 185, 16);
		panelStationInfoAD.add(lblAverageShopping_1);
		
		JLabel lblAVGCS = new JLabel("Average Connection Speed : AVCS");
		lblAVGCS.setBounds(224, 90, 202, 16);
		panelStationInfoAD.add(lblAVGCS);
		
		JLabel lblReviews_1 = new JLabel("Reviews");
		lblReviews_1.setBounds(6, 122, 61, 16);
		panelStationInfoAD.add(lblReviews_1);
		
        Object rowData8[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3", "R1C4"}};
		Object columnNames8[] = { "User", "Shopping", "Connection Speed", "Comment"};
		JTable table8 = new JTable(rowData8, columnNames8);
		JScrollPane scrollPane8 = new JScrollPane(table8);
		scrollPane8.setLocation(6, 142);
		scrollPane8.setSize(444, 130);
		panelStationInfoAD.add(scrollPane8, BorderLayout.CENTER);
		
	}
}
	
