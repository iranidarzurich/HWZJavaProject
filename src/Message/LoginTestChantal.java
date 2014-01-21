package Message;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoginTestChantal {

	private static String[] username = { "Chanty", "Mehdi", "Damian" };
	private static String[] password = { "c123", "m123", "d123" };
	int i = 0;
	private static String eingabeUsername;
	private static String eingabePassword;

	public static String[] getUsername() {
		return username;
	}

	public static String[] getPassword() {
		return password;
	}

	public static String getnewUsername() {
		String inputUsername = eingabeUsername;
		return inputUsername;
	}

	public static void login() {

		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie den Username ein: ");
		eingabeUsername = input.nextLine();
		System.out.println("Geben Sie das Passwort ein: ");
		eingabePassword = input.nextLine();

		int x = 0;
		int y = 0;
		do {
			if (eingabeUsername.equals(username[x])
					&& eingabePassword.equals(password[y])) {
				System.out.println("toll");
				break;
			}

			else {
				System.out.println("Idiot");
				break;
			}
		} while (x < 10);
	}

	/*
	 * public static void inputUser() { Scanner input = new Scanner(System.in);
	 * System.out.println("Geben Sie den Username ein: "); String
	 * eingabeUsername = input.nextLine(); System.out.println(eingabeUsername);
	 * System.out.println("Geben Sie das Passwort ein: "); String
	 * eingabePassword = input.nextLine(); }
	 */

	protected static String output;
	static boolean checkStatus = false;
	private static FileHandler fh;
	static Logger logger = Logger.getLogger("Log");

	// create logfile
	public static void logchanty() {
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
		logger.info(output);
		// fh.close();
	}

	// log output
	public static void createLog() {
		if (checkStatus == true) {
			output = "\r\nLogin erfolgreich " + "\r\nHallo "
					+ eingabeUsername +"\r\n";

		} else {
			output = "\r\nLogin von " +eingabeUsername +" nicht erfolgreich! Bitte nochmals versuchen." +"\r\n";
		}
		logchanty();

		// checkStatus = true;
		// checkStatus = false;

	}

	public static void main(String[] args) {
		// login();
		eingabeUsername = "Chanty";
		checkStatus = true;
	createLog();

	}

}





protected String output = null;
private FileHandler fh;
private boolean checkStatus = false;

Logger logger = Logger.getLogger("Log");

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
	if (checkStatus == true) {
		output = "\r\nLogin erfolgreich " + "\r\nHallo " + userName
				+ "\r\n";

	} else {
		output = "\r\nLogin von " + userName
				+ " nicht erfolgreich! Bitte nochmals versuchen." + "\r\n";
	}
	log();

}

checkStatus = true;
checkStatus = false;

