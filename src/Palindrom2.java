/**
 * 
 * @author Chantal Schoch
 * @task palindrom Instanzmedthodenanalyse
 * 
 */
public class Palindrom2 {
	String zeichenkette = "adida";

	public static void main(String[] args) {
		Palindrom2 p = new Palindrom2();
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
