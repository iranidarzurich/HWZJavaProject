/**
 * 
 * @author Mehdi
 * 
 */
public class Palindrom2Mehdi {
	String zeichenkette = "adida";

	public void Ueberprüfen(String s1, String s2) {
		if (s2.equals(s1)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Kein Palindrom");
		}

	}

	public static void main(String[] args) {
		Palindrom2Mehdi z = new Palindrom2Mehdi();
		StringBuffer str = new StringBuffer(z.zeichenkette);
		StringBuffer s = str.reverse();
		String wort = s.toString();
		String palondrom = z.zeichenkette.toString();

		z.Ueberprüfen(wort, palondrom);
	}
}