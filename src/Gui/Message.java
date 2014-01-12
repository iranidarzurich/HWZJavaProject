/**
 * 
 */

package Gui;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Message.Email;
import Message.MMS;
import Message.Print;
import Message.SMS;

/**
 * 
 */
public class Message extends JFrame implements ActionListener {
	private JTextField textEmailAbsender;
	private JTextField textEmailEmpfaenger;
	private JTextField textEmailBetreff;
	private JTextField textSmsAbsender;
	private JTextField textSmsEmpfaenger;
	private JTextField textMmsAbsender;
	private JTextField textMmsEmpfaenger;
	private JTextArea  textAreaEmail;
	private JTextArea  textAreaSms;
	private JTextArea  textAreaMms;
	private JTextArea  textAreaDrucken;
	private JTextField textAnhnagName;
	
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
	
	JFileChooser chooser;
	String choosertitle;
	String iname;
	/**
	 * Create the frame.
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		
		
		
        
	    chooser = new JFileChooser(); 
	    chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle(choosertitle);
	    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    //
	    // disable the "All files" option.
	    //
	    chooser.setAcceptAllFileFilterUsed(false);
	    //    
	    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 	      
	      //String iname=FilenameUtils.getBaseName(openFile.getName());
	      try{
	    	  File f=new File(chooser.getSelectedFile().getPath());
		      //String iname=chooser.getName();
		      //String fileName = chooser.getName().substring(0, chooser.getName().lastIndexOf("."));
	    	  iname=chooser.getName(f);
	    	  textAnhnagName.setText(iname);
	      }
	      catch(Exception err){
	    	  //err.printStackTrace();
	      }
	      }
	    else {
	      System.out.println("No Selection ");
	      }
	    	
		
	}
	public Message() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 150, 451, 429);
		setTitle("New Software");
		getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 462);
		getContentPane().add(tabbedPane);

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
				mail1.setMsgAbsender(textEmailAbsender.getText());
				mail1.setMsgEmpfaenger(textEmailEmpfaenger.getText());
				mail1.setMsgText(textAreaEmail.getText());
				mail1.setMsgSubject(textEmailBetreff.getText());
				mail1.createLog();
				JOptionPane
						.showMessageDialog(null,
								"Email wurde gesendet für mehr Informationen bitte den Log anschauen");

			}
		});

		JLabel lblEmailText = new JLabel("Text");
		lblEmailText.setBounds(10, 128, 46, 14);
		panelEmail.add(lblEmailText);
		panelEmail.add(btnSenden);
		
		textAnhnagName = new JTextField();
		textAnhnagName.setBounds(126, 104, 67, 20);
		panelEmail.add(textAnhnagName);
		textAnhnagName.setColumns(10);
		
		JButton btnAnhang = new JButton("Anhang");
		btnAnhang.addActionListener(this);
		btnAnhang.setBounds(235, 104, 89, 23);
		panelEmail.add(btnAnhang);

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
				sms1.setMsgAbsender(textSmsAbsender.getText());
				sms1.setMsgEmpfaenger(textSmsEmpfaenger.getText());
				sms1.setMsgText(textAreaSms.getText());
				sms1.createLog();
				JOptionPane
						.showMessageDialog(null,
								"SMS wurde gesendet für mehr Informationen bitte den Log anschauen");

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
		
		textAreaMms = new JTextArea();
		textAreaMms.setToolTipText("Hier Text eingeben");
		textAreaMms.setBounds(150, 70, 209, 57);
		panelMMS.add(textAreaMms);

		JLabel labelTelNRAbsender = new JLabel("TelNr.Absender");
		labelTelNRAbsender.setBounds(10, 14, 105, 14);
		panelMMS.add(labelTelNRAbsender);

		JLabel labelTelNrEmpfaenger = new JLabel("TelNr.Empfaenger");
		labelTelNrEmpfaenger.setBounds(10, 42, 105, 14);
		panelMMS.add(labelTelNrEmpfaenger);

		JLabel labelMmsText = new JLabel("Text");
		labelMmsText.setBounds(10, 71, 105, 14);
		panelMMS.add(labelMmsText);

		JButton button = new JButton("Senden");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MMS mms1 = new MMS();
				mms1.setMsgAbsender(textMmsAbsender.getText());
				mms1.setMsgEmpfaenger(textMmsEmpfaenger.getText());
				mms1.setMsgText(textAreaMms.getText());
				mms1.createLog();
				JOptionPane
						.showMessageDialog(null,
								"MMS wurde gesendet für mehr Informationen bitte den Log anschauen");
			}
		});
		button.setBounds(150, 138, 89, 23);
		panelMMS.add(button);

		JPanel panelPrint = new JPanel();
		panelPrint.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Print", null, panelPrint, null);
		panelPrint.setLayout(null);

		JLabel lblTestDrucker = new JLabel("Text");
		lblTestDrucker.setBounds(31, 11, 46, 14);
		panelPrint.add(lblTestDrucker);

		JButton btnAudrucken = new JButton("Drucken");
		btnAudrucken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Print print = new Print();
				print.setMsgText(textAreaDrucken.getText());
				print.createLog();
				JOptionPane.showMessageDialog(null, "Ihr Text wird gedruckt");

			}
		});
		btnAudrucken.setBounds(113, 116, 89, 23);
		panelPrint.add(btnAudrucken);
		
		textAreaDrucken = new JTextArea();
		textAreaDrucken.setBounds(113, 11, 184, 82);
		panelPrint.add(textAreaDrucken);

	}
}
