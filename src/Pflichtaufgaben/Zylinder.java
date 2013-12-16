package Pflichtaufgaben;

import Kreis;

	public class Zylinder extends Kreis {
		double h = 0;

		public Zylinder() {
			super();
			h = 1.0;
		}

		public void setHoehe(double newH) {
			h = newH;
		}
		
		public double getHoehe(){
			return h;
		}

		public double getFlaeche() {
			double fl;
			fl = Math.PI * (r * r);
			fl = Math.round(fl*100)/100.0;
			return fl;
		}
	}

	/* 
	* Schreiben Sie eine von der Klasse Kreis abgeleitete Klasse Zylinder, die
	* folgende Elemente enthalten soll: 
	* � Eine Instanzvariable h f�r die H�he, vom  * Datentyp double 
	* � Einen Default-Konstruktor, in dem die Instanzvariable h =  * 1.0 gesetzt wird und zus�tzlich 
	* der Default-Konstruktor der Basisklasse * aufgerufen wird 
	* � Eine Methode setHoehe(), mit dem formalen Parameter double *  * h, in der Sie der Instanzvariablen h den 
	* Wert des formalen Parameters  * �bergebenen k�nnen 
	* � Eine Methode getFlaeche (ohne formale Parameter) mit den
	* lokalen Variablen fl und umf des Datentyps double. In dieser Methode soll der
	* Umfang und die Fl�che durch Aufruf der entsprechenden Methoden der
	* Basisklasse berechnet werden. Der R�ckgabewert soll das Resultat (2 * fl + h * * umf) an den aufrufenden Programmteil zur�ckgeben.
	*/
}
