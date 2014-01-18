package Message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print extends Message {

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\nNachricht erfolgreich versendet "
				+ "\nDrucker : " + getMsgAbsender();
		log();
		logger.info(sentPrint);

	}

}
