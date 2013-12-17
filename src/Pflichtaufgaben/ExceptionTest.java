package Pflichtaufgaben;
/**
 * Folgende Klasse ExceptionTest ist gegeben. Programmieren Sie diese Klasse und
 * versuchen Sie den auftretenden Fehler in einem entsprechenden try-catch-Block
 * aufzufangen. Das Programm darf nicht abgebrochen werden.
 * 
 * 
 * 
 */
public class ExceptionTest {
	int[] arr;

	public ExceptionTest(int n, int schritt) {
		arr = new int[n];
		for (int i = 0; i < n; i++)
			try{arr[i + schritt] = i;}
		catch (Exception e ) {
			System.out.println("Fehlermeldung "+ i);
		}
	}

	public static void main(String[] args) {
		ExceptionTest a = new ExceptionTest(10, 2);
		for (int j = 0; j < 10; j++) {
			System.out.println("Element an Position " + j + " ist gleich "
					+ a.arr[j]);
		}
	}
}