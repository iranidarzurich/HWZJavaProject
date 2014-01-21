package login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Login {
	private String userName ;
	private String password ;
	private String s;
	private String p;

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
		
	    
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("adminlist.ini"));
			this.s = properties.getProperty("admin");
			 this.p = properties.getProperty("password");
			
//			 List<String> list = new List<String>;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (login.getUserName().equals(this.s)
				&& login.getPassword().equals(this.p)) {
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
