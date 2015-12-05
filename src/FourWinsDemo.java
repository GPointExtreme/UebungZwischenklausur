
public class FourWinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWins Spiel = new FourWins(5, 5);
		Spiel.playerA(0, 0);
		System.out.println(Spiel.winner());
		Spiel.playerB(1, 0);
		System.out.println(Spiel.winner());
		Spiel.playerA(0, 1);
		System.out.println(Spiel.winner());
		Spiel.playerB(1, 1);
		System.out.println(Spiel.winner());
		Spiel.playerA(0, 2);
		System.out.println(Spiel.winner());
		Spiel.playerB(1, 2);
		System.out.println(Spiel.winner());
		Spiel.playerA(0, 3);
		System.out.println(Spiel.winner());
		

	}

}
