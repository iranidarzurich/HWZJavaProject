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
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;

/**
 * 
 */
public class Message extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		setBounds(370,150, 450, 500);
		setTitle("New Software");
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 462);
		getContentPane().add(tabbedPane);
		
		JPanel panelEmail = new JPanel();
		tabbedPane.addTab("Email", null, panelEmail, null);
		panelEmail.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(84, 11, 86, 20);
		panelEmail.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 42, 86, 20);
		panelEmail.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(84, 73, 86, 20);
		panelEmail.add(textField_2);
		
		JLabel labelAbsender = new JLabel("Absender");
		labelAbsender.setBounds(10, 14, 46, 14);
		panelEmail.add(labelAbsender);
		
		JLabel lblEmpfnger = new JLabel("Empfänger");
		lblEmpfnger.setBounds(10, 45, 46, 14);
		panelEmail.add(lblEmpfnger);
		
		JLabel label_1 = new JLabel("Empfänger");
		label_1.setBounds(10, 76, 46, 14);
		panelEmail.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(36, 117, 359, 131);
		panelEmail.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSenden = new JButton("Senden");
		btnSenden.setBounds(306, 259, 89, 23);
		panelEmail.add(btnSenden);
		
		JPanel panelSMS = new JPanel();
		tabbedPane.addTab("SMS", null, panelSMS, null);
		panelSMS.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(151, 11, 86, 20);
		panelSMS.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(151, 42, 86, 20);
		panelSMS.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(151, 73, 86, 100);
		panelSMS.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TelNr.Absender");
		lblNewLabel.setBounds(10, 14, 105, 14);
		panelSMS.add(lblNewLabel);
		
		JLabel lblTelNrEmpfnger = new JLabel("TelNr.Empfänger");
		lblTelNrEmpfnger.setBounds(10, 45, 105, 14);
		panelSMS.add(lblTelNrEmpfnger);
		
		JLabel lblText = new JLabel("Text");
		lblText.setBounds(10, 76, 105, 14);
		panelSMS.add(lblText);
		
		JButton btnSMSSenden = new JButton("Senden");
		btnSMSSenden.setBounds(151, 201, 89, 23);
		panelSMS.add(btnSMSSenden);
		
		JPanel panelMMS = new JPanel();
		tabbedPane.addTab("MMS", null, panelMMS, null);
		panelMMS.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(150, 30, 86, 20);
		panelMMS.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(150, 71, 86, 20);
		panelMMS.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(150, 108, 86, 100);
		panelMMS.add(textField_9);
		
		JLabel label = new JLabel("TelNr.Absender");
		label.setBounds(10, 33, 105, 14);
		panelMMS.add(label);
		
		JLabel label_2 = new JLabel("TelNr.Empfänger");
		label_2.setBounds(10, 74, 105, 14);
		panelMMS.add(label_2);
		
		JLabel label_3 = new JLabel("Text");
		label_3.setBounds(10, 111, 105, 14);
		panelMMS.add(label_3);
		
		JPanel panelPrint = new JPanel();
		tabbedPane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);
		
		JButton btnAudrucken = new JButton("Drucken");
		btnAudrucken.setBounds(268, 285, 89, 23);
		panelPrint.add(btnAudrucken);
		
		textField_10 = new JTextField();
		textField_10.setBounds(48, 51, 309, 191);
		panelPrint.add(textField_10);
		textField_10.setColumns(10);
		
		
	}
}
