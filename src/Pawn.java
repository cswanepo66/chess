public class Pawn {
    public static final String WHITE = "white";
    public final static String BLACK = "black";
    private String color;

    Pawn() {
        this.color = WHITE;
    }
    Pawn(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

}
