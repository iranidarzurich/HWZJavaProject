package Message;

import java.util.Scanner;

public abstract class Message {

	protected String msgType;
	protected String msgText;
	private String msgRecipien;
	Scanner scan = new Scanner(System.in);

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgText() {
		return msgText;
	}

	public void scanMsgText() {

		System.out.println("Bitte Nachricht eingeben: ");
		this.msgText = scan.nextLine();
		;

	}
//Muss nicht kommentiert werden
	public String getMsgRecipien() {
		return msgRecipien;
	}

	/** Emfp�nger wird eingelesen**/
	public void scanMsgRecipien() {

		boolean inputError3 = false;
		boolean inputError4 = false;
		do {/* Usereingabe: Empfaenger */
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

			} while (inputError4);/*Emfpaenger auf Leerzeichen ueberpruefen*/

			/*
			 * die Variable onBlackl wird nach der Blacklistueberpruefung auf
			 * true (gesperrt) oder false (ok) gesetzt
			 */
			/*
			 * ueberpruefen ob Empfaenger auf der Blacklist ist Code import von
			 * Fabian
			 */
			// Wird temporaer auf false gesetzt
			//TODO Blacklisthandler
			
			boolean onBlackl = false;

			if (onBlackl == true/* Empfaenger auf Sperrset */) {
				/* Fehlermeldung "Empfaenger auf Sperset" */
				inputError3 = true;
			} else {
				/* fehler = false */
				inputError3 = false;
			}
		} while (inputError3 == true/*
									 * Fehler = true (Empfaenger auf Sperrset)
									 */);
	}

	public void sendMessage() {
		System.out.println("Nachricht erfolgreich verschickt. Nachricht "
				+ this.getMsgText() + ". Empfaenger: " + getMsgRecipien()
				+ ". Nachrichtentyp: " + this.getMsgType());
		/* Logfile Eintrag */

		// TODO Logfile Eintrag generieren

	}

	public String writeLog() {
		return "logfile erfolgreich gespeichert";
	}

	public Message() {
		// TODO Auto-generated constructor stub
	}

}
