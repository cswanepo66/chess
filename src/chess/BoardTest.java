package chess;

import chess.pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase{
    private Board board;

    public void setUp() {
        board = new Board();
    }
    
    public void testCreate() {
        assertEquals(0, board.getNumberOfPieces());
    }

    public void testAddPieces() {
        Pawn firstPawn = new Pawn(Pawn.WHITE);
        board.addPiece(firstPawn);
        assertEquals(1, board.getNumberOfPieces());
        assertEquals(firstPawn, board.get(0));

        Pawn secondPawn = new Pawn(Pawn.BLACK);
        board.addPiece(secondPawn);
        assertEquals(2, board.getNumberOfPieces());
        assertEquals(firstPawn, board.get(0));
        assertEquals(secondPawn, board.get(1));
    }   
}
