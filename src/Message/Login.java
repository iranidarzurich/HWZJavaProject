package Message;

import javax.swing.JOptionPane;

public class Login {
	private String userName = "mehdi";
	private String password = "123";
//	String[] userName2 = {"mehdi", "chantal"};
//	String[] password2 = {"123", "345"};

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void compare() {
		Login login = new Login();
		if (login.getUserName().equals(this.userName)
				|| login.getPassword().endsWith(this.password)) {

			JOptionPane.showMessageDialog(null, "Sie sind eingeloggt", "Login",
					JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null,
					"Falsche Usename oder Passwort\nBitte Nochmal probieren", "Login",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
