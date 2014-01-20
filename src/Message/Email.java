package Message;

public class Email extends Message {
	//Variable
	private String msgSubject;
	private String emailAttachment;

	public Email() {
	}

	public String getMsgSubject() {
		return msgSubject;
	}

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	public String getMsgAttachment() {
		return emailAttachment;
	}

	public void setMsgAttachment(String emailAttachment) {
		this.emailAttachment = emailAttachment;
	}

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentEmail = output + "\r\nBetreff: " + this.getMsgSubject()
				+ "\r\nAnhang: " + getMsgAttachment() + "\r\n";
		logger.info(sentEmail);
	}
}
