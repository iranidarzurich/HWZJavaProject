/**
 * Schreiben Sie eine Klasse mit den lokalen Variablen int zaehler, int nenner,
 * double resultat und boolean ok = true; in der main-Methode. Geben Sie in
 * einer Endlosschleife die Werte f�r den zaehler und nenner �ber die Tastatur
 * ein. Verwenden Sie dazu Ihre TastaturRead-Klasse. Untersuchen Sie in einem
 * try-Ausdruck, ob die Division zaehler / nenner korrekt ausgef�hrt wird. Falls
 * nicht (Division durch 0) muss dieser Fehler in einem catch-Block �ber eine
 * ArithmeticException aufgefangen werden. Achtung! F�hren Sie bei der Division
 * zaehler / nenner kein Casting auf float oder double des Resultates durch,
 * ansonsten wird der Wert Infinity zur�ckgegeben und keine Exception ausgel�st.
 * Die Ausgabe die Ihr Programm auf dem Bildschirm ausgibt soll mit folgendem
 * Wortlaut beginnen: Fehler bei der Division: java.lang.ArithmeticException: /
 * by zero Danach soll das Programm sauber abgebrochen werden.
 * 
 * 
 */
public class kurstag8Aufgabe1 {
	public int zaehler;
	public int nenner;
	public double resultat;
	public boolean ok = true;
	
	public  void Division(int zaehler,int nenner){
		this.resultat=zaehler/nenner;
		System.out.println("Resultat "+resultat);
		
		
	}

}
