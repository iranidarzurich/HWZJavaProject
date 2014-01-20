package Message;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public abstract class Message {
	// Variable
	private String msgText;
	private String msgRecipient;
	private String msgSender;
	protected String output;
	private FileHandler fh;

	Logger logger = Logger.getLogger("Log");

	public Message() {
	}

	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getMsgSender() {
		return msgSender;
	}

	public void setMsgSender(String msgSender) {
		this.msgSender = msgSender;
	}

	public String getMsgRecipient() {
		return msgRecipient;
	}

	public void setMsgRecipient(String msgRecipient) {
		this.msgRecipient = msgRecipient;
	}

	// create logfile
	public void log() {
		try {
			// logfile size limit 1MB
			int limit = 1000000;

			// configure logger with handler and formatter
			fh = new FileHandler("%t/Logfile.log", limit, 1, true);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// log output
	public void createLog() {
		this.output = "\r\nNachricht erfolgreich versendet "
				+ "\r\nAbsender : " + getMsgSender() + "\r\nEmpfaenger: "
				+ getMsgRecipient();
		log();
	}
}
