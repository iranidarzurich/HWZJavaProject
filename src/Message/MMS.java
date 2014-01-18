package Message;

public class MMS extends Message {

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

}
