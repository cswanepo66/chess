package chess.pieces;

public class Pawn {
    public static final String WHITE = "white";
    public final static String BLACK = "black";
    private String color;

    public Pawn() {
        this.color = WHITE;
    }
    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
