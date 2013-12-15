
public class MainKlasse {
	public class TestAufgabe5 {
		public static void main(String[] args) {
			Person mensch1 = new Arzt();
			Arzt arzt1 =(Arzt)mensch1;
			Person mensch2 = new Patient();
			Patient patient1 = (Patient)mensch2; 
			arzt1.setFachgebiet("allgemein");
			System.out.println("Fachgebiet "+ arzt1.getFachgebiet());
			patient1.setDiagnose("schwer krank");
			System.out.println("Diagnose des Patienten "+patient1.getDiagnose());
			patient1.setZimmernummer(25);
			System.out.println("Zimmer nummer des Patienten "+patient1.getZimmernummer());
		}
		

	}

}
