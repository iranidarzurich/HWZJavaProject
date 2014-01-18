package Message;

//hallo

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

	@Override
	public void createLog() {
		super.createLog();
		String sentEmail = "Betreff: " + this.getMsgSubject() + "\n"
				+ "Anhang: " + getMsAnhang();
		logger.info(sentEmail);
	}

}
