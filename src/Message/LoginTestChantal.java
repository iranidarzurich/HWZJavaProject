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

	/*
	 * public static void inputUser() { Scanner input = new Scanner(System.in);
	 * System.out.println("Geben Sie den Username ein: "); String
	 * eingabeUsername = input.nextLine(); System.out.println(eingabeUsername);
	 * System.out.println("Geben Sie das Passwort ein: "); String
	 * eingabePassword = input.nextLine(); }
	 */

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

			else{System.out.println("Idiot");
			break;}
		} while (x < 10);
	}

	public static void main(String[] args) {
		login();

	}
}
