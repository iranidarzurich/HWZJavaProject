package Message;

public class MMS extends Message {
	private String mmsAnhang;

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentMMS = output + "\nAnzahl Zeichen: " + getMsgText().length();
		logger.info(sentMMS);
		// + "\nAnhang: " + getMsAnhang()
	}

	public MMS() {
		super();
		this.setMsgType("MMS");
	}

	public String getMmsAnhang() {
		return mmsAnhang;
	}

	public void setMmsAnhang(String mmsAnhang) {
		this.mmsAnhang = mmsAnhang;
	}

}
