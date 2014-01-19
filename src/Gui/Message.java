/**
 * 
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

/**
 * 
 */
public class Message extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8008759198163764949L;
	private JTextField textEmailAbsender;
	private JTextField textEmailEmpfaenger;
	private JTextField textEmailBetreff;
	private JTextField textSmsAbsender;
	private JTextField textSmsEmpfaenger;
	private JTextField textMmsAbsender;
	private JTextField textMmsEmpfaenger;
	private JTextArea textAreaEmail;
	private JTextArea textAreaSms;
	private JTextArea textAreaMms;
	private JTextArea textAreaDrucken;
	private JTextField textAnhnagEmail;
	private JTextField textAnhangMms;
	private JTextField textAnhangPrint;
	private JTextField textUsername;
	private JPasswordField passwordLogin;

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

	// */
	public Message() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 150, 451, 429);
		setTitle("JAVA PROJEKT");
		getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		tabbedPane.setBounds(0, 0, 434, 462);
		getContentPane().add(tabbedPane);

		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Login", null, panelLogin, null);
		panelLogin.setLayout(null);

		JLabel lblInputUsernameAndPassword = new JLabel(
				"Ihre Username und Passwort eingeben");
		lblInputUsernameAndPassword.setBounds(99, 104, 275, 14);
		panelLogin.add(lblInputUsernameAndPassword);

		JLabel lblUsername = new JLabel("UserName:");
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

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setUserName(textUsername.getText());
				login.setPassword(passwordLogin.getText());
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
		btnLogin.setBounds(168, 207, 120, 23);
		panelLogin.add(btnLogin);

		JPanel panelEmail = new JPanel();
		panelEmail.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Email", null, panelEmail, null);
		panelEmail.setLayout(null);

		textEmailAbsender = new JTextField();
		textEmailAbsender.setBounds(126, 11, 199, 20);
		textEmailAbsender.setToolTipText("xxx@xxx.xx");
		panelEmail.add(textEmailAbsender);
		textEmailAbsender.setColumns(10);

		textEmailEmpfaenger = new JTextField();
		textEmailEmpfaenger.setBounds(126, 42, 199, 20);
		textEmailEmpfaenger.setToolTipText("xxx@xxx.xx");
		textEmailEmpfaenger.setColumns(10);
		panelEmail.add(textEmailEmpfaenger);

		textEmailBetreff = new JTextField();
		textEmailBetreff.setBounds(126, 73, 199, 20);
		textEmailBetreff.setToolTipText("Geben Sie bitte einen Betrff ein");
		textEmailBetreff.setColumns(10);
		panelEmail.add(textEmailBetreff);

		textAreaEmail = new JTextArea();
		textAreaEmail.setToolTipText("Hier Text eingeben");
		textAreaEmail.setBounds(126, 138, 199, 77);
		panelEmail.add(textAreaEmail);

		JLabel labelAbsender = new JLabel("Absender");
		labelAbsender.setBounds(10, 14, 86, 14);
		panelEmail.add(labelAbsender);

		JLabel lblEmpfnger = new JLabel("Empfaenger");
		lblEmpfnger.setBounds(10, 45, 86, 14);
		panelEmail.add(lblEmpfnger);

		JLabel lblEmailBetreff = new JLabel("Betreff");
		lblEmailBetreff.setBounds(10, 76, 86, 14);
		panelEmail.add(lblEmailBetreff);

		JButton btnSenden = new JButton("Senden");
		btnSenden.setBounds(306, 259, 89, 23);
		btnSenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Email mail1 = new Email();
				mail1.setMsgSender(textEmailAbsender.getText());
				mail1.setMsgRecipient(textEmailEmpfaenger.getText());
				mail1.setMsgText(textAreaEmail.getText());
				mail1.setMsgSubject(textEmailBetreff.getText());
				mail1.setMsAnhang(textAnhnagEmail.getText());
				if (textEmailAbsender.getText().trim().length() == 0
						|| textEmailEmpfaenger.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} else {

					mail1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"Email wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Gesendete Email",
									JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});

		JLabel lblEmailText = new JLabel("Text");
		lblEmailText.setBounds(10, 128, 46, 14);
		panelEmail.add(lblEmailText);
		panelEmail.add(btnSenden);

		textAnhnagEmail = new JTextField();
		textAnhnagEmail.setBounds(126, 104, 67, 20);
		panelEmail.add(textAnhnagEmail);
		textAnhnagEmail.setColumns(10);

		JButton btnAnhang = new JButton("Anhang");
		btnAnhang.setBounds(235, 104, 89, 23);
		panelEmail.add(btnAnhang);

		Attachment newAtt1 = new Attachment(textAnhnagEmail);
		btnAnhang.addActionListener(newAtt1);

		JPanel panelSMS = new JPanel();
		panelSMS.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("SMS", null, panelSMS, null);
		panelSMS.setLayout(null);

		textSmsAbsender = new JTextField();
		textSmsAbsender.setToolTipText("+41 78 888 88 88");
		textSmsAbsender.setBounds(151, 11, 205, 20);
		panelSMS.add(textSmsAbsender);
		textSmsAbsender.setColumns(10);

		textSmsEmpfaenger = new JTextField();
		textSmsEmpfaenger.setToolTipText("+41 78 888 88 88");
		textSmsEmpfaenger.setBounds(151, 42, 205, 20);
		panelSMS.add(textSmsEmpfaenger);
		textSmsEmpfaenger.setColumns(10);

		JLabel lblNewLabel = new JLabel("TelNr.Absender");
		lblNewLabel.setBounds(10, 14, 105, 14);
		panelSMS.add(lblNewLabel);

		JLabel lblTelNrEmpfnger = new JLabel("TelNr.Empfaenger");
		lblTelNrEmpfnger.setBounds(10, 45, 105, 14);
		panelSMS.add(lblTelNrEmpfnger);

		JLabel lblSmsText = new JLabel("Text");
		lblSmsText.setBounds(10, 76, 105, 14);
		panelSMS.add(lblSmsText);

		JButton btnSMSSenden = new JButton("Senden");
		btnSMSSenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SMS sms1 = new SMS();
				sms1.setMsgSender(textSmsAbsender.getText());
				sms1.setMsgRecipient(textSmsEmpfaenger.getText());
				sms1.setMsgText(textAreaSms.getText());
				if (textSmsAbsender.getText().trim().length() == 0
						|| textSmsEmpfaenger.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} else {

					sms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"SMS wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});
		btnSMSSenden.setBounds(151, 129, 89, 23);
		panelSMS.add(btnSMSSenden);

		textAreaSms = new JTextArea();
		textAreaSms.setBounds(151, 71, 205, 47);
		panelSMS.add(textAreaSms);

		JPanel panelMMS = new JPanel();
		panelMMS.setBackground(Color.LIGHT_GRAY);
		panelMMS.setToolTipText("+41 78 888 88 88");
		tabbedPane.addTab("MMS", null, panelMMS, null);
		panelMMS.setLayout(null);

		textMmsAbsender = new JTextField();
		textMmsAbsender.setToolTipText("+41 78 888 88 88");
		textMmsAbsender.setColumns(10);
		textMmsAbsender.setBounds(150, 8, 209, 20);
		panelMMS.add(textMmsAbsender);

		textMmsEmpfaenger = new JTextField();
		textMmsEmpfaenger.setToolTipText("+41 78 888 88 88");
		textMmsEmpfaenger.setHorizontalAlignment(SwingConstants.LEFT);
		textMmsEmpfaenger.setColumns(10);
		textMmsEmpfaenger.setBounds(150, 39, 209, 20);
		panelMMS.add(textMmsEmpfaenger);

		textAnhangMms = new JTextField();
		textAnhangMms.setBounds(150, 70, 86, 20);
		panelMMS.add(textAnhangMms);
		textAnhangMms.setColumns(10);

		textAreaMms = new JTextArea();
		textAreaMms.setToolTipText("Hier Text eingeben");
		textAreaMms.setBounds(150, 101, 209, 57);
		panelMMS.add(textAreaMms);

		JLabel labelTelNRAbsender = new JLabel("TelNr.Absender");
		labelTelNRAbsender.setBounds(10, 14, 105, 14);
		panelMMS.add(labelTelNRAbsender);

		JLabel labelTelNrEmpfaenger = new JLabel("TelNr.Empfaenger");
		labelTelNrEmpfaenger.setBounds(10, 42, 105, 14);
		panelMMS.add(labelTelNrEmpfaenger);

		JLabel labelMmsText = new JLabel("Text");
		labelMmsText.setBounds(10, 106, 105, 14);
		panelMMS.add(labelMmsText);

		JButton button = new JButton("Senden");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MMS mms1 = new MMS();
				mms1.setMsgSender(textMmsAbsender.getText());
				mms1.setMsgRecipient(textMmsEmpfaenger.getText());
				mms1.setMsgText(textAreaMms.getText());
				mms1.setMmsAnhang(textAnhangMms.getText());
				if (textMmsAbsender.getText().trim().length() == 0
						|| textMmsEmpfaenger.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Absender oder Empfänger ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} else {

					mms1.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"MMS wurde gesendet\nFür mehr Informationen bitte den Log anschauen",
									"Sendung", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JLabel lblAnhang = new JLabel("Anhang");
		lblAnhang.setBounds(10, 67, 67, 14);
		panelMMS.add(lblAnhang);
		button.setBounds(150, 169, 89, 23);
		panelMMS.add(button);

		Attachment newAtt2 = new Attachment(textAnhangMms);
		JButton btnAnhangMms = new JButton("Anhang");
		btnAnhangMms.addActionListener(newAtt2);
		btnAnhangMms.setBounds(270, 70, 89, 23);
		panelMMS.add(btnAnhangMms);

		JPanel panelPrint = new JPanel();
		panelPrint.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);

		JLabel lblTestDrucker = new JLabel("Text");
		lblTestDrucker.setBounds(30, 60, 46, 14);
		panelPrint.add(lblTestDrucker);

		JButton btnAudrucken = new JButton("Drucken");
		btnAudrucken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Print print = new Print();
				print.setMsgText(textAreaDrucken.getText());
				print.setPrintAnhang(textAnhangPrint.getText());
				if (textAreaDrucken.getText().trim().length() == 0) {
					JOptionPane
							.showMessageDialog(
									null,
									"Das Textfeld ist leer\nBitte kontrollieren Sie es noch einmal",
									"leere Felder", JOptionPane.ERROR_MESSAGE);
				} else {

					print.createLog();
					JOptionPane
							.showMessageDialog(
									null,
									"Ihr Text wird gedruckt\nFür mehr Informationen bitte den Log anschauen",
									"Druck Vorgang",
									JOptionPane.INFORMATION_MESSAGE);

				}
			}
		});
		btnAudrucken.setBounds(113, 148, 89, 23);
		panelPrint.add(btnAudrucken);

		textAnhangPrint = new JTextField();
		textAnhangPrint.setBounds(113, 11, 86, 20);
		panelPrint.add(textAnhangPrint);
		textAnhangPrint.setColumns(10);

		JButton btnPrintAnhang = new JButton("Anhang");
		Attachment newAtt3 = new Attachment(textAnhangPrint);
		btnPrintAnhang.addActionListener(newAtt3);

		btnPrintAnhang.setActionCommand("Anhang");
		btnPrintAnhang.setBounds(209, 10, 89, 23);
		panelPrint.add(btnPrintAnhang);

		textAreaDrucken = new JTextArea();
		textAreaDrucken.setBounds(113, 55, 184, 82);
		panelPrint.add(textAreaDrucken);

	}
}
