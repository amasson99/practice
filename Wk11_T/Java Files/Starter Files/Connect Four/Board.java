// MODEL - holds Board data & calculations
public class Board {
	private char[][] board;
	
// Constructor - 6 Rows x 7 Columns
	public Board() {

		board = new char[6][7];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				board[i][j] = '_';
			} // inner for
		} // outer for
	} // end constructor
	
	//take a turn - 'player' = 'X' or 'O'
	public boolean move(int col, char player) {
	// invalid column number
		if (col < 0 || col > 6) return false;

	// if top row is not 'empty' (i.e. no '_')
		if (board[0][col] != '_') return false;

	// move to empty spot in column
		int row = 5;
		while (board[row][col] != '_') {
			row--;
		}
	
	// place an 'X' or 'O' at that position	
		board[row][col] = player;
		return true;
	} // end move
	
	//determine if the board is full
	public boolean full() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] == '_') return false;
			} // inner for
		} // outer for
		
		return true;
	} // end full
	
	// returns current board as a string
	public String toString() {
		String temp = "";
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				temp += board[i][j] + " ";
			}
			temp += "\n";
		}
		
		return temp;
	} // end boardString

	//determine if there are four in a row (winner)
	public boolean winner(char piece) {
	
		//four in a **row**
		for (int i = 0; i < 6; i++) {
			//check all possible starting positions
			for (int j = 0; j < 4; j++) {
				if (board[i][j] == board[i][j+1] &&
					board[i][j] == board[i][j+2] &&
					board[i][j] == board[i][j+3] &&
					board[i][j] == piece) return true;
			} // inner for
		} // outer for
		
		//four in a **column**
		for (int col = 0; col < 7; col++) {
			//all possible starting positions
			for (int row = 0; row < 3; row++) {
				if (board[row][col] == board[row+1][col] &&
					board[row][col] == board[row+2][col] &&
					board[row][col] == board[row+3][col] &&
					board[row][col] == piece) return true;
			} // inner for
		} // outer for
		
		//four in a '\' diagonal
		//loop through possible starting positions
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] == board[i+1][j+1] &&
					board[i][j] == board[i+2][j+2] &&
					board[i][j] == board[i+3][j+3] &&
					board[i][j] == piece) return true;
			} // inner for
		} // outer for
		
		//four in a '/' diagonal
		//loop through possible starting positions
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j < 7; j++) {
				if (board[i][j] == board[i+1][j-1] &&
					board[i][j] == board[i+2][j-2] &&
					board[i][j] == board[i+3][j-3] &&
					board[i][j] == piece) return true;
			} // inner for
		} // outer for
		
		return false;
	} // end winner
} // end Board class