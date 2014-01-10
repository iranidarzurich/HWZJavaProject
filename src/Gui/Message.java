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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * 
 */
public class Message extends JFrame {
	private JTextField textEmailAbsender;
	private JTextField textEmailEmpfaenger;
	private JTextField textEmailBetreff;
	private JTextField textSmsAbsender;
	private JTextField textSmsEmpfaenger;
	private JTextField textMmsAbsender;
	private JTextField textMmsEmpfaenger;

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
		setBounds(370,150, 451, 429);
		setTitle("New Software");
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 462);
		getContentPane().add(tabbedPane);
		
		JPanel panelEmail = new JPanel();
		tabbedPane.addTab("Email", null, panelEmail, null);
		panelEmail.setLayout(null);
		
		textEmailAbsender = new JTextField();
		textEmailAbsender.setBounds(126, 11, 86, 20);
		panelEmail.add(textEmailAbsender);
		textEmailAbsender.setColumns(10);
		
		textEmailEmpfaenger = new JTextField();
		textEmailEmpfaenger.setColumns(10);
		textEmailEmpfaenger.setBounds(126, 42, 86, 20);
		panelEmail.add(textEmailEmpfaenger);
		
		textEmailBetreff = new JTextField();
		textEmailBetreff.setColumns(10);
		textEmailBetreff.setBounds(126, 73, 86, 20);
		panelEmail.add(textEmailBetreff);
		
		JLabel labelAbsender = new JLabel("Absender");
		labelAbsender.setBounds(10, 14, 46, 14);
		panelEmail.add(labelAbsender);
		
		JLabel lblEmpfnger = new JLabel("Empfaenger");
		lblEmpfnger.setBounds(10, 45, 86, 14);
		panelEmail.add(lblEmpfnger);
		
		JLabel lblEmailBetreff = new JLabel("Betreff");
		lblEmailBetreff.setBounds(10, 76, 86, 14);
		panelEmail.add(lblEmailBetreff);
		
		JButton btnSenden = new JButton("Senden");
		btnSenden.setBounds(306, 259, 89, 23);
		panelEmail.add(btnSenden);
		
		JTextArea textEmail = new JTextArea();
		textEmail.setBounds(94, 104, 205, 106);
		panelEmail.add(textEmail);
		
		JPanel panelSMS = new JPanel();
		panelSMS.setBackground(new Color(102, 205, 170));
		tabbedPane.addTab("SMS", null, panelSMS, null);
		panelSMS.setLayout(null);
		
		textSmsAbsender = new JTextField();
		textSmsAbsender.setToolTipText("+41 78 888 88 88");
		textSmsAbsender.setBounds(151, 11, 86, 20);
		panelSMS.add(textSmsAbsender);
		textSmsAbsender.setColumns(10);
		
		textSmsEmpfaenger = new JTextField();
		textSmsEmpfaenger.setToolTipText("+41 78 888 88 88");
		textSmsEmpfaenger.setBounds(151, 42, 86, 20);
		panelSMS.add(textSmsEmpfaenger);
		textSmsEmpfaenger.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TelNr.Absender");
		lblNewLabel.setBounds(10, 14, 105, 14);
		panelSMS.add(lblNewLabel);
		
		JLabel lblTelNrEmpfnger = new JLabel("TelNr.Empfaenger");
		lblTelNrEmpfnger.setBounds(10, 45, 105, 14);
		panelSMS.add(lblTelNrEmpfnger);
		
		JLabel lblText = new JLabel("Text");
		lblText.setBounds(10, 76, 105, 14);
		panelSMS.add(lblText);
		
		JButton btnSMSSenden = new JButton("Senden");
		btnSMSSenden.setBounds(148, 207, 89, 23);
		panelSMS.add(btnSMSSenden);
		
		JTextArea textSms = new JTextArea();
		textSms.setBounds(151, 90, 133, 49);
		panelSMS.add(textSms);
		
		JPanel panelMMS = new JPanel();
		panelMMS.setToolTipText("+41 78 888 88 88");
		tabbedPane.addTab("MMS", null, panelMMS, null);
		panelMMS.setLayout(null);
		
		textMmsAbsender = new JTextField();
		textMmsAbsender.setToolTipText("+41 78 888 88 88");
		textMmsAbsender.setColumns(10);
		textMmsAbsender.setBounds(150, 8, 86, 20);
		panelMMS.add(textMmsAbsender);
		
		textMmsEmpfaenger = new JTextField();
		textMmsEmpfaenger.setToolTipText("+41 78 888 88 88");
		textMmsEmpfaenger.setHorizontalAlignment(SwingConstants.LEFT);
		textMmsEmpfaenger.setColumns(10);
		textMmsEmpfaenger.setBounds(150, 46, 86, 20);
		panelMMS.add(textMmsEmpfaenger);
		
		JLabel label = new JLabel("TelNr.Absender");
		label.setBounds(10, 11, 105, 14);
		panelMMS.add(label);
		
		JLabel labelTelNrEmpfaenger = new JLabel("TelNr.Empfaenger");
		labelTelNrEmpfaenger.setBounds(10, 49, 105, 14);
		panelMMS.add(labelTelNrEmpfaenger);
		
		JLabel label_3 = new JLabel("Text");
		label_3.setBounds(10, 97, 105, 14);
		panelMMS.add(label_3);
		
		JTextArea textMms = new JTextArea();
		textMms.setBounds(149, 92, 133, 49);
		panelMMS.add(textMms);
		
		JButton button = new JButton("Senden");
		button.setBounds(147, 183, 89, 23);
		panelMMS.add(button);
		
		JPanel panelPrint = new JPanel();
		tabbedPane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);
		
		JButton btnAudrucken = new JButton("Drucken");
		btnAudrucken.setBounds(291, 182, 89, 23);
		panelPrint.add(btnAudrucken);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(56, 23, 294, 129);
		panelPrint.add(textArea);
		
		
	}
}
