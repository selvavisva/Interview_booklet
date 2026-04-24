package creational.prototype;

public class GameBoard implements Prototype<GameBoard>{
	
	int[][] gameboard;
	
	public GameBoard(int size) {
		gameboard = new int[size][size];
	}
	
	public void move(int i,int j, int player) {
		gameboard[i][j]=player;
	}
	
	public void printBoard() {
		
		for(int i=0;i<gameboard.length;i++) {
			for(int j=0;j<gameboard[i].length;j++) {
				System.out.print(gameboard[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public GameBoard clone() {
		GameBoard copy = new GameBoard(gameboard.length);
		
		for(int i=0;i<gameboard.length;i++) {
			for(int j=0;j<gameboard[i].length;j++) {
				copy.gameboard[i][j]=gameboard[i][j];				
			}
		}		
		return copy;
	}

}
