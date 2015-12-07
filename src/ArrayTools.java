
public class ArrayTools {

	public static double avg(double[] data) {
		int summe = 0;
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			summe+=data[i];
			counter++;	
		}
		return summe/counter;
	}
	
	//Wie kann ich in der Main diesen Array ausgeben?!
	public static double[] calcTotal(double[] preis, int[] anzahl) {
		double[] summe = new double[preis.length];
		for (int i = 0; i < preis.length; i++) {
			summe[i]=preis[i]*anzahl[i];
			System.out.println(summe);
		}
		return summe;
	}
	
	public static int countIf(int[] data, int item) {
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i]==item) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int intersectCount(int[] data1, int[] data2) {
		int counter = 0;
		for (int i = 0; i < data1.length; i++){
			for (int j = 0; j < data2.length; j++) {
				if (data1[i] == data2[j]) {
					counter++;
				}
			}
		}
		return counter; // Liefern Sie hier den geforderten Rückgabewert zurück
	}

	
	
}
