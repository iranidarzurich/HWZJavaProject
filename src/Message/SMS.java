package Message;



public class SMS extends Message {

	@Override
	public void scanMsgText(){
		
		boolean inputError6 = false;
		do {
			
			/* Usereingabe: Nachricht */
			if (inputError6) {
				System.out
						.println("Text zu Lang. SMS max 160 Zeichen. ");
			}
			System.out.println("Bitte Nachricht eingeben: ");
			this.msgText = scan.nextLine();
					
			
			
				/* Zeichen ueberpruefen */

				if (msgText.length() < 161 /* =<160 Zeichen */) {
					/* Fehler = false */
					inputError6 = false;
				} else {
					/*
					 * fehler = true Text zu lang
					 */
					inputError6 = true;
				}
			
		} while (inputError6/* Do-While inputError6 true */);

		
	}
	public SMS() {
		// TODO Auto-generated constructor stub
		super();
		this.setMsgType("SMS");
	}



}
