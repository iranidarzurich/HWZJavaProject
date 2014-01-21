package Message;

import javax.swing.JOptionPane;

public class Login extends Message {
	private String userName = "mehdi";
	private String password = "123";
	// private boolean checkStatus = false;
	private String outputLog = null;

	// String[] userName2 = {"mehdi", "chantal"};
	// String[] password2 = {"123", "345"};

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

	@Override
	public void createLog() {
		super.createLog();
		if (compare() == true) {
			outputLog = "\r\nLogin erfolgreich " + "\r\nHallo " + userName
					+ "\r\n";
		} else {
			outputLog = "\r\nLogin von " + userName
					+ " nicht erfolgreich! Bitte nochmals versuchen." + "\r\n";
		}
		logger.info(outputLog);
	}

}
