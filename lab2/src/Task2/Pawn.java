package Task2;

public class Pawn extends Piece{
    private boolean isFirstMove;
    public Pawn(Position a) {
        super(a);
        this.isFirstMove = true;
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(b.getY() - a.getY());
        if (!isMoveLimits(b)){
            return false;
        }

        if (dx == 0 && dy == 1) {
            isFirstMove = false;
            return true;
        } else if (isFirstMove && dx == 0 && dy == 2) {
            isFirstMove = false;
            return true;
        } else if (dx == 1 && dy == 1) {
            return true;
        }

        return false;
    }
    @Override
    public String toString() {
        return "Pawn at " + a.toString();
    }
}
