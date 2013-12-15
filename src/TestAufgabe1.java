import java.util.*;

/**
 * Schreiben Sie eine Klasse mit den lokalen Variablen int zaehler, int nenner,
 * double resultat und boolean ok = true; in der main-Methode. Geben Sie in
 * einer Endlosschleife die Werte für den zaehler und nenner über die Tastatur
 * ein. Verwenden Sie dazu Ihre TastaturRead-Klasse. Untersuchen Sie in einem
 * try-Ausdruck, ob die Division zaehler / nenner korrekt ausgeführt wird. Falls
 * nicht (Division durch 0) muss dieser Fehler in einem catch-Block über eine
 * ArithmeticException aufgefangen werden. Achtung! Führen Sie bei der Division
 * zaehler / nenner kein Casting auf float oder double des Resultates durch,
 * ansonsten wird der Wert Infinity zurückgegeben und keine Exception ausgelöst.
 * Die Ausgabe die Ihr Programm auf dem Bildschirm ausgibt soll mit folgendem
 * Wortlaut beginnen: Fehler bei der Division: java.lang.ArithmeticException: /
 * by zero Danach soll das Programm sauber abgebrochen werden.
 * 
 * 
 */
public class TestAufgabe1 {
	public static void main(String[] args) {
		int x = 1;
		do {
			try {
				kurstag8Aufgabe1 a = new kurstag8Aufgabe1();
				Scanner input = new Scanner(System.in);
				System.out.println("Gib den Zähler ein");
				a.zaehler = input.nextInt();
				System.out.println("Gib den Nenner ein");
				a.nenner = input.nextInt();
				a.Division(a.zaehler, a.nenner);
				x = 2;
			} catch (Exception e) {
				System.out.println("das ist nicht zulässig");

			}
		} while (x == 1);
	}
}
