package business_classes;

public class SMS extends Message {

	public SMS() {
	}

	// Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentSMS = output + "\r\nAnzahl Zeichen: "
				+ getMsgText().length() + "\r\n";
		logger.info(sentSMS);
	}
}
