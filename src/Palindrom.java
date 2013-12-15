/**
 * 
 * @author Chantal Schoch
 * @task palindrom Klassenmedthodenanalyse
 * 
 */
public class Palindrom {
	String zeichenkette = "adida";

	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		StringBuffer str = new StringBuffer(p.zeichenkette);
		StringBuffer s = str.reverse();
		String s1 = s.toString();
		String s2 = p.zeichenkette.toString();

		if (s2.equals(s1)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Kein Palindrom");
		}

	}
}
