package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[0][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
//   public static boolean isWin(char[][] board) {
//       boolean result = false;
//       for (int i = 0; i < board.length - 1; i++) {
//           int j = i + 1;
//           if (MatrixCheck.monoHorizontal(board, i) != false) {
//               result = true;
//               break;
//           }
//       }
// //  for ( .. ) {
// //      if ( .. ) {
// //          result = true;
// //          break;
// //      }
// //  }
//        return result;
//    }

}
