package ca.mcgill.ecse321.TAMAS.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.StringUtils;

import ca.mcgill.ecse321.TAMAS.persistence.JobApplicationPersistence;
import ca.mcgill.ecse321.TAMAS.persistence.StudentRecordPersistence;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.JButton;

public class JobApplicationPage extends JFrame {
	//error message
	private JLabel errorMessage;
	
	// error
	private String error = null;
	
	// scrollpane for CV
	private JTextArea cvText;
	private JScrollPane cvScroll;
	private JButton apply;
		
	// Label for CV
	private JLabel cvLabel;

	public JobApplicationPage() {
		initComponents();
		refreshData();	
	}
	
	private void initComponents(){
		
		// cv label
		cvLabel = new JLabel("Paste your CV here:");
		
		// apply button
		apply = new JButton("APPLY");
		apply.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				applyActionPerformed(evt);
			}
			});

		
		// cv scrollpane
		cvText = new JTextArea("");
		cvScroll = new JScrollPane (cvText, 
					 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Apply for a Job");
		
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		 layout.setHorizontalGroup(layout.createSequentialGroup()
		            		.addComponent(cvLabel)
		            		.addComponent(cvScroll)
		            		.addComponent(apply)
		 );
		 
		 layout.setVerticalGroup(layout.createSequentialGroup()
				 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		            		.addComponent(cvLabel)
		            		.addComponent(cvScroll))
		         .addComponent(apply)		
		 );
		
		pack();
	}
	
	private void refreshData(){
		// error
		//errorMessage.setText(error);
		
		//description.setText("");
		pack();
	}
	
	private void applyActionPerformed(java.awt.event.ActionEvent evt){
		
		JobApplicationPersistence srp = new JobApplicationPersistence();
		
		refreshData();
	}
}