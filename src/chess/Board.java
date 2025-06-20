package chess;

import chess.pieces.Pawn;

import java.util.ArrayList;

public class Board {
    private int numberOfPieces = 0;
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    public Board() {
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void addPiece(Pawn pawn) {
        numberOfPieces++;
        pieces.add(pawn);
    }

    public Pawn get(int index) {
        return pieces.get(index);
    }

}
