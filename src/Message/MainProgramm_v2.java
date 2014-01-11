package Message;




//TODO
/*
* - inputError Variablen: treffendere Namen
* - Blacklisthandler: Muss in "Message" eingebunden werden
* - Logfilesanzeigen
* - Logfile Eintrag erstellen
* - Klassennamen: Doron, Markus, Fabian gleiche Namen vergeben
* 
*/



import java.util.Scanner;

public class MainProgramm_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * solange die Exit Variable auf false ist, wird das Programm
		 * ausgeführt. Damit der Userinput verarbeitet werden kann, wird am
		 * Anfang eine Scanner Obejekt instanziert
		 */

		boolean running = true;
		boolean inputError1 = false;
		Scanner scan = new Scanner(System.in);
		int msgType;

		do {

			/*
			 * Usereingabe: User hat die Auswahl zwischen - Logfiles anzeigen -
			 * SMS, MMS oder Email Versand Usereingabe wird auf Korrektheit
			 * ueberprueft, falls nicht, muss User Eingabe wiederholen. Danach
			 * wird ueberprueft welche Auswahl getroffen wurde und dies
			 * ausgefuerht.
			 */
			
			//TODO Diese Do-While Schlaufe kann in einer separate Klasse untergebracht werden
			do {

				if (inputError1) {
					System.out
							.println("Falsche Auswahl, bitte nochmals eingeben:");
					inputError1 = false;
				}
				System.out.println("Was soll getan werden?");

				System.out
						.println("Logsanschauen(1), Mail senden(2),SMS senden(3), MMS senden(4)");
				msgType = 0;

				/* Pruefung ob Eingabe Numerisch */
				if (scan.hasNextInt()) {
					msgType = scan.nextInt();
					inputError1 = false;
				} else {
					inputError1 = true;
					scan.nextLine();
				}

				/* Eingabe ist Numerisch: Switchcase zur Auswahlpruefgung */
				switch (msgType) {
				case 1 /* Logs anzeigen */:

					inputError1 = false;
					// TODO Logs Anzeigen
					System.out.println("Es werden die Logs angezeigt:...");
					break;

				case 2/* Mail */:

					inputError1 = false;
					Email mail1 = new Email();
					mail1.scanMsgText();
					mail1.scanMsgRecipien();
					mail1.scanMsgSubject();
					mail1.createLog();
					//TODO Write Logfile
					break;
					

				case 3/* sms */:

					inputError1 = false;
					SMS sms1 = new SMS();
					sms1.scanMsgText();
					sms1.scanMsgRecipien();
					sms1.createLog();
					//TODO Write Logfile
					break;

				case 4 /* mms */:

					inputError1 = false;

					MMS mms1 = new MMS();
					mms1.scanMsgText();
					mms1.scanMsgRecipien();
					mms1.createLog();
					//TODO Write Logfile
					break;

				default:
					/*
					 * Falsche Auswahl User muss nochmals neu eingeben
					 */
					inputError1 = true;
					break;
				}

			} while (inputError1);

			/* Ueberpruefen ob User das Programm beenden moechte */
		
			System.out
					.println("Programm mit 1 beenden, weiter mit beliebiger Eingabe");
			if (scan.hasNextInt()) {
				int exitInput = scan.nextInt();
				if (exitInput == 1) {
					/* exitZaehler = true */
					running = false;

				} else {
					// Alternative moeglich
					running = true;

				}
			} else {
				scan.next();
				scan.nextLine();
			}
		} while (running);
		scan.close();
	}

}
