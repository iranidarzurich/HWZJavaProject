import java.util.Scanner;

/**
 * 
 * 
 * Augfabe 2 Erweitern Sie die Aufgabe 1 um folgende Elemente: Schreiben Sie für
 * die Division eine eigene statische Methode division() innerhalb der Klasse.
 * Die Methode division() soll beim Auftreten einer ArithmeticException die
 * Exception an das aufrufende Programmteil zur Behandlung zurückwerfen. Die
 * Ausgabe die Ihr Programm auf dem Bildschirm ausgibt soll mit folgendem
 * Wortlaut beginnen: Fehler bei der Division: java.lang.ArithmeticException:
 * Fehler: Der Nenner hat den Wert 0! Danach soll das Programm sauber
 * abgebrochen werden.
 * 
 */
public class Aufgabe2 {

	public static void main(String[] args) {
		kurstag8Aufgabe1 a = new kurstag8Aufgabe1();
		Scanner input = new Scanner(System.in);
		System.out.println("Gib den Zähler ein");
		a.zaehler = input.nextInt();
		System.out.println("Gib den Nenner ein");
		a.nenner = input.nextInt();

		try {
			a.Division(a.zaehler, a.nenner);
		} catch (ArithmeticException ae) {
			System.out
					.println("Fehler bei der Division: java.lang.ArithmeticException:Fehler: Der Nenner hat den Wert 0");

		}

	}

}
