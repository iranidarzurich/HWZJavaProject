package Message;

public class MMS extends Message {
	private String mmsAttachment;

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentMMS = output + "\r\nAnzahl Zeichen: " + "\r\nAnhang: "
				+ getMmsAttachment() + getMsgText().length();
		logger.info(sentMMS);
	}

	public MMS() {
		super();
		this.setMsgType("MMS");
	}

	public String getMmsAttachment() {
		return mmsAttachment;
	}

	public void setMmsAnhang(String mmsAttachment) {
		this.mmsAttachment = mmsAttachment;
	}

}
