package Pflichtaufgaben;

import Kreis;
import Zylinder;

public class KreisTest {
	public static void main(String[] args) {
		Kreis k1 = new Kreis();
		Zylinder z1 = new Zylinder();
		k1.setRadius(2.0);
		System.out.println("Kreis: \t\tRadius = " + k1.getRadius()
				+ "\tFl�che= " + k1.getFlaeche());
		z1.setRadius(1.0);
		z1.setHoehe(1.0);
		System.out
				.println("Zylinder: \tRadius = " + z1.getRadius()
						+ "\tHoehe = " + z1.getHoehe() + "\tFl�che= "
						+ z1.getFlaeche());
	}
}

/*
 * Schreiben Sie eine Klasse Test, in der Sie die notwendigen Objekte erzeugen,
 * damit Sie am Schluss folgende Ausgaben auf den Bildschirm erhalten:
 * 
 * Kreis: - Radius = 2.0 - Flaeche = 12.56
 * 
 * Zylinder: - Radius = 3.0 - Hoehe = 4.0 - Flaeche = 131.88
 * 
 * Die Konstanten f�r den Radius und der H�he, die Sie f�r diese Ausgabe
 * ben�tigen, k�nnen direkt in die Methodenaufrufe geschrieben werden.
 */
