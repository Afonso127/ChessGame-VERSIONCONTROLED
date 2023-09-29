package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null;//Peça qndo eh instanciada tem position nulo...
    }

    protected Board getBoard() {
        return board;
    }
}
