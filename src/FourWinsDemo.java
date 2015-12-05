
public class FourWinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWins Spiel = new FourWins(5, 5);
		Spiel.playerA(0, 0);
		Spiel.playerB(1, 0);
		Spiel.playerA(0, 1);
		Spiel.playerB(1, 1);
		Spiel.playerA(0, 2);
		Spiel.playerB(1, 2);
		Spiel.playerA(0, 3);
		System.out.println(Spiel.winner());
		

	}

}
