package ca.mcgill.ecse321.TAMAS.view;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = 5490579710858055789L;
	private JLabel AvailableCourses; 
	private JComboBox courses; //combobox
	private JLabel AvailableJobs;
	private JList jobs; //list
	private JLabel Description;
	private JScrollPane JobDescription;
	private JButton apply;
	
	public JobPostDisplayPage() {
		initUI(); 
	}
	
	public void initUI(){
		setTitle("ViewJobPosting");
		setSize(700,700);
		//setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		String[] courseChoice = new String[] {"ECSE 223", "ECSE321"};
		String[] jobChoice = new String[] {"ECSE223 TA", "ECSE321 TA"};
		
		AvailableCourses = new JLabel("Available Courses:");
		courses = new JComboBox<String>(courseChoice);
		//courses = new JLabel("courses here");
		AvailableJobs = new JLabel("Available Positions:");
		jobs = new JList<String>(jobChoice);
		//jobs = new JLabel("jobs here");
		
		Description = new JLabel("Description:");
		JTextArea textArea = new JTextArea("");
		JobDescription = new JScrollPane (textArea, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		apply = new JButton("Apply");
		apply.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				// To be defined
				//applyForJobEvent();
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(AvailableCourses);
		panel.add(courses);
		panel.add(AvailableJobs);
		panel.add(jobs);
		panel.add(Description);
		panel.add(apply);
		panel.add(JobDescription);
		
		getContentPane().add(panel);
		
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
	    				.addComponent(courses)
	    				.addComponent(jobs)
	    				.addComponent(JobDescription)
	    				.addComponent(apply))
	    		);
	    
	    layout.setVerticalGroup(layout.createSequentialGroup()
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(AvailableCourses)
	    				.addComponent(courses))
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(AvailableJobs)
	    				.addComponent(jobs))
	    		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    					.addComponent(Description)
	    					.addComponent(JobDescription))
	    		.addComponent(apply)
	    				
	    						
	    			
	    		);
	    
	  
	   
	    				
	    			
	    	pack();		
	    			
	    		
	    				
	   	
	}
	
	/*public static void main(String args[]) {
		EventQueue.invokeLater(() -> {
            ViewJobPostingPage view = new ViewJobPostingPage();
            view.setVisible(true);
     });
	}*/
	

}
