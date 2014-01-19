package Message;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public abstract class Message {

	private String msgText;
	private String msgRecipient;
	// private String msgRecipien;
	private String msgSender;
	public String output;

	Scanner scan = new Scanner(System.in);
	Logger logger = Logger.getLogger("Log");
	FileHandler fh;

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getMsgText() {
		return msgText;
	}

	// create logfile
	public void log() {
		File log = new File("Logfiles");
		log.mkdir();
		File newLogfile = new File("Logfiles/Logfile.log");

		try {
			// logfile size limit 1MB
			// int limit = 1000000;
			int limit = 1000000;

			// configure logger with handler and formatter
			fh = new FileHandler("Logfiles/Logfile.log", limit, 1, true);
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

	public Message() {
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

}
