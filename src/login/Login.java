package login;

import javax.swing.JOptionPane;

public class Login {
	private String userName = "multichannel";
	private String password = "bwia12";

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

	// Control login input
	public boolean compare() {
		Login login = new Login();
		if (login.getUserName().equals(this.userName)
				&& login.getPassword().equals(this.password)) {
			JOptionPane.showMessageDialog(null, "Sie sind eingeloggt", "Login",
					JOptionPane.INFORMATION_MESSAGE);
			return true;
		} else {
			JOptionPane
					.showMessageDialog(
							null,
							"Falscher Username oder Passwort\nBitte nochmals Probieren",
							"Login", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
