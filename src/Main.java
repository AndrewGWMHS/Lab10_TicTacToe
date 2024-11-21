import java.util.Scanner;
 class Main {
    private static String [][] gameBoard = new String[3][3];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe");

        String playerOne = "X";
        String playerTwo = "O";

        clearBoard(gameBoard);

        InputHelper.getRangedInt(scan, "Enter your move row [1-3]", 1, 3);

        InputHelper.getRangedInt(scan, "Enter your move column [1-3]", 1, 3);



    }

     private static boolean isValidMove(int row, int col) {
        String move;
        boolean matches;
        for(int r = 0; r < row - 1; r++) {
            for(int c = 0; c < col - 1; c++) {
                gameBoard.
            }
        }
     }


     private static void clearBoard(String board[][]) {
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                System.out.println(board[r][c] + "-");
            }
        }
    }
}