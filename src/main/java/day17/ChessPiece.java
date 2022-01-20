package day17;

public enum ChessPiece {
    EMPTY(-1,"_"), KING_WHITE(100,"♔"),QUEEN_WHITE(9, "♕"),ROOK_WHITE(5, "♖"),BISHOP_WHITE(3.5, "♗"),KNIGHT_WHITE(3, "♘"),PAWN_WHITE(1,"♙"),
    KING_BLACK(100,"♚"),QUEEN_BLACK(9, "♛"),ROOK_BLACK(5, "♜"),BISHOP_BLACK(3.5, "♝"),KNIGHT_BLACK(3, "♞"),PAWN_BLACK(1,"♟");

    private double value;
    private String figureName;

    ChessPiece(double value, String figureName) {
        this.value = value;
        this.figureName = figureName;
    }
    public String getFigureName(){
        return figureName;
    }

    @Override
    public String toString() {
        return figureName;
    }
}
