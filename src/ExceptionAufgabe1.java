import java.util.Scanner;

public class ExceptionAufgabe1 {

	/**
	 * 
	 * @author Chantal
	 * @task Schreiben Sie eine Klasse mit den lokalen Variablen int zaehler,
	 *       int nenner, double resultat und boolean ok = true; in der
	 *       main-Methode. Geben Sie in einer Endlosschleife die Werte für den
	 *       zaehler und nenner über die Tastatur ein. Verwenden Sie dazu Ihre
	 *       TastaturRead-Klasse. Untersuchen Sie in einem try-Ausdruck, ob die
	 *       Division zaehler / nenner korrekt ausgeführt wird. Falls nicht
	 *       (Division durch 0) muss dieser Fehler in einem catch-Block über
	 *       eine ArithmeticException aufgefangen werden. Achtung! Führen Sie
	 *       bei der Division zaehler / nenner kein Casting auf float oder
	 *       double des Resultates durch, ansonsten wird der Wert Infinity
	 *       zurückgegeben und keine Exception ausgelöst. Die Ausgabe die Ihr
	 *       Programm auf dem Bildschirm ausgibt soll mit folgendem Wortlaut
	 *       beginnen: Fehler bei der Division: java.lang.ArithmeticException: /
	 *       by zero Danach soll das Programm sauber abgebrochen werden.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double resultat;
		boolean ok = true;
		while (ok) {
			System.out.println("Geben Sie einen Zaehler ein: ");
			int newZaehler = input.nextInt();
			int zaehler = newZaehler;

			System.out.println("Geben Sie einen Nenner ein: ");
			int newNenner = input.nextInt();
			int nenner = newNenner;

			try {
				resultat = zaehler / nenner;
				System.out.println("Resultat: " + resultat);

			} catch (Exception e) {
				System.out.println("Fehler bei der Dividsion: " + e);
			}
		}
	}

}
