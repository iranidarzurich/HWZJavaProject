package Message;

public class SMS extends Message {

	//Create log to console and file
	@Override
	public void createLog() {
		super.createLog();
		String sentSMS = output + "\nAnzahl Zeichen: " + getMsgText().length();
		logger.info(sentSMS);
	}
}
