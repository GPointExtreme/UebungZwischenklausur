
public class KreditDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kredit Max = new Kredit(1, 2000);
		
		System.out.println(Max.kreditAnsuchen(6000));
		System.out.println(Max.getKreditHoehe());
		System.out.println(Max.kreditAbbezahlen(6000));
		System.out.println(Max.getKreditHoehe());

	}

}
