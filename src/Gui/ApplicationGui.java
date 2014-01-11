package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class ApplicationGui {

	private JFrame frameGui;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationGui window = new ApplicationGui();
					window.frameGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameGui = new JFrame();
		frameGui.setTitle("Gui");
		frameGui.setBounds(100, 100, 450, 300);
		frameGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGui.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 228, 89, 23);
		frameGui.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(119, 228, 89, 23);
		frameGui.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(236, 228, 89, 23);
		frameGui.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(335, 228, 89, 23);
		frameGui.getContentPane().add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(123, 11, 196, 20);
		frameGui.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 42, 196, 20);
		frameGui.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(123, 73, 196, 20);
		frameGui.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 104, 197, 20);
		frameGui.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 135, 197, 20);
		frameGui.getContentPane().add(textField_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(61, 169, 303, 48);
		frameGui.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 14, 46, 14);
		frameGui.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 45, 46, 14);
		frameGui.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(10, 76, 46, 14);
		frameGui.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(10, 107, 46, 14);
		frameGui.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(10, 138, 46, 14);
		frameGui.getContentPane().add(label_3);
		
	}
}
