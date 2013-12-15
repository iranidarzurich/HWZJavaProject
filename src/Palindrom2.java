/**
 * 
 * @author Chantal Schoch
 * @task
 * 
 */
public class Palindrom2 {
	static String zeichenkette = "HallaH";

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(zeichenkette);
		String s = str.toString();
		System.out.println("String "+s);
		System.out.println("StringBuffer "+zeichenkette);

//		if (zeichenkette == s) {
//			System.out.println("Palindrom");
//		} else {
//			System.out.println("Kein Palindrom");
//		}

	}
}
