/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author lucariel
 */
public class Board {

    char[][] board;
    private int length;
    private int height;

    public Board(int length, int height) {
        this.length = length;
        this.height = height;

        this.board = new char[length][height];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                this.board[i][j] = '.';
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setPieces(Movable a) {

        this.board[a.getX()][a.getY()] = a.getC();
    }

    public void setPieces(Movable a, int x, int y) {

        this.board[x][y] = a.getC();
    }

    public boolean checkMove(Movable a, String m) {
        Movable check = new Movable(a.getX(), a.getY());
        check.move(m);

        int checkCoordx = check.getX();
        int checkCoordy = check.getY();

        if (checkCoordx < 0 | checkCoordy < 0 | checkCoordx >= this.getLength() | checkCoordy >= this.getHeight()) {
            return false;
        } else {
            if (this.getBoard()[checkCoordx][checkCoordy] == '.') {
                return true;
            }
            else{
                return false;
            }
        }

    }

    public void movePiece(Movable a, String m) {
        if (checkMove(a, m)) {
            this.board[a.getX()][a.getY()] = '.';
            a.move(m);
            this.board[a.getX()][a.getY()] = a.getC();
        }

    }
    public boolean checkMovePlayer(Player a, String m) {
        Movable check = new Movable(a.getX(), a.getY());
        check.move(m);

        int checkCoordx = check.getX();
        int checkCoordy = check.getY();

        if (checkCoordx < 0 | checkCoordy < 0 | checkCoordx >= this.getLength() | checkCoordy >= this.getHeight()) {
            return false;
        } else {
                return true;
            
        }

    }

    public void movePlayer(Player a, String m) {
        if (checkMovePlayer(a, m)) {
            this.board[a.getX()][a.getY()] = '.';
            a.move(m);
            this.board[a.getX()][a.getY()] = a.getC();
        }

    }

    public void print() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(this.board[i][j]);

            }
            System.out.println("");

        }

    }

}
