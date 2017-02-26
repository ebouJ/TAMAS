import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JobApplicationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JobApplicationPage frame = new JobApplicationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JobApplicationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblJobApplication = new JLabel("Job Application");
		lblJobApplication.setBounds(187, 24, 125, 16);
		panel.add(lblJobApplication);
		
		JLabel lblCv = new JLabel("CV:");
		lblCv.setBounds(41, 57, 61, 16);
		panel.add(lblCv);
		
		textField = new JTextField();
		textField.setBounds(114, 52, 307, 78);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setBounds(195, 180, 117, 29);
		panel.add(btnApply);
	}
}
