
public class VerwaltungsstrafenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verwaltungsstrafen MaxMustermann = new Verwaltungsstrafen("Max", "Mustermann", "GU-567ME");
		Verwaltungsstrafen SusiSonstiges = new Verwaltungsstrafen("Susi", "Sonstiges", "G-765EM");
		
		System.out.println("Max" + MaxMustermann.getStrafnummer());
		MaxMustermann.strafe(100);
		System.out.println(MaxMustermann.getAnzahl());
		MaxMustermann.getStrafe();
		
		System.out.println("Susi" + SusiSonstiges.getStrafnummer());
		SusiSonstiges.verbandspaket();
		SusiSonstiges.strafe(50);
		System.out.println(SusiSonstiges.getAnzahl());
		SusiSonstiges.getStrafe();
		
	}

}
