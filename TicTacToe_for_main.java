/* Taken from : http://www.coderslexicon.com/a-beginner-tic-tac-toe-class-for-java/ */

// Create game and initialize it.
// First player will be 'x'
TicTacToe game = new TicTacToe();

// Player 'x' places a mark in the top right corner row 0, column 2
// These values are based on a zero index array, so you may need to simply take in a row 1 and subtract 1 from it if you want that.
game.placeMark(0,2);

// Lets print the board
game.printBoard();

// Did we have a winner?
if (game.checkForWin()) {
   System.out.println("We have a winner! Congrats!");
   System.exit(0);
}
else if (game.isBoardFull()) {
   System.out.println("Appears we have a draw!");
   System.exit(0);
}

// No winner or draw, switch players to 'o'
game.changePlayer();

// Repeat steps again for placing mark and checking game status...
