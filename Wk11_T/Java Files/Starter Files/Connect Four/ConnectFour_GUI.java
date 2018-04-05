// CONTROLLER - handles communication between model-view
public class ConnectFour_GUI {
	public static void main(String[] args) {
		Board b = new Board();
// Change SINGLE line		
		IO_GUI view = new IO_GUI();
		
		// display the initial state of the board
		// call toString method of Board class and pass
		// String to printBoard method of view (IO) class
// Comment out, since printing board is part of getMove method
		//view.printBoard(b.toString());
		
		char piece = 'X';
		
		//loop through game play (while board is NOT full)
		while (b.full() == false) {
			// getMove returns integer representing the column
// in addition to the piece, pass string representation of the board
			int move = view.getMove(b.toString(), piece);

			// move method places piece in board if move is valid
			// (returns true); returns false is move is invalid
			boolean result = b.move(move, piece);
			
			if (result == false) {
				view.printResults("Bad move, try again.");
			} // end if
			else { 
				// display current state of the board
// Comment out, since printing board is part of getMove method
				//view.printBoard(b.toString());

				// test if a winner	
				result = b.winner(piece); 
				if (result == true) { // Winner!
					view.printResults(piece + " wins!");
					return; // Where does this return to?
				} // end if

				//switch pieces
				if (piece == 'X') 
					piece = 'O';
				else 
					piece = 'X';
			} // end else
		} // end while
		
		view.printResults("Tie game.");
		
// add for GUI
		System.exit(0);
		
	} // end main
} // end class