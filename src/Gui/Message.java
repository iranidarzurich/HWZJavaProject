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

import Message.Attachment;
import Message.Email;
import Message.Login;
import Message.MMS;
import Message.Print;
import Message.SMS;

import javax.swing.JComboBox;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

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
	private JComboBox<String> comboBoxChoosPrinter;
	private JPanel panelEmail;
	private JPanel panelSms;
	private JPanel panelMms;
	private JPanel panelPrint;
	private JPanel panelLogin;
	private JTabbedPane basePane;
	private String printerType;
	private static String[] printerName = { "HP", "Canon" };

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

		basePane = new JTabbedPane(JTabbedPane.TOP);
		basePane.setBackground(Color.LIGHT_GRAY);
		basePane.setBounds(0, 0, 434, 391);
		getContentPane().add(basePane);

		// Login tab
		panelLogin = new JPanel();
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
					if (login.compare()) {
						basePane.addTab("Email", null, panelEmail, null);
						basePane.addTab("SMS", null, panelSms, null);
						basePane.addTab("MMS", null, panelMms, null);
						basePane.addTab("Print", null, panelPrint, null);
						basePane.removeTabAt(0);
					}
				}
			}

		});
		// Email Tab
		panelEmail = new JPanel();
		panelEmail.setBackground(Color.LIGHT_GRAY);
//		basePane.addTab("Email", null, panelEmail, null);
		panelEmail.setLayout(null);

		// Email text box with tooltips
		textEmailSender = new JTextField();
		textEmailSender.setText("multichannel@HWZ.ch");
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
		textAreaEmail.setBounds(126, 138, 199, 117);
		panelEmail.add(textAreaEmail);

		JLabel labelAbsender = new JLabel("Absender");
		labelAbsender.setBounds(10, 14, 86, 14);
		panelEmail.add(labelAbsender);

		JLabel lblRecipient = new JLabel("Empfänger");
		lblRecipient.setBounds(10, 45, 86, 14);
		panelEmail.add(lblRecipient);

		JLabel lblEmailBetreff = new JLabel("Betreff");
		lblEmailBetreff.setBounds(10, 76, 86, 14);
		panelEmail.add(lblEmailBetreff);

		// Email Tab, send button
		JButton btnSenden = new JButton("Senden");
		btnSenden.setBounds(126, 266, 89, 23);
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
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);

				}
				// Message after successfully send an Email
				else {

					mail1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"Email wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Gesendete Email",
									JOptionPane.INFORMATION_MESSAGE);
					textEmailRecipient.setText("");
					textEmailSender.setText("");
					textAreaEmail.setText("");
					textEmailSubject.setText("");
					textAttachmentEmail.setText("");

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

		// MMS tab with tooltips
		panelMms = new JPanel();
		panelMms.setBackground(Color.LIGHT_GRAY);
		panelMms.setToolTipText("+41 78 888 88 88");
		// basePane.addTab("MMS", null, panelMms, null);
		panelMms.setLayout(null);

		// MMS Text box
		textMmsSender = new JTextField();
		textMmsSender.setText("+41 79 876 54 32");
		textMmsSender.setToolTipText("+41 78 888 88 88");
		textMmsSender.setColumns(10);
		textMmsSender.setBounds(150, 8, 209, 20);
		panelMms.add(textMmsSender);

		textMmsRecipient = new JTextField();
		textMmsRecipient.setToolTipText("+41 78 888 88 88");
		textMmsRecipient.setHorizontalAlignment(SwingConstants.LEFT);
		textMmsRecipient.setColumns(10);
		textMmsRecipient.setBounds(150, 39, 209, 20);
		panelMms.add(textMmsRecipient);

		// MMS attachment
		textAttachmentMms = new JTextField();
		textAttachmentMms.setBounds(150, 70, 110, 20);
		panelMms.add(textAttachmentMms);
		textAttachmentMms.setColumns(10);

		textAreaMms = new JTextArea();
		textAreaMms.setToolTipText("Hier Text eingeben");
		textAreaMms.setBounds(150, 101, 209, 71);
		panelMms.add(textAreaMms);

		JLabel labelTelNRAbsender = new JLabel("TelNr. Absender");
		labelTelNRAbsender.setBounds(10, 14, 105, 14);
		panelMms.add(labelTelNRAbsender);

		JLabel labelTelNrRecipientMms = new JLabel("TelNr. Empfänger");
		labelTelNrRecipientMms.setBounds(10, 42, 105, 14);
		panelMms.add(labelTelNrRecipientMms);

		JLabel labelMmsText = new JLabel("Text");
		labelMmsText.setBounds(10, 106, 105, 14);
		panelMms.add(labelMmsText);

		// MMS send button
		JButton button = new JButton("Senden");
		button.addActionListener(new ActionListener() {
			// Validation for the empty important fields
			public void actionPerformed(ActionEvent e) {
				MMS mms1 = new MMS();
				mms1.setMsgSender(textMmsSender.getText());
				mms1.setMsgRecipient(textMmsRecipient.getText());
				mms1.setMsgText(textAreaMms.getText());
				mms1.setMmsAttachment(textAttachmentMms.getText());
				// Validation for all the empty major fields
				if (textMmsSender.getText().trim().length() == 0
						|| textMmsRecipient.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				}
				// Message after successfully send an MMS
				else {

					mms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"MMS wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);
					textMmsRecipient.setText("");
					textMmsSender.setText("");
					textAreaMms.setText("");
					textAttachmentMms.setText("");

				}
			}
		});

		// MMS attachment button
		JLabel lblAnhang = new JLabel("Anhang");
		lblAnhang.setBounds(10, 67, 67, 14);
		panelMms.add(lblAnhang);
		button.setBounds(150, 183, 89, 23);
		panelMms.add(button);

		// MMS send button
		Attachment newAtt2 = new Attachment(textAttachmentMms);
		JButton btnAnhangMms = new JButton("Anhang");
		btnAnhangMms.addActionListener(newAtt2);
		btnAnhangMms.setBounds(270, 70, 89, 23);
		panelMms.add(btnAnhangMms);

		// Print tab
		panelPrint = new JPanel();
		panelPrint.setBackground(Color.LIGHT_GRAY);
		// basePane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);

		// Choose printer
		JLabel lblTextDrucker = new JLabel("Text");
		lblTextDrucker.setBounds(27, 80, 46, 14);
		panelPrint.add(lblTextDrucker);

		JLabel lblPrinterchooser = new JLabel("Drucker Ausw\u00E4hlen");
		lblPrinterchooser.setBounds(27, 24, 112, 14);
		panelPrint.add(lblPrinterchooser);

		// Print button
		JButton btnPrint = new JButton("Drucken");
		btnPrint.setBounds(113, 173, 89, 23);
		panelPrint.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			// Validation for all the empty major fields
			public void actionPerformed(ActionEvent e) {
				Print print = new Print();
				print.setMsgText(textAreaPrint.getText());
				print.setPrintAttachmnet(textAttachmentPrint.getText());
				print.setPrintername(printerType);
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
									"Ihr Text wird gedruckt\nFür mehr Informationen bitte den Log anschauen",
									"Druck Vorgang",
									JOptionPane.INFORMATION_MESSAGE);
					textAreaPrint.setText("");
					textAttachmentPrint.setText("");

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
		comboBoxChoosPrinter
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent arg0) {
						String prop = comboBoxChoosPrinter.getSelectedItem()
								.toString();
						printerType = prop;
					}
				});
		comboBoxChoosPrinter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String prop = comboBoxChoosPrinter.getSelectedItem().toString();
				printerType = prop;
			}
		});
		comboBoxChoosPrinter.setBounds(222, 21, 89, 20);
		panelPrint.add(comboBoxChoosPrinter);

		// SMS tab
		panelSms = new JPanel();
		panelSms.setBackground(Color.LIGHT_GRAY);
		// basePane.addTab("SMS", null, panelSms, null);
		panelSms.setLayout(null);

		// SMS text box with tooltips
		textSmsSender = new JTextField();
		textSmsSender.setText("+41 79 876 54 32");
		textSmsSender.setToolTipText("+41 78 888 88 88");
		textSmsSender.setBounds(151, 11, 205, 20);
		panelSms.add(textSmsSender);
		textSmsSender.setColumns(10);

		textSmsRecipient = new JTextField();
		textSmsRecipient.setToolTipText("+41 78 888 88 88");
		textSmsRecipient.setBounds(151, 42, 205, 20);
		panelSms.add(textSmsRecipient);
		textSmsRecipient.setColumns(10);

		JLabel lblNewLabel = new JLabel("TelNr. Absender");
		lblNewLabel.setBounds(10, 14, 105, 14);
		panelSms.add(lblNewLabel);

		JLabel lblTelNrRecipientSms = new JLabel("TelNr. Empfänger");
		lblTelNrRecipientSms.setBounds(10, 45, 105, 14);
		panelSms.add(lblTelNrRecipientSms);

		JLabel lblSmsText = new JLabel("Text");
		lblSmsText.setBounds(10, 76, 105, 14);
		panelSms.add(lblSmsText);

		// SMS send button
		JButton btnSMSSenden = new JButton("Senden");
		btnSMSSenden.setBounds(151, 171, 89, 23);
		panelSms.add(btnSMSSenden);
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
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				}
				// Message after successfully send an SMS
				else {

					sms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"SMS wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);
					textSmsRecipient.setText("");
					textSmsSender.setText("");
					textAreaSms.setText("");

				}
			}
		});

		// SMS Text box
		textAreaSms = new JTextArea();
		textAreaSms.setToolTipText("Hier Text eingeben");
		textAreaSms.setBounds(151, 71, 205, 89);
		panelSms.add(textAreaSms);

	}
}
