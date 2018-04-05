// VIEW - Handles I/O only
import java.util.*;

public class IO {
	private Scanner s;
	
	public IO() {
		s = new Scanner(System.in);
	}
	
// Displays String passed in representing current state of the board
	public void printBoard(String str) {
		System.out.println("\nCurrent board: \n" + str);
		System.out.println();
	}

// input - get a players move	
	public int getMove(char player) {
		System.out.print("Player " + player + ", enter column (0-6): ");
		return Integer.parseInt(s.nextLine());
	}
	
// Displays the result of a move (Bad move, winner, tie, etc.)
	public void printResults(String msg) {
		System.out.println(msg);
	}

} // end IO class