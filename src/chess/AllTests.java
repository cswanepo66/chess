package chess;

import chess.pieces.PawnTest;
import junit.framework.TestSuite;

public class AllTests extends TestSuite{
    public static TestSuite suite() {
        TestSuite suite =
                new TestSuite();
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        return suite;
    }

}