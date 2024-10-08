package Task2;

public abstract class Piece {
    protected Position a;

    public Piece(Position a) {
        this.a = a;
    }
    public Piece(){
    }

    public abstract boolean isLegalMove(Position b);
    public boolean isMoveLimits(Position b){
        return a.limits() && b.limits();
    }
}
