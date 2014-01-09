/*
 * Copyright (c) 2014 Ergon Informatik AG
 * Kleinstrasse 15, 8008 Zuerich, Switzerland
 * All rights reserved.
 */

package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

/**
 * 
 */
public class Message extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Zahl1;
	private JTextField txt_Zahl2;
	private JTextField txt_Ergebnis;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Message frame = new Message();
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
	public Message() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370,150, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddieren = new JButton("Addieren");
		btnAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int Zahl1,Zahl2,erg;
			Zahl1=0;
			Zahl2=0;
			erg=0;
			Zahl1=Integer.parseInt(txt_Zahl1.getText());
			Zahl2=Integer.parseInt(txt_Zahl2.getText());
			erg=Zahl1+Zahl2;
			txt_Ergebnis.setText("Ergebnis" + erg);
			
			}
		});
		btnAddieren.setBounds(10, 208, 89, 23);
		contentPane.add(btnAddieren);
		
		txt_Zahl1 = new JTextField();
		txt_Zahl1.setBounds(10, 11, 86, 20);
		contentPane.add(txt_Zahl1);
		txt_Zahl1.setColumns(10);
		
		txt_Zahl2 = new JTextField();
		txt_Zahl2.setBounds(106, 11, 86, 20);
		contentPane.add(txt_Zahl2);
		txt_Zahl2.setColumns(10);
		
		txt_Ergebnis = new JTextField();
		txt_Ergebnis.setBounds(221, 11, 86, 20);
		contentPane.add(txt_Ergebnis);
		txt_Ergebnis.setColumns(10);
		
		JButton btnNewButton = new JButton("Email");
		btnNewButton.setBounds(221, 119, 120, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SMS");
		btnNewButton_1.setBounds(445, 119, 120, 90);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MMS");
		btnNewButton_2.setBounds(221, 308, 120, 90);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.setBounds(445, 308, 120, 90);
		contentPane.add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(293, 88, 96, 20);
		contentPane.add(passwordField);
		
		JLabel lblLogin = new JLabel("Username :");
		lblLogin.setBounds(221, 57, 62, 37);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(221, 91, 46, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(293, 65, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
