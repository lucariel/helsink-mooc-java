/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

/**
 *
 * @author lucariel
 */
public class Dungeon {

    private Board board;
    private Player player;
    private int moves;
    private List<Vampire> vampires;
    private Scanner scanner;
    private boolean vampiresMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.board = new Board(length, height);
        this.player = new Player();
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.vampires = new ArrayList<Vampire>();
        for (int i = 0; i < vampires; i++) {
            this.vampires.add(new Vampire(this.board));
        }
        this.scanner = new Scanner(System.in);
    }

    public void run() {

        while (true) {
            board.setPieces(player);

            for (Vampire v : vampires) {
                board.setPieces(v);
            }
            if (moves <= 0) {
                System.out.println("YOU LOST!");

                break;
            }
            System.out.println(moves + "\n");

            System.out.println("@ " + player.getY() + " " + player.getX());
            for (Vampire v : vampires) {
                System.out.println("v " + v.getY() + " " + v.getX());
            }

            System.out.println("");
            board.print();

            String playerMove = scanner.nextLine();

            if (playerMove.contains("w") | playerMove.contains("s") | playerMove.contains("a") | playerMove.contains("d")) {
                for (int i = 0; i < playerMove.length(); i++) {
                    String m = playerMove.charAt(i) + "";
                    this.board.movePlayer(player, m);
                    board.setPieces(player);

                }
            }

            for (Vampire v : vampires) {
                if (v.getX() == player.getX() & v.getY() == player.getY()) {
                    vampires.remove(v);
                    this.board.setPieces(player, player.getX(), player.getY());
                    break;
                }

            }
            if (vampires.size() <= 0) {
                System.out.println("YOU WIN");
                break;
            }
            if (vampiresMove) {
                for (Vampire v : vampires) {
                    String pMoves = "asdw";
                    Random n = new Random();

                    for (int i = 0; i < playerMove.length(); i++) {
                        String m = pMoves.charAt(n.nextInt(pMoves.length())) + "";
                        this.board.movePiece(v, m);

                    }

                }
                board.setPieces(player);

            }
            moves -= 1;

        }
    }
}
