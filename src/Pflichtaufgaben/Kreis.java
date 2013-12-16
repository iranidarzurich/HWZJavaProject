package Pflichtaufgaben;

public class Kreis {
	private double r = 0;

	public Kreis() {
		r = 1.0;
	}

	public void setRadius(double newR) {
		r = newR;
	}

	public double getRadius() {
		return r;
	}

	public double getFlaeche() {
		double f;
		f = Math.PI * (r * r);
		f = Math.round(f*100)/100.0;
		return f;
	}

	public double getUmfang() {
		double u;
		u = 2 * Math.PI * r;
		u = Math.round(u*100)/100.0;
		return u;
	}

}

/*
 * Schreiben Sie eine Klasse Kreis, die folgende Elemente enthalten soll: • Eine
 * * Instanzvariable r für den Radius, vom Datentyp double • Einen *
 * Default-Konstruktor, in dem die Instanzvariable r = 1.0 gesetzt wird • Eine *
 * Methode setRadius mit dem formalen Parameter double r, in der Sie der *
 * Instanzvariablen r den Wert des formalen Parameters übergebenen können • Eine
 * * Methode getFlaeche (ohne formale Parameter), in der Sie die Fläche eines *
 * Kreises ( f = PI * r2) berechnen und zurückgeben können • Eine Methode *
 * getUmfang, in der Sie den Umfang eines Kreises ( u = 2 * PI * r ) berechnen *
 * und zurückgeben können
 */