public class Aufgabe3Base {
	public int zaehler;
	public int nenner;
	public double resultat;
	public boolean ok = true;

	public void division(int zaehler, int nenner) throws MyIsNullException {
		if (nenner == 0){
			throw new MyIsNullException("Fehler bei der Division: * java.lang.ArithmeticException: Fehler: Der Nenner ist 0");
		}else{
			resultat = zaehler / nenner;
		}

	}

}
