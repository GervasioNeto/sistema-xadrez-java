package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Erro ao instanciar o ChessPosition, os valores válidos são: a1 até h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        // linha = 8-linha // 8 == 0x0 linha8 = (8-8)0 linha7 = (8-7)1
        // a = ('a'-'a')0 linhaB = ('b'-'a')1...

        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        //compilador
        return "" + column + row;
    }
}
