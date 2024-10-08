package Task2;

public class Knight extends Piece{
    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return isMoveLimits(b) && ((dx == 1 && dy == 2) || (dx == 2 && dy == 1));
    }

    @Override
    public String toString() {
        return "Knight at " + a.toString();
    }
}
