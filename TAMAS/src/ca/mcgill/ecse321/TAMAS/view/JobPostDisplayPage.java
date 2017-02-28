package ca.mcgill.ecse321.TAMAS.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;

//import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

//import ca.mcgill.ecse223.tileo.view.AddConnectionView;

public class JobPostDisplayPage extends JFrame {

	// labels
	private JLabel AvailableCourses; 
	private JLabel AvailableJobs;
	private JLabel Description;
	
	// combobox for list of courses
	private JComboBox coursesComboBox;
	
	// combobox for list of jobs under a specific course
	private JComboBox jobsComboBox;
	
	// array of courses
	private String[] courseList;
	
	// arrays of jobs
	private String[] jobList1;
	private String[] jobList2;
	
	// arrays for desriptions of jobs
	private String[] descriptions1;
	private String[] descriptions2;
	
	// scroll pane for job 
	private JLabel JobDescriptionLabel;
	private JScrollPane JobDescriptionScroll;
	
	// button to go to application page
	private JButton apply;
	
	//boolean to see which course is selected
	boolean job1Selected = true;
	
	
	public JobPostDisplayPage() {
		initComponents(); 
		refreshData();
	}
	
	public void initComponents(){
		setTitle("View Job Postings");
		setSize(700,700);
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// labels
		AvailableCourses = new JLabel("Available Courses:");
		AvailableJobs = new JLabel("Available Positions:");
		Description = new JLabel("Description:");
		
		// array of courses
		courseList = new String[] {"ECSE 223", "ECSE 321"};
		
		//array of jobs
		jobList1 = new String[] {"ECSE 223 TA Mondays 2-4", "ECSE 223 Grader Wednesdays 8-12", "ECSE 223 TA Fridays 9-11"};
		jobList2 = new String[] {"ECSE 321 TA Tuesdays 1-3", "ECSE 321 TA Thursdays 1-3", "ECSE 321 Grader Mondays 8-10"};
				
		//arrays of descriptions
		descriptions1 = new String[] {"<html>Teaching Assistant for ECSE 223: Model-Based Programming<br><br>Hours: Mondays 2-4<br><br>Overview<br><br>Electrical Engineering : Integration of modelling with programming; abstraction in software engineering;<br>structural modelling; state-based modelling; modelling of object-oriented systems, code generation; natural<br>language constraints in modelling notations; architectural and design patterns; integrated development<br>environments; programming tools (debugging, continuous build/integration, version control and code<br>repositories, diff, defect and issue tracking, refactoring); code review processes.</html>",
										"<html>Grader for ECSE 223: Model-Based Programming<br><br>Hours: Wednesdays 8-12<br><br>Overview<br><br>Electrical Engineering : Integration of modelling with programming; abstraction in software engineering;<br>structural modelling; state-based modelling; modelling of object-oriented systems, code generation; natural<br>language constraints in modelling notations; architectural and design patterns; integrated development<br>environments; programming tools (debugging, continuous build/integration, version control and code<br>repositories, diff, defect and issue tracking, refactoring); code review processes.</html>",
										"<html>Teaching Assistant for ECSE 223: Model-Based Programming<br><br>Hours: Fridays 9-11<br><br>Overview<br><br>Electrical Engineering : Integration of modelling with programming; abstraction in software engineering;<br>structural modelling; state-based modelling; modelling of object-oriented systems, code generation; natural<br>language constraints in modelling notations; architectural and design patterns; integrated development<br>environments; programming tools (debugging, continuous build/integration, version control and code<br>repositories, diff, defect and issue tracking, refactoring); code review processes.</html>"};
		
		descriptions2 = new String[] {"<html>Teaching Assistant for ECSE 321: Introduction to Software Engineering<br><br>Hours: Tuesdays 1-3<br><br>Overview<br><br>Electrical Engineering : Design, development and testing of software systems.<br>Software life cycle: requirements analysis, software architecture and design,<br>implementation, integration, test planning, and maintenance. The course<br>involves a group project.</html>",
				"<html>Teaching Assistant for ECSE 321: Introduction to Software Engineering<br><br>Hours: Thursdays 1-3<br><br>Overview<br><br>Electrical Engineering : Design, development and testing of software systems.<br>Software life cycle: requirements analysis, software architecture and design,<br>implementation, integration, test planning, and maintenance. The course<br>involves a group project.</html>",
				"<html>Grader for ECSE 321: Introduction to Software Engineering<br><br>Hours: Mondays 8-10<br><br>Overview<br><br>Electrical Engineering : Design, development and testing of software systems.<br>Software life cycle: requirements analysis, software architecture and design,<br>implementation, integration, test planning, and maintenance. The course<br>involves a group project.</html>"};
		
		// combobox for list of courses
		coursesComboBox = new JComboBox<String>(courseList);
		coursesComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				courseSelectedActionPerformed(evt);
			}
			});
		
		// list of jobs component
		jobsComboBox = new JComboBox<String>(jobList1);
		jobsComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jobSelectedActionPerformed(evt);
			}
			});
		
		
		// scroll pane for job 
		JobDescriptionLabel = new JLabel(descriptions1[0]);
		JobDescriptionLabel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		JobDescriptionScroll = new JScrollPane (JobDescriptionLabel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// button to go to application page
		apply = new JButton("Apply");
		apply.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				applyActionPerformed(evt);
			}
			});
		
	/*	JPanel panel = new JPanel();
		panel.add(AvailableCourses);
		panel.add(courses);
		panel.add(AvailableJobs);
		panel.add(jobs);
		panel.add(Description);
		panel.add(apply);
		panel.add(JobDescription);
		
		getContentPane().add(panel);*/
		
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
	    layout.setAutoCreateGaps(true);
	    layout.setAutoCreateContainerGaps(true);
		
	    layout.setHorizontalGroup(layout.createSequentialGroup()
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	    				.addComponent(AvailableCourses)
	    				.addComponent(AvailableJobs)
	    				.addComponent(Description))
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	    				.addComponent(coursesComboBox)
	    				.addComponent(jobsComboBox)
	    				.addComponent(JobDescriptionScroll)
	    				.addComponent(apply))
	    		);
	    
	    layout.setVerticalGroup(layout.createSequentialGroup()
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(AvailableCourses)
	    				.addComponent(coursesComboBox))
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(AvailableJobs)
	    				.addComponent(jobsComboBox))
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    					.addComponent(Description)
	    					.addComponent(JobDescriptionScroll))
	    		.addComponent(apply)
	    				
	    						
	    			
	    		);
	    
	  
	   
	    				
	    			
	    	//pack();		
	    			
	    		
	    				
	   	
	}
	
	private void refreshData(){

		//pack();
	}
	
	private void courseSelectedActionPerformed(java.awt.event.ActionEvent evt){
		String item = (String)coursesComboBox.getSelectedItem();
		System.out.println(item);
		if(item.equals("ECSE 321")){
			jobsComboBox.removeAllItems();
			for(int i=0;i<jobList2.length;i++){
				jobsComboBox.addItem(jobList2[i]);
			}
		}
		else{
			jobsComboBox.removeAllItems();
			for(int i=0;i<jobList1.length;i++){
				jobsComboBox.addItem(jobList1[i]);
			}
		}
		refreshData();
	}
	
	private void jobSelectedActionPerformed(java.awt.event.ActionEvent evt){
		int jobIndex = jobsComboBox.getSelectedIndex();
		if(jobIndex!=-1){
			if(coursesComboBox.getSelectedIndex()==0)
				JobDescriptionLabel.setText(descriptions1[jobIndex]);
			else
				JobDescriptionLabel.setText(descriptions2[jobIndex]);
		}
		refreshData();
	}
	
	private void applyActionPerformed(java.awt.event.ActionEvent evt){
		
		refreshData();
	}
}