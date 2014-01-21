package business_classes;

public class MMS extends Message {
	private String mmsAttachment;

	public MMS() {
	}

	public String getMmsAttachment() {
		return mmsAttachment;
	}

	public void setMmsAttachment(String mmsAttachment) {
		this.mmsAttachment = mmsAttachment;
	}

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentMMS = output + "\r\nAnzahl Zeichen: "
				+ getMsgText().length() + "\r\nAnhang: " + getMmsAttachment()
				+ "\r\n";
		logger.info(sentMMS);
	}

}
