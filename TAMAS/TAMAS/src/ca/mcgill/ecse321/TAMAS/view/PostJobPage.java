package ca.mcgill.ecse321.TAMAS.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import ca.mcgill.ecse321.TAMAS.controller.InvalidInputException;
import ca.mcgill.ecse321.TAMAS.controller.StudentController;

public class PostJobPage extends javax.swing.JFrame {
	
	private JLabel postJobLabel;
	private JLabel courseLabel;
	private JLabel hoursLabel;
	private JLabel descriptionLabel;
	private JLabel scheduleLabel;
	
	private JSpinner courseSpinner;
	private JTextField hours;
	private JTextPane description;
	
	
	
	private JComboBox<String> courseList;
	private JButton apply;

	private JLabel successMessage;
	
	String error = null;
	int a,b;
	
	public PostJobPage() {
		initComponents();
		refreshData();
	}
	
	private void initComponents(){
		
	}
	
	private void refreshData(){
		
	}
	
	private void submitActionPerformed(java.awt.event.ActionEvent evt) {
		// clear error message
		error = null;
		
		// call the controller
		StudentController sc = new StudentController();
		try {
			//controller method
			int i = a+b;
		} catch (InvalidInputException e) {
			error = e.getMessage();
		}
		
		// update visuals
		refreshData();
	}
	
}