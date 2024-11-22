import java.util.Scanner;
 class Main {
    private static String [][] gameBoard = new String[3][3];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe");

        String playerOne = "X";
        String playerTwo = "O";

        clearBoard(gameBoard);

        int x = InputHelper.getRangedInt(scan, "Enter your move row [1-3]", 1, 3);

        int y = InputHelper.getRangedInt(scan, "Enter your move column [1-3]", 1, 3);

        isValidMove(x, y);

    }

     private static boolean isValidMove(int row, int col) {
        boolean valid = false;
        if (gameBoard[row][col].equalsIgnoreCase("-")) {
            valid = true;
        }
        else {
            valid = false;
        }
        return valid;
    }


     private static void clearBoard(String board[][]) {
        for(int r = 0; r < gameBoard.length; r++) {
            for(int c = 0; c < gameBoard[0].length; c++) {
                board[r][c] = " - ";
            }
        }
    }

 private static void displayBoard(String board[][]) {
     for(int r = 0; r < gameBoard.length; r++) {
         for(int c = 0; c < gameBoard[0].length; c++) {
             System.out.print(board[r][c]);
         }
         System.out.println();
     }
 }

 private static boolean isWin(String player) {

 }

 private static boolean isColWin(String player) {
    boolean matches = true;
        for(int c = 0; c < gameBoard[0].length; c++) {
            matches = true;
                for(int r = 0; r < gameBoard.length; c++) {
                    if(!player.equals(gameBoard[r][c])) {
                        matches = false;
                        break;
                    }
                }
               if (matches) {
                   break;
               }
        }
        return matches;
 }

 private static boolean isRowWin(String player) {
     boolean matches = true;
     for(int r = 0; r < gameBoard[0].length; r++) {
         matches = true;
         for(int c = 0; c < gameBoard.length; c++) {
             if(!player.equals(gameBoard[r][c])) {
                 matches = false;
                 break;
             }
         }
         if (matches) {
             break;
         }
     }
     return matches;
 }

 private static boolean isDiagonalWin(String player) {

 }

 private static boolean isTie() {

 }





 }