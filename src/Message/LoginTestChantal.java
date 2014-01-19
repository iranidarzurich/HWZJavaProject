package Message;

import java.util.Scanner;

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

	public static void inputUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie den Username ein: ");
		String eingabeUsername = input.nextLine();
		// System.out.println("Geben Sie das Passwort ein: ");
		// String eingabePassword = input.nextLine();
	}

	public static void main(String[] args) {

		inputUser();
		for(int i=0; i<getUsername()[i].length(); i++){
		username[i].toString();
		}

		StringBuffer result = new StringBuffer();
		for (int i = 0; i < username.length; i++) {
			result.append(username[i]);
			// result.append( optional separator );
		}
		String mynewstring = result.toString();

		if (mynewstring.equals(eingabeUsername)) {
			System.out.println("yeah");
		} else {
			System.out.println("nope");
		}

		// for (int i = 0; i < username.length; i++) {
		/*
		 * if (eingabeUsername.equals(getUsername()[0]) &&
		 * eingabePassword.equals(getPassword()[0])) {
		 * System.out.println("hat geklappt"); } else {
		 * System.out.println("hat nicht geklappt"); }
		 */
	}
}
