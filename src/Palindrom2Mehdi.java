/**
 * 
 * @author Mehdi
 * 
 */
public class Palindrom2Mehdi {
	String zeichenkette = "adida";

	public void Ueberpruefen(String s1, String s2) {
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
		String palindrom = s.toString();
		String wort = z.zeichenkette.toString();

		z.Ueberpruefen(wort, palindrom);
	}
}