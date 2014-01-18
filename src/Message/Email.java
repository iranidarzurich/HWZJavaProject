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

	public Email() {
		super();
		this.setMsgType("Mail");
	}

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentEmail = output + "\nBetreff: " + this.getMsgSubject()
				+ "\nAnhang: " + getMsAnhang() + "\nAnzahl Zeichen: "
				+ getMsgText().length();
		logger.info(sentEmail);
	}
}
