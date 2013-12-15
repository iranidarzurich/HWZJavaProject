/**
 * 
 * @author Chantal Schoch
 * @task palindrom Klassenmedthodenanalyse
 * 
 */
public class Palindrom {

	static String zeichenkette = "adida";

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(zeichenkette);
		StringBuffer s = str.reverse();
		String s1 = s.toString();
		String s2 = zeichenkette.toString();

		if (s2.equals(s1)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Kein Palindrom");
		}

	}
}