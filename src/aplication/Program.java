package aplication;

import boardgame.Board;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {

        Position p = new Position(3,5);
        System.out.println(p);

        Board b = new Board(8,8);
        System.out.println(b);
    }
}
