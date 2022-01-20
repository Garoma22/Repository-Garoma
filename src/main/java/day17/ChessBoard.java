package day17;

import java.util.Arrays;

public class ChessBoard {


    public static void print(ChessPiece[][] chessPiece) {

        for (ChessPiece[] pieces : chessPiece) {
            Arrays.fill(pieces, ChessPiece.EMPTY);
        }
            // СТРОКА 8
            chessPiece[0][0] = ChessPiece.ROOK_BLACK;
            chessPiece[0][5] = ChessPiece.ROOK_BLACK;
            chessPiece[0][6] = ChessPiece.KING_BLACK;

            // СТРОКА 7

        chessPiece[1][1] = ChessPiece.ROOK_WHITE;
        chessPiece[1][4] = ChessPiece.PAWN_BLACK;
        chessPiece[1][5] = ChessPiece.PAWN_BLACK;
        chessPiece[1][7] = ChessPiece.PAWN_BLACK;

        // СТРОКА 6

        chessPiece[2][0] = ChessPiece.PAWN_BLACK;
        chessPiece[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPiece[2][6] = ChessPiece.PAWN_BLACK;

        // СТРОКА 5

        chessPiece[3][0] = ChessPiece.QUEEN_BLACK;
        chessPiece[3][3] = ChessPiece.BISHOP_WHITE;

        // СТРОКА 4
        chessPiece[4][3] = ChessPiece.BISHOP_BLACK;
        chessPiece[4][4] = ChessPiece.PAWN_WHITE;

        // СТРОКА 3
        chessPiece[5][4] = ChessPiece.BISHOP_WHITE;
        chessPiece[5][5] = ChessPiece.PAWN_WHITE;


        // СТРОКА 2
        chessPiece[6][0] = ChessPiece.PAWN_WHITE;
        chessPiece[6][3] = ChessPiece.QUEEN_WHITE;
        chessPiece[6][5] = ChessPiece.PAWN_WHITE;
        chessPiece[6][7] = ChessPiece.PAWN_WHITE;


        // СТРОКА 1
        chessPiece[7][5] = ChessPiece.ROOK_WHITE;
        chessPiece[7][6] = ChessPiece.KING_WHITE;

            for (ChessPiece[] chessPieces : chessPiece) {
                for (ChessPiece piece : chessPieces) {
                    System.out.print(piece);

                }
                System.out.println();
            }
        }
    }



































//                if (i == 0 && j == 0) {
//                    System.out.print(chessPiece[j][i] = ChessPiece.ROOK_BLACK);
//                } if (i == 0 && j == 4) {
//                    System.out.print(chessPiece[j][i] = ChessPiece.ROOK_BLACK);
//                } if (i == 0 && j == 6) {
//                    System.out.print(chessPiece[j][i] = ChessPiece.KING_BLACK);


//                } else {
//                  System.out.print(chessPiece[j][i] = ChessPiece.EMPTY);
//              }









//System.out.println(Arrays.deepToString(chessPiece));





