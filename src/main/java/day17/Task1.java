package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPiece1 = new ChessPiece[8];
        chessPiece1[0] = ChessPiece.PAWN_WHITE;
        chessPiece1[1] = ChessPiece.PAWN_WHITE;
        chessPiece1[2] = ChessPiece.PAWN_WHITE;
        chessPiece1[3] = ChessPiece.PAWN_WHITE;
        chessPiece1[4] = ChessPiece.ROOK_BLACK;
        chessPiece1[5] = ChessPiece.ROOK_BLACK;
        chessPiece1[6] = ChessPiece.ROOK_BLACK;
        chessPiece1[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece chessPiece : chessPiece1) {
            System.out.print(chessPiece.getFigureName() +" ");

        }
    }
}