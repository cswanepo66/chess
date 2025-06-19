public class PawnTest extends junit.framework.TestCase{
    public void testCreate() {
        Pawn firtPawn = new Pawn(Pawn.WHITE);
        assertEquals(Pawn.WHITE, firtPawn.getColor());

        Pawn secondPawn = new Pawn(Pawn.BLACK);
        assertEquals(Pawn.BLACK, secondPawn.getColor());

        Pawn thirdPawn = new Pawn();
        assertEquals(Pawn.WHITE, thirdPawn.getColor());

    }

}
