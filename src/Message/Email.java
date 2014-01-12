package Message;



public class Email extends Message {
	private String msgSubject;
	private String msAnhang;

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}



	public String getMsgSubject() {
		return msgSubject;
	}

	public String getMsAnhang() {
		return msAnhang;
	}



	public void setMsAnhang(String msAnhang) {
		this.msAnhang = msAnhang;
	}



	public void scanMsgSubject() {

//		System.out.println("Bitte einen Email Betreff eingeben(max 78 Zeichen): ");

		boolean inputError5 = false;

		do {

			
			/* Usereingabe: Betreff */
			if (inputError5) {
				System.out
						.println("Betreff zu Lang, max 78 Zeichen zulaessig. Bitte neu eingeben: ");
			}
			this.msgSubject = scan.nextLine();
			

			/* Zeichen ueberpruefen */

			if (msgSubject.length() < 79 /* max 78 Zeichen */) {
				/* Fehler = false */
				inputError5 = false;
			} else {
				/*
				 * Fehler Betreff zu lang
				 */
				inputError5 = true;
			}

		} while (inputError5/* Do-While inputError5 true */);

		/*
		 * Nach http://www.ietf.org/rfc/rfc2822.txt Kapitel 2.1 sollte nach
		 * Standard ein Email Betreff nicht laneger als 78 Zeichen sein
		 */
	}

	public Email() {
		super();
		this.setMsgType("Mail");
	}

	@Override
	public void createLog() {
			super.createLog();
		System.out.println("Betreff: " +this.getMsgSubject()+"\n"+"Anhang: "+getMsAnhang());
	}

}
