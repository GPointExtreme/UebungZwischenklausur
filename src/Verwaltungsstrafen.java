
public class Verwaltungsstrafen {
	
	private String vorname;
	private String nachname;
	private String kennzeichen;
	static int strafnummer = 1;
	private double strafe;
	private byte anzahl;
	private int vergehen = 0;
	
	public Verwaltungsstrafen(String vorname, String nachname, String kennzeichen) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		this.vergehen = strafnummer++;
	}
	
	public void strafe(int geschwindigkeitsueberschreitung) {
		if (geschwindigkeitsueberschreitung > 0 && geschwindigkeitsueberschreitung <= 20) {
			strafe+=30;
			anzahl++;
		}
		else if (geschwindigkeitsueberschreitung > 21 && geschwindigkeitsueberschreitung <= 30) {
			strafe+=50;
			anzahl++;
		}
		else if (geschwindigkeitsueberschreitung > 31 && geschwindigkeitsueberschreitung <= 50) {
			strafe+=100;
			anzahl++;
		}
		else if (geschwindigkeitsueberschreitung > 51 && geschwindigkeitsueberschreitung <= 100) {
			strafe+=500;
			anzahl++;
		}
		else {
			strafe+=1500;
			anzahl++;
		}
	}
	
	public void verbandspaket() {
			anzahl++;
			strafe+=25;	
	}
	
	public void alkohol (double alkoholspiegel) {
		if (alkoholspiegel < 0.5) {
			System.out.println("Alkoholspiegel unter 0.5");
		}
		else if (alkoholspiegel <= 1.0) {
			anzahl++;
			strafe+=100;
		}
		else if (alkoholspiegel <= 2.0) {
			anzahl++;
			strafe+=400;
		}
		else if (alkoholspiegel <= 3.0) {
			anzahl++;
			strafe+=1000;
		}
		else {
			anzahl++;
			strafe+=5000;
		}
		
	}
	
	public void sonstiges(double wert) {
		anzahl++;
		strafe+=wert;
	}
	
	public void getStrafe() {
		if (anzahl > 0 && anzahl <= 1) {
			strafe=strafe*0.7;
			System.out.println("Strafe: " + strafe + "Euro");
		}
		else if (anzahl > 1 && anzahl <= 2) {
			strafe=strafe*0.8;
			System.out.println("Strafe: " + strafe + "Euro");
		}
		else if (anzahl > 2 && anzahl <= 3) {
			strafe=strafe*0.9;
			System.out.println("Strafe: " + strafe + "Euro");
		}
		else {
			System.out.println("Keine Verringerung weil mehr als 4 Vergehen vorliegen!");
		}
	}
	
	//Getter Methoden
	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public int getStrafnummer() {
		return vergehen;
	}

	public byte getAnzahl() {
		return anzahl;
	}

}
