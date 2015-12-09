import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class FourWins {
	
	private int sizeX;
	private int sizeY;
	char[][] charArray = new char[sizeX][sizeY];
	
	public FourWins (int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		charArray = new char[sizeX][sizeY];
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray.length; j++) {
				charArray[i][j] = ' ';
			}
		}
	}
	
	public boolean playerA(int x) {
		int y = ColumY(x);
		if(charArray[x][y] == ' ') {
			charArray[x][y] = 'A';
			return true;
		}
		else if (y == -1){
			System.out.println("Reihe ist voll!");
			return false;
		}
		else {
			return false;
		}
	}
	
	public boolean playerB(int x) {
		int y = ColumY(x);
		if(charArray[x][y] == ' ') {
			charArray[x][y] = 'B';
			return true;
		}
		else if (y == -1){
			System.out.println("Reihe ist voll!");
			return false;
		}
		else {
			return false;
		}
	}
	
	//A oder B wir nur bei X eingeworfen und Methode soll Y retour geben.
	private int ColumY(int x) {
		
		for(int i = sizeY-1; i >= 0; i--) {
			if(charArray[x][i] != ' ') {
				continue;
			}
			else {
				return i;
			}	
		}
		return -1; 
	}
	
	private char fourInRow() {
		int A = 0;
		int B = 0;
		char result = '-';
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray.length; j++) {
				if(charArray[i][j] == 'A') {
					A++;
					B=0;
					if(A==4) {
						return result = 'A';
					}
				}
				else if(charArray[i][j] == 'B') {
					B++;
					A=0;
					if(B==4) {
						return result = 'B';
					}
				}
				else {
					A=0;
					B=0;
				}
			}
			
		}
		return result;
	}
	
	private char fourInColumn() {
		int A = 0;
		int B = 0;
		char result = '-';
		for(int j = 0; j < charArray.length; j++) {
			for(int i = 0; i < charArray.length; i++) {
				if(charArray[i][j] == 'A') {
					A++;
					B=0;
					if(A==4) {
						return result = 'A';
					}
				}
				else if(charArray[i][j] == 'B') {
					B++;
					A=0;
					if(B==4) {
						return result = 'B';
					}
				}
				else {
					A=0;
					B=0;
				}
			}
			
		}
		return result;	
	}
	
	public char winner() {
		char result = '-';
		if(fourInRow() == 'A' || fourInColumn() == 'A') {
			return result = 'A';
		}
		if(fourInRow() == 'B' || fourInColumn() == 'B') {
			return result = 'B';
		}
		return result;
	}

	public int getSizeX() {
		return sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

}
