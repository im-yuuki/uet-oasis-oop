package week3.chess1;

import java.util.ArrayList;

public class Game {

    private Board board;
    private final ArrayList<Move> moveHistory = new ArrayList<>();

    public Game() {
        this.board = new Board();
    }

    public Game(Board board) {
        this.board = board;
    }

    public void movePiece(Piece piece, int toX, int toY) {
        if (!piece.canMove(board, toX, toY)) {
            return;
        }
        Piece killedPiece = board.getAt(toX, toY);
        if (killedPiece != null) {
            board.removeAt(toX, toY);
        }
        int startX = piece.getCoordinatesX();
        int startY = piece.getCoordinatesY();
        piece.setCoordinatesX(toX);
        piece.setCoordinatesY(toY);
        Move move;
        if (killedPiece != null) {
            move = new Move(startX, toX, startY, toY, piece, killedPiece);
        } else {
            move = new Move(startX, toX, startY, toY, piece);
        }
        moveHistory.add(move);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}
