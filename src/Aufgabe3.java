import java.util.Scanner;

/**
 * Erweitern Sie die Aufgabe 2 um eine eigene Exception-Klasse
 * MyIsNullException, die die ArithmeticException ersetzen soll. Das Werfen der
 * Exception soll wiederum in der Methode division() ausgeführt werden. Die
 * Ausgabe soll mit folgendem Wortlaut beginnen:! Danach soll das
 * Programm sauber abgebrochen werden.
 * 
 * 
 * 
 */
public class Aufgabe3 {

	public static void main(String[] args) throws MyIsNullException {
		Aufgabe3Base a = new Aufgabe3Base();
		Scanner input = new Scanner(System.in);
		System.out.println("Gib den Zähler ein");
		a.zaehler = input.nextInt();
		System.out.println("Gib den Nenner ein");
		a.nenner = input.nextInt();
		
		try { 
			a.division(a.zaehler, a.nenner);}
			catch (MyIsNullException s) {
				s.printStackTrace();
			}
		}
	}


