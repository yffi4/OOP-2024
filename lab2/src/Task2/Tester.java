package Task2;

public class Tester {
    public static void main(String[] args) {

        Position rookStart = new Position('A', 1);
        Position rookMove1 = new Position('A', 8);
        Position rookMove2 = new Position('H', 1);
        Position rookIllegalMove = new Position('B', 2);

        Rook rook = new Rook(rookStart);
        System.out.println(rook);
        System.out.println("Rook legal move (A1 to A8)? " + rook.isLegalMove(rookMove1));
        System.out.println("Rook legal move (A1 to H1)? " + rook.isLegalMove(rookMove2));
        System.out.println("Rook legal move (A1 to B2)? " + rook.isLegalMove(rookIllegalMove));

        Position kingStart = new Position('E', 1);
        Position kingMove1 = new Position('D', 2);
        Position kingIllegalMove = new Position('E', 3);

        King king = new King(kingStart);
        System.out.println(king);
        System.out.println("King legal move (E1 to D2)? " + king.isLegalMove(kingMove1));
        System.out.println("King legal move (E1 to E3)? " + king.isLegalMove(kingIllegalMove));


        Position queenStart = new Position('D', 1);
        Position queenMove1 = new Position('D', 8);
        Position queenMove2 = new Position('H', 1);
        Position queenMove3 = new Position('A', 4);
        Position queenIllegalMove = new Position('B', 2);

        Queen queen = new Queen(queenStart);
        System.out.println(queen);
        System.out.println("Queen legal move (D1 to D8)? " + queen.isLegalMove(queenMove1));
        System.out.println("Queen legal move (D1 to H1)? " + queen.isLegalMove(queenMove2));
        System.out.println("Queen legal move (D1 to A4)? " + queen.isLegalMove(queenMove3));
        System.out.println("Queen legal move (D1 to B2)? " + queen.isLegalMove(queenIllegalMove));

        Position bishopStart = new Position('C', 1);
        Position bishopMove1 = new Position('F', 4);
        Position bishopIllegalMove = new Position('C', 4);

        Bishop bishop = new Bishop(bishopStart);
        System.out.println(bishop);
        System.out.println("Bishop legal move (C1 to F4)? " + bishop.isLegalMove(bishopMove1));
        System.out.println("Bishop legal move (C1 to C4)? " + bishop.isLegalMove(bishopIllegalMove));


        Position knightStart = new Position('B', 1);
        Position knightMove1 = new Position('C', 3);
        Position knightIllegalMove = new Position('B', 3);

        Knight knight = new Knight(knightStart);
        System.out.println(knight);
        System.out.println("Knight legal move (B1 to C3)? " + knight.isLegalMove(knightMove1));
        System.out.println("Knight legal move (B1 to B3)? " + knight.isLegalMove(knightIllegalMove));

        Position pawnStart = new Position('E', 2);
        Position pawnMove1 = new Position('E', 3);
        Position pawnMove2 = new Position('E', 4);
        Position pawnAttack = new Position('D', 3);
        Position pawnIllegalMove = new Position('E', 5);

        Pawn pawn = new Pawn(pawnStart);
        System.out.println(pawn);
        System.out.println("Pawn legal move (E2 to E3)? " + pawn.isLegalMove(pawnMove1));
        System.out.println("Pawn legal move (E2 to E4)? " + pawn.isLegalMove(pawnMove2));
        System.out.println("Pawn legal move (E2 to D3)? " + pawn.isLegalMove(pawnAttack));
        System.out.println("Pawn legal move (E2 to E5)? " + pawn.isLegalMove(pawnIllegalMove));

    }

}
