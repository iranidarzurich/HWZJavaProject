package Message;

public class Email extends Message {
	private String msgSubject;
	private String emailAttachment;

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	public String getMsgSubject() {
		return msgSubject;
	}

	public String getMsgAttachment() {
		return emailAttachment;
	}

	public void setMsAnhang(String emailAttachment) {
		this.emailAttachment = emailAttachment;
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
				+ "\nAnhang: " + getMsgAttachment();
		logger.info(sentEmail);
	}
}
