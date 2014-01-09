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

/**
 * 
 */
public class Message extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Zahl1;
	private JTextField txt_Zahl2;
	private JTextField txt_Ergebnis;

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
		setBounds(100, 100, 450, 300);
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
		btnAddieren.setBounds(10, 42, 89, 23);
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
	}
}
