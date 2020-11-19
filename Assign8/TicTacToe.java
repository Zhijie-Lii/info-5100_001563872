package TicTacToe;

import java.io.File;
import java.util.*;

import java.util.ArrayList;


/**
 * I put some codes I wrote in ticTacToe.java file which can give some tips I think.
 * You can just delete codes or functions I wrote if you come up with some other methods to finish the requirements.
 */

public class TicTacToe {
    private File file = new File("TicTacToe.txt");
    static ArrayList<Integer> playerPositions = new ArrayList();
    static ArrayList<Integer> cpuPositions = new ArrayList();


    public static void main(String[] args) {
        playGame();

    }

    public static void printGameBoard(char[][] gameBoard) {
//        Scanner scanner = new Scanner("TicTacToe.txt");
        for (char[] row: gameBoard){
            for (char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
//        addGameBoardIntoFile();
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        ArrayList<Integer> marker = new ArrayList<>();

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }


        if (marker.contains(Integer.valueOf(pos))){
            System.out.println("This block has been placed. Choose another piece.");
        }else {

            if (1 == pos) {
                gameBoard[0][0] = symbol;
            } else if (2 == pos) {
                gameBoard[0][2] = symbol;
            } else if (3 == pos) {
                gameBoard[0][4] = symbol;
            } else if (4 == pos) {
                gameBoard[2][0] = symbol;
            } else if (5 == pos) {
                gameBoard[2][2] = symbol;
            } else if (6 == pos) {
                gameBoard[2][4] = symbol;
            } else if (7 == pos) {
                gameBoard[4][0] = symbol;
            } else if (8 == pos) {
                gameBoard[4][2] = symbol;
            } else if (9 == pos) {
                gameBoard[4][4] = symbol;
            } else {
                System.out.println("Invalid position");
            }
            marker.add(pos);
        }
        printGameBoard(gameBoard);
    }

    public static String checkWinner() {
        List north = Arrays.asList(1,2,3);
        List vertical = Arrays.asList(4,5,6);
        List south = Arrays.asList(7,8,9);
        List west = Arrays.asList(1,4,7);
        List horizontal = Arrays.asList(2,5,8);
        List east = Arrays.asList(3,6,9);
        List northwestern = Arrays.asList(1,5,9);
        List northeastern =Arrays.asList(3,5,7);

        ArrayList<List> winning = new ArrayList<>();
        winning.add(north);
        winning.add(vertical);
        winning.add(south);
        winning.add(west);
        winning.add(horizontal);
        winning.add(east);
        winning.add(northwestern);
        winning.add(northeastern);

        String s =null;

        for (List l:winning)
        if (cpuPositions.containsAll(l)){

            s = "CPU wins! Sorry:(";
            return s;

        } else if (playerPositions.containsAll(l)) {
            s = "Congratulations you won!";
            return s;
        }
        else if (cpuPositions.size()+playerPositions.size()==9){
            s = "Game end. Tie game. Nobody wins";
            return s;
        }
        else {
            s = "CAT!";
            return s;
        }
        return s;
    }

    private static void playGame(){
        // static char??
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };
        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            placePiece(gameBoard,playerPos,"player");

//         cpu's turn
            Random rd = new Random();
            int cpuPos = rd.nextInt(9) +1;
            placePiece(gameBoard,cpuPos,"cpu");
            System.out.println("CPU has made its piece.");


            System.out.println(checkWinner());
        }
    }

}
