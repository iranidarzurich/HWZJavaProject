/**
 * copyright Mehdi, Chantal, Damian
 */

package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Message.Email;
import Message.Login;
import Message.MMS;
import Message.Print;
import Message.SMS;
import javax.swing.JComboBox;

public class Message extends JFrame {
	// Variable
	private static final long serialVersionUID = -8008759198163764949L;
	private JTextField textEmailSender;
	private JTextField textEmailRecipient;
	private JTextField textEmailSubject;
	private JTextField textSmsSender;
	private JTextField textSmsRecipient;
	private JTextField textMmsSender;
	private JTextField textMmsRecipient;
	private JTextArea textAreaEmail;
	private JTextArea textAreaSms;
	private JTextArea textAreaMms;
	private JTextArea textAreaPrint;
	private JTextField textAttachmentEmail;
	private JTextField textAttachmentMms;
	private JTextField textAttachmentPrint;
	private JTextField textUsername;
	private JPasswordField passwordLogin;
	private JComboBox comboBoxChoosPrinter;
	private static String[] printerName = { "HP", "Cannon" };

	// Launch the application
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

	// Mainframe
	public Message() {
		// Generate Mainframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 150, 451, 429);
		setTitle("Multi Channel");
		getContentPane().setLayout(null);

		JTabbedPane basePane = new JTabbedPane(JTabbedPane.TOP);
		basePane.setBackground(Color.LIGHT_GRAY);
		basePane.setBounds(0, 0, 434, 391);
		getContentPane().add(basePane);

		// Login tab
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(Color.LIGHT_GRAY);
		basePane.addTab("Login", null, panelLogin, null);
		panelLogin.setLayout(null);

		// Tooltip for login
		JLabel lblInputUsernameAndPassword = new JLabel(
				"Ihr Username und Passwort eingeben");
		lblInputUsernameAndPassword.setBounds(99, 104, 275, 14);
		panelLogin.add(lblInputUsernameAndPassword);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(28, 132, 87, 14);
		panelLogin.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(28, 168, 75, 14);
		panelLogin.add(lblPassword);

		textUsername = new JTextField();
		textUsername.setBounds(168, 129, 120, 20);
		panelLogin.add(textUsername);
		textUsername.setColumns(10);

		passwordLogin = new JPasswordField();
		passwordLogin.setBounds(168, 165, 120, 20);
		panelLogin.add(passwordLogin);
		// Login tab, button
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(168, 207, 120, 23);
		panelLogin.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setUserName(textUsername.getText());
				login.setPassword(passwordLogin.getText());
				// Validation Login tab
				if (textUsername.getText().trim().length() == 0
						|| passwordLogin.getText().length() == 0) {
					JOptionPane.showMessageDialog(null,
							"Das Feld Passwort oder Username ist leer",
							"Leere Felder", JOptionPane.ERROR_MESSAGE);
				} else {
					login.compare();

				}
			}
		});
		// Email Tab
		JPanel panelEmail = new JPanel();
		panelEmail.setBackground(Color.LIGHT_GRAY);
		basePane.addTab("Email", null, panelEmail, null);
		panelEmail.setLayout(null);

		// Email text box with tooltips
		textEmailSender = new JTextField();
		textEmailSender.setBounds(126, 11, 199, 20);
		textEmailSender.setToolTipText("xxx@xxx.xx");
		panelEmail.add(textEmailSender);
		textEmailSender.setColumns(10);

		textEmailRecipient = new JTextField();
		textEmailRecipient.setBounds(126, 42, 199, 20);
		textEmailRecipient.setToolTipText("xxx@xxx.xx");
		textEmailRecipient.setColumns(10);
		panelEmail.add(textEmailRecipient);

		textEmailSubject = new JTextField();
		textEmailSubject.setBounds(126, 73, 199, 20);
		textEmailSubject.setToolTipText("Geben Sie bitte einen Betreff ein");
		textEmailSubject.setColumns(10);
		panelEmail.add(textEmailSubject);

		textAreaEmail = new JTextArea();
		textAreaEmail.setToolTipText("Hier Text eingeben");
		textAreaEmail.setBounds(126, 138, 199, 77);
		panelEmail.add(textAreaEmail);

		JLabel labelAbsender = new JLabel("Absender");
		labelAbsender.setBounds(10, 14, 86, 14);
		panelEmail.add(labelAbsender);

		JLabel lblRecipient = new JLabel("Empf�nger");
		lblRecipient.setBounds(10, 45, 86, 14);
		panelEmail.add(lblRecipient);

		JLabel lblEmailBetreff = new JLabel("Betreff");
		lblEmailBetreff.setBounds(10, 76, 86, 14);
		panelEmail.add(lblEmailBetreff);

		// Email Tab, send button
		JButton btnSenden = new JButton("Senden");
		btnSenden.setBounds(306, 259, 89, 23);
		btnSenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Email mail1 = new Email();
				mail1.setMsgSender(textEmailSender.getText());
				mail1.setMsgRecipient(textEmailRecipient.getText());
				mail1.setMsgText(textAreaEmail.getText());
				mail1.setMsgSubject(textEmailSubject.getText());
				mail1.setMsgAttachment(textAttachmentEmail.getText());
				// Validation for all the empty major fields
				if (textEmailSender.getText().trim().length() == 0
						|| textEmailRecipient.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empf�nger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
					
				} 
				// Message after successfully send an Email
				else {

					mail1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"Email wurde gesendet\nF�r mehr Informationen bitte den Log anschauen",
									"Gesendete Email",
									JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});

		JLabel lblEmailText = new JLabel("Text");
		lblEmailText.setBounds(10, 128, 46, 14);
		panelEmail.add(lblEmailText);
		panelEmail.add(btnSenden);

		// Email attachment
		textAttachmentEmail = new JTextField();
		textAttachmentEmail.setBounds(126, 104, 99, 20);
		panelEmail.add(textAttachmentEmail);
		textAttachmentEmail.setColumns(10);
		// Email Attachment button
		JButton btnAnhang = new JButton("Anhang");
		btnAnhang.setBounds(235, 104, 89, 23);
		panelEmail.add(btnAnhang);

		Attachment newAtt1 = new Attachment(textAttachmentEmail);
		btnAnhang.addActionListener(newAtt1);

		// SMS tab
		JPanel panelSMS = new JPanel();
		panelSMS.setBackground(Color.LIGHT_GRAY);
		basePane.addTab("SMS", null, panelSMS, null);
		panelSMS.setLayout(null);

		// SMS text box with tooltips
		textSmsSender = new JTextField();
		textSmsSender.setToolTipText("+41 78 888 88 88");
		textSmsSender.setBounds(151, 11, 205, 20);
		panelSMS.add(textSmsSender);
		textSmsSender.setColumns(10);

		textSmsRecipient = new JTextField();
		textSmsRecipient.setToolTipText("+41 78 888 88 88");
		textSmsRecipient.setBounds(151, 42, 205, 20);
		panelSMS.add(textSmsRecipient);
		textSmsRecipient.setColumns(10);

		JLabel lblNewLabel = new JLabel("TelNr. Absender");
		lblNewLabel.setBounds(10, 14, 105, 14);
		panelSMS.add(lblNewLabel);

		JLabel lblTelNrEmpfnger = new JLabel("TelNr. Empf�nger");
		lblTelNrEmpfnger.setBounds(10, 45, 105, 14);
		panelSMS.add(lblTelNrEmpfnger);

		JLabel lblSmsText = new JLabel("Text");
		lblSmsText.setBounds(10, 76, 105, 14);
		panelSMS.add(lblSmsText);

		// SMS send button
		JButton btnSMSSenden = new JButton("Senden");
		btnSMSSenden.setBounds(151, 129, 89, 23);
		panelSMS.add(btnSMSSenden);
		btnSMSSenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SMS sms1 = new SMS();
				sms1.setMsgSender(textSmsSender.getText());
				sms1.setMsgRecipient(textSmsRecipient.getText());
				sms1.setMsgText(textAreaSms.getText());
				// Validation for all the empty major fields
				if (textSmsSender.getText().trim().length() == 0
						|| textSmsRecipient.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empf�nger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
					
				} 
				// Message after successfully send an SMS
				else {

					sms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"SMS wurde gesendet\nF�r mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});

		// SMS Text box
		textAreaSms = new JTextArea();
		textAreaSms.setToolTipText("Hier Text eingeben");
		textAreaSms.setBounds(151, 71, 205, 47);
		panelSMS.add(textAreaSms);

		// MMS tab with tooltips
		JPanel panelMMS = new JPanel();
		panelMMS.setBackground(Color.LIGHT_GRAY);
		panelMMS.setToolTipText("+41 78 888 88 88");
		basePane.addTab("MMS", null, panelMMS, null);
		panelMMS.setLayout(null);

		// MMS Text box
		textMmsSender = new JTextField();
		textMmsSender.setToolTipText("+41 78 888 88 88");
		textMmsSender.setColumns(10);
		textMmsSender.setBounds(150, 8, 209, 20);
		panelMMS.add(textMmsSender);

		textMmsRecipient = new JTextField();
		textMmsRecipient.setToolTipText("+41 78 888 88 88");
		textMmsRecipient.setHorizontalAlignment(SwingConstants.LEFT);
		textMmsRecipient.setColumns(10);
		textMmsRecipient.setBounds(150, 39, 209, 20);
		panelMMS.add(textMmsRecipient);

		// MMS attachment
		textAttachmentMms = new JTextField();
		textAttachmentMms.setBounds(150, 70, 110, 20);
		panelMMS.add(textAttachmentMms);
		textAttachmentMms.setColumns(10);

		textAreaMms = new JTextArea();
		textAreaMms.setToolTipText("Hier Text eingeben");
		textAreaMms.setBounds(150, 101, 209, 57);
		panelMMS.add(textAreaMms);

		JLabel labelTelNRAbsender = new JLabel("TelNr. Absender");
		labelTelNRAbsender.setBounds(10, 14, 105, 14);
		panelMMS.add(labelTelNRAbsender);

		JLabel labelTelNrEmpfaenger = new JLabel("TelNr. Empf�nger");
		labelTelNrEmpfaenger.setBounds(10, 42, 105, 14);
		panelMMS.add(labelTelNrEmpfaenger);

		JLabel labelMmsText = new JLabel("Text");
		labelMmsText.setBounds(10, 106, 105, 14);
		panelMMS.add(labelMmsText);

		// MMS send button
		JButton button = new JButton("Senden");
		button.addActionListener(new ActionListener() {
			// Validation for the empty important fields
			public void actionPerformed(ActionEvent e) {
				MMS mms1 = new MMS();
				mms1.setMsgSender(textMmsSender.getText());
				mms1.setMsgRecipient(textMmsRecipient.getText());
				mms1.setMsgText(textAreaMms.getText());
				mms1.setMmsAnhang(textAttachmentMms.getText());
				// Validation for all the empty major fields
				if (textMmsSender.getText().trim().length() == 0
						|| textMmsRecipient.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empf�nger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} 
				// Message after successfully send an MMS
				else {

					mms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"MMS wurde gesendet\nF�r mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		// MMS attachment button
		JLabel lblAnhang = new JLabel("Anhang");
		lblAnhang.setBounds(10, 67, 67, 14);
		panelMMS.add(lblAnhang);
		button.setBounds(150, 169, 89, 23);
		panelMMS.add(button);
		
		// MMS send button
		Attachment newAtt2 = new Attachment(textAttachmentMms);
		JButton btnAnhangMms = new JButton("Anhang");
		btnAnhangMms.addActionListener(newAtt2);
		btnAnhangMms.setBounds(270, 70, 89, 23);
		panelMMS.add(btnAnhangMms);

		// Print tab
		JPanel panelPrint = new JPanel();
		panelPrint.setBackground(Color.LIGHT_GRAY);
		basePane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);

		// Choose printer
		JLabel lblTextDrucker = new JLabel("Text");
		lblTextDrucker.setBounds(27, 80, 46, 14);
		panelPrint.add(lblTextDrucker);

		// Print button
		JButton btnPrint = new JButton("Drucken");
		btnPrint.setBounds(113, 173, 89, 23);
		panelPrint.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			// Validation for all the empty major fields
			public void actionPerformed(ActionEvent e) {
				Print print = new Print();
				print.setMsgText(textAreaPrint.getText());
				print.setPrintAnhang(textAttachmentPrint.getText());
				print.setPrintername(comboBoxChoosPrinter.getName());
				if (textAreaPrint.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Das Textfeld ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} 
				// Message after successfully print a file
				else {

					print.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"Ihr Text wird gedruckt\nF�r mehr Informationen bitte den Log anschauen",
									"Druck Vorgang",
									JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});

		// Print attachment
		textAttachmentPrint = new JTextField();
		textAttachmentPrint.setBounds(113, 49, 99, 20);
		panelPrint.add(textAttachmentPrint);
		textAttachmentPrint.setColumns(10);

		// Attachment button
		JButton btnPrintAnhang = new JButton("Anhang");
		Attachment newAtt3 = new Attachment(textAttachmentPrint);
		btnPrintAnhang.addActionListener(newAtt3);

		btnPrintAnhang.setActionCommand("Anhang");
		btnPrintAnhang.setBounds(222, 48, 89, 23);
		panelPrint.add(btnPrintAnhang);

		// Text box with Tooltip
		textAreaPrint = new JTextArea();
		textAreaPrint.setToolTipText("Hier Text eingeben");
		textAreaPrint.setBounds(114, 80, 197, 82);
		panelPrint.add(textAreaPrint);

		comboBoxChoosPrinter = new JComboBox(printerName);
		comboBoxChoosPrinter.setBounds(222, 17, 89, 20);
		panelPrint.add(comboBoxChoosPrinter);

	}
}
