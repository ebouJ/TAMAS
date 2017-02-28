package ca.mcgill.ecse321.TAMAS.view;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mysql.jdbc.StringUtils;

import ca.mcgill.ecse321.TAMAS.persistence.StudentRecordPersistence;

public class LoginPage extends JFrame{
	//error message
		private JLabel errorMessage;
		
		// error
		private String error = null;
			
		// label for username and password
		private JLabel usernameLabel;
		private JLabel passwordLabel;
		
		// textfield for username
		private JTextField username;
		
		// password field for password
		private JPasswordField password;
		
		//login button
		private JButton login;

		public LoginPage() {
			initComponents();
			refreshData();	
		}
		
		private void initComponents(){
			
			// label for username and password
			usernameLabel = new JLabel("Username (Email or ID):");
			passwordLabel = new JLabel("Password:");
			
			// textfield for username
			username = new JTextField();
			
			// password field for passwor
			password = new JPasswordField();
			
			// login button
			login = new JButton("LOGIN");
			login.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					loginActionPerformed(evt);
				}
				});

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Login Page");
			
			GroupLayout layout = new GroupLayout(getContentPane());
			getContentPane().setLayout(layout);
			
			layout.setAutoCreateGaps(true);
			layout.setAutoCreateContainerGaps(true);
			
			 layout.setHorizontalGroup(layout.createSequentialGroup()
					 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(usernameLabel)
			            	.addComponent(passwordLabel))
					 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(username)
				            	.addComponent(password)
				            	.addComponent(login))
			 );
			 
			 layout.setVerticalGroup(layout.createSequentialGroup()
					 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			            		.addComponent(usernameLabel)
			            		.addComponent(username))
					 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			            		.addComponent(passwordLabel)
			            		.addComponent(password))	
					 .addComponent(login)
			 );
			
			pack();
		}

		private void refreshData(){
		
			// error
			//errorMessage.setText(error);
			
			//description.setText("");
			pack();
			getContentPane().setSize(800, 500);
		}
		
		private void loginActionPerformed(java.awt.event.ActionEvent evt){
			String user_name = username.getText();
			String pass_word = password.getText();
			
			StudentRecordPersistence srp = new StudentRecordPersistence();
			
			if(StringUtils.isStrictlyNumeric(user_name))//if it is numeric
				if(pass_word.equals(srp.getStudentPasswordByID(Integer.parseInt(user_name))))
						System.out.println("VALID LOGIN");
				else
						System.out.println("WRONG LOGIN");
			
			//if numeric getStudentPasswordByID 
					//if pass matches let them in
					//else print error message
			//if not
			refreshData();
		}
		

}
