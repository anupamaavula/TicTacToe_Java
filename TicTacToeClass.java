

public class TicTacToeClass
{
	// Instance Variables
	private static char[][] board ;
	private static int turn;

	// Constructors
	public TicTacToeClass() 
	{
        board = new char[3][3];
        turn = 0;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }
	
	// Accessor Methods

	public  void displayBoard()
	 {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// public static void playerChoice(char player) {
	// 	Scanner scan = new Scanner(System.in);
	// 	int row, column;

	// 	System.out.print("'" + player + "', choose your location (row, column): ");
	// 	row = scan.nextInt();
	// 	column = scan.nextInt();
	// 	// If the location already taken ,try again.
	// 	if (isValid(row, column) == false) {
	// 		System.out.println("This is not a valid location.Try again");
	// 	} else if (playerAt(row, column) != ' ') {
	// 		System.out.println("This location is already full.Try again");
	// 	}
	// 	board[row][column] = player; // Show the updated game board

	// 	playMove(player, row, column);

	// }

	public  boolean isWinner(char player) 
	{
		// check horizontal
		for (int r = 0; r < 3; r++) {
			if (player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2])
				return true;
		}
		// check vertical
		for (int c = 0; c < 3; c++) {
			if (player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c])
				return true;
		}
		// check diagonal
		if (player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2])
			return true;
		else if (player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0])
			return true;
		return false;
	}

	public  boolean isFull() 
	{
		if (numTurns() != 9)
		  return false;
		else 
		return true;
	}
	public  boolean isValid( int r, int c )
	{
		if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
			return true;
		else
			return false;
	}
	public  char playerAt( int r, int c )
	{
		if ( isValid(r,c) )
			return board[r][c];
		else
			return '@';
	}
	

	public int numTurns()
	{
		
		return turn  ;
		
	}
	public boolean isCat()
	{
		if (!isWinner('X') && isFull() && !isWinner('O'))
            return true;
        return false;	
	}
	
	//Modifiers
	public  void playMove( char p, int r, int c )
	{
		for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (i == r && j == c) {
                    board[r][c] = p;
                    turn++;
	}
	}
 }
}

