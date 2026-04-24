package creational.prototype;

public class PrototypeDesignTest {

	    public static void main(String[] args) {

	        GameBoard original = new GameBoard(3);

	        original.move(0,0,1);
	        original.move(1,1,2);

	        System.out.println("Original Board:");
	        original.printBoard();

			
			  GameBoard clonedBoard = original.clone();
			  
			  clonedBoard.move(0,1,1);
			  
			  System.out.println("Cloned Board After Move:"); clonedBoard.printBoard();
			  
			  System.out.println("Original Board Again:"); original.printBoard();
			 
	}
}