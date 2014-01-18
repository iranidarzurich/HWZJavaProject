package Message;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.sun.jmx.snmp.Timestamp;

public abstract class Message {

	protected String msgType;
	protected String msgText;
	private String msgEmpfaenger;
	private String msgRecipien;
	private String msgAbsender;

	Scanner scan = new Scanner(System.in);
	Logger logger = Logger.getLogger("MyLog");
	FileHandler fh;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getMsgText() {
		return msgText;
	}

	public void scanMsgText() {

		System.out.println("Bitte Nachricht eingeben: ");
		this.msgText = scan.nextLine();
		;

	}

	public String getMsgRecipien() {
		return msgRecipien;
	}

	// scan recipient
	public void scanMsgRecipien() {

		boolean inputError3 = false;
		boolean inputError4 = false;
		do {
			// Usereingabe: Empfaenger
			if (inputError3) {
				System.out
						.println("Der Empfaenger ist auf der Blacklist. Bitte neu eingeben:");
			}

			do {
				if (inputError4) {
					System.out
							.println("Emfpaenger darf keine Leerzeichen enthalten. Bitte neu eingeben:");
				}

				if (!inputError4) {
					System.out.println("Bitte Emfpaenger eingeben: ");
				}
				msgRecipien = scan.nextLine();
				inputError4 = msgRecipien.matches(".*\\s+.*");

			} while (inputError4);/* Emfpaenger auf Leerzeichen ueberpruefen */

			/*
			 * die Variable onBlackl wird nach der Blacklistueberpruefung auf
			 * true (gesperrt) oder false (ok) gesetzt
			 */
			/*
			 * ueberpruefen ob Empfaenger auf der Blacklist ist Code import von
			 * Fabian
			 */
			// Wird temporaer auf false gesetzt
			// TODO Blacklisthandler

			boolean onBlackl = false;

			if (onBlackl == true/* Empfaenger auf Sperrset */) {
				/* Fehlermeldung "Empfaenger auf Sperset" */
				inputError3 = true;
			} else {
				// fehler = false
				inputError3 = false;
			}
		} while (inputError3 == true
		// Fehler = true (Empfaenger auf Sperrset)
		);
	}

	public void log() {
		try {
			// logfile size limit 1MB
			int limit = 1000000;

			// configure the logger with handler and formatter
			fh = new FileHandler("C:/temp/LogFile.log", limit, 1, true);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Create Logfile at console
	public void createLog() {
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd.MM.yyyy 'at' HH:mm:ss ");
		Date currentTime = new Date();
		String ausgabe = "\nNachricht erfolgreich verschickt " + "\n"
				+ "\nAbsender : " + getMsgAbsender() + "\nEmpfaenger: "
				+ getMsgEmpfaenger() + "\nInhalt: " + getMsgText();
		// System.out.println(ausgabe);

		// create logfile and entries
		log();
		logger.info(ausgabe);

	}

	/*
	 * public String writeLog() { return "logfile erfolgreich gespeichert"; }
	 */

	public Message() {
	}

	public String getMsgAbsender() {
		return msgAbsender;
	}

	public void setMsgAbsender(String msgAbsender) {
		this.msgAbsender = msgAbsender;
	}

	public String getMsgEmpfaenger() {
		return msgEmpfaenger;
	}

	public void setMsgEmpfaenger(String msgEmpfaenger) {
		this.msgEmpfaenger = msgEmpfaenger;
	}

}
