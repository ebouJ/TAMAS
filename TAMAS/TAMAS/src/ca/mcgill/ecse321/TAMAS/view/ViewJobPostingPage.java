package ca.mcgill.ecse321.TAMAS.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ViewJobPostingPage extends JFrame {
	private JLabel AvailableCourses; 
	private JComboBox courses;
	private JLabel AvailableJobs;
	private JList jobs;
	private JLabel Description;
	private JButton apply;
	
	public ViewJobPostingPage() {
		initUI();
	}
	
	public void initUI(){
		setTitle("ViewJobPosting");
		setSize(1000,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] courseChoice = new String[] {"ECSE 223", "ECSE321"};
		String[] jobChoice = new String[] {"ECSE223 TA", "ECSE321 TA"};
		
		AvailableCourses = new JLabel("Available Courses:");
		courses = new JComboBox<String>(courseChoice);
		AvailableJobs = new JLabel("Available Positions");
		jobs = new JList<String>(jobChoice);
		Description = new JLabel("Description:");
		
		apply = new JButton("Apply");
		apply.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				applyForJobEvent();
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(AvailableCourses);
		panel.add(courses);
		panel.add(AvailableJobs);
		panel.add(jobs);
		panel.add(Description);
		panel.add(apply);
		
		getContentPane().add(panel);
	}
	

}
