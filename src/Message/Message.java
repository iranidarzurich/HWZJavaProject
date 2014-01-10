package Message;

import java.util.Scanner;

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
//Muss nicht kommentiert werden
	public String getMsgRecipien() {
		return msgRecipien;
	}

	/** Emfpänger wird eingelesen**/
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
			System.out.println("Nachricht erfolgreich verschickt "+"\n\n" +"Absender : "+getMsgAbsender()+ "\n"
					+ "Empfaenger: " + getMsgEmpfaenger()
					+"\n"+ "Inhalt: "+ getMsgText()) ;
		/* Logfile Eintrag */

		// TODO Logfile Eintrag generieren

	}

	public String writeLog() {
		return "logfile erfolgreich gespeichert";
	}

	public Message() {
		// TODO Auto-generated constructor stub
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
