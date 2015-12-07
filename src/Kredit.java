
public class Kredit {

	double kreditHoehe;
	double kreditNehmer;
	double kreditNehmerMonatlichesEinkommen;
	
	public Kredit(double kreditNehmer, double kreditNehmerMonatlichesEinkommen) {
		this.kreditNehmer = kreditNehmer;
		this.kreditNehmerMonatlichesEinkommen = kreditNehmerMonatlichesEinkommen;
	}
	
	public boolean kreditAnsuchen(double betrag) {
		if ((kreditHoehe+betrag) <= kreditNehmerMonatlichesEinkommen*3) {
			kreditHoehe+=betrag;
			return true;
		}
		return false;
	}
	
	public boolean kreditAbbezahlen(double betrag) {
		if ((kreditHoehe-betrag) >= 0) {
			kreditHoehe-=betrag;
			return true;
		}
		return false;
	}
	

	public double getKreditNehmerMonatlichesEinkommen() {
		return kreditNehmerMonatlichesEinkommen;
	}

	public void setKreditNehmerMonatlichesEinkommen(
			double kreditNehmerMonatlichesEinkommen) {
		this.kreditNehmerMonatlichesEinkommen = kreditNehmerMonatlichesEinkommen;
	}

	public double getKreditHoehe() {
		return kreditHoehe;
	}

	public double getKreditNehmer() {
		return kreditNehmer;
	}	

}
