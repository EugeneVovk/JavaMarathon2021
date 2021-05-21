package day17;

public enum ChessPiece {
    //  в этом перечислении нужно создать все шахматные фигуры

    KING_WHITE(100, "♔"), KING_BLACK(100,"♚"),
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"),
    BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3, "♞"),
    PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    //  ценность шахматной фигуры
    private double value;
    //  строковое представление
    private String representation;

    ChessPiece(double value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
