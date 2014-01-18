package Message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print extends Message {

	// Create Log at console
	@Override
	public void createLog() {
		super.createLog();
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat(
		 * "dd.MM.yyyy 'at' HH:mm:ss "); Date currentTime = new Date();
		 * 
		 * System.out.println("Zeit und Datum : " +
		 * formatter.format(currentTime) + "\nText wird ausgedruckt" +
		 * "\nInhalt: " + getMsgText());
		 */
	}

}
