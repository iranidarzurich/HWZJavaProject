package Message;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.jmx.snmp.Timestamp;

public abstract class Message {

	protected String msgType;
	protected String msgText;
	private String msgEmpfaenger;
	private String msgRecipien;
	private String msgAbsender;

	Scanner scan = new Scanner(System.in);

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

	/*
	 * // scan recipient public void scanMsgRecipien() {
	 * 
	 * boolean inputError3 = false; boolean inputError4 = false; do { //
	 * Usereingabe: Empfaenger if (inputError3) { System.out
	 * .println("Der Empfaenger ist auf der Blacklist. Bitte neu eingeben:"); }
	 * 
	 * do { if (inputError4) { System.out
	 * .println("Emfpaenger darf keine Leerzeichen enthalten. Bitte neu eingeben:"
	 * ); }
	 * 
	 * if (!inputError4) { System.out.println("Bitte Emfpaenger eingeben: "); }
	 * msgRecipien = scan.nextLine(); inputError4 =
	 * msgRecipien.matches(".*\\s+.*");
	 * 
	 * } while (inputError4);// Emfpaenger auf Leerzeichen ueberpruefen
	 * 
	 * 
	 * die Variable onBlackl wird nach der Blacklistueberpruefung auf true
	 * (gesperrt) oder false (ok) gesetzt
	 * 
	 * 
	 * // Wird temporaer auf false gesetzt // TODO Blacklisthandler
	 * 
	 * boolean onBlackl = false;
	 * 
	 * if (onBlackl == true// Empfaenger auf Sperrset ) { // Fehlermeldung
	 * "Empfaenger auf Sperset" inputError3 = true; } else { // fehler = false
	 * inputError3 = false; } } while (inputError3 == true // Fehler = true
	 * (Empfaenger auf Sperrset) ); }
	 */

	// Create Logfile at console
	public void createLog() {
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd.MM.yyyy 'at' HH:mm:ss ");
		Date currentTime = new Date();

		System.out.println("Zeit und Datum : " + formatter.format(currentTime)
				+ "\nNachricht erfolgreich verschickt " + "\n"
				+ "\nAbsender : " + getMsgAbsender() + "\nEmpfaenger: "
				+ getMsgEmpfaenger() + "\nInhalt: " + getMsgText());

		// TODO Logfile Eintrag generieren

	}

	public String writeLog() {
		return "logfile erfolgreich gespeichert";
	}

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
