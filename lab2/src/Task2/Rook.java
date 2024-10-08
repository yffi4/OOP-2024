package Task2;

public class Rook extends Piece{
    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return isMoveLimits(b) && (a.getX() == b.getX() || a.getY() == b.getY());
    }

    @Override
    public String toString() {
        return "Rook at position " + a.toString();
    }
}
