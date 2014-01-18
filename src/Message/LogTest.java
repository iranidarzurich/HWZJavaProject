package Message;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogTest {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;

		try {
			// logfile size limit 1MB
			int limit = 1000000;

			// configure the logger with handler and formatter
			fh = new FileHandler("C:/temp/MyLogFile.log", limit, 1, true);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// log messages
			logger.info("My first log");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		logger.info("Test Log blabla mit syso Part");
		logger.info("second part");

	}

}