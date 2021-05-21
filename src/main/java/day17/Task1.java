package day17;

/**
 * Создайте Enum “Шахматная фигура” (англ. ChessPiece).
 * Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook),
 * слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
 * В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
 * Ценность фигуры - вещественное число
 * Строковое обозначение фигуры
 * <p>
 * В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных.
 * Названия фигур в перечислении должны иметь следующий вид:
 * KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
 * <p>
 * У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.
 * <p>
 * Ценности шахматных фигур приведены в таблице:
 * Пешка  1
 * Конь   3
 * Слон   3.5
 * Ладья  5
 * Ферзь  9
 * Король 100
 * <p>
 * Строковые обозначения шахматных фигур приведены в таблице:
 * Пешка (белая)  ♙
 * Конь (белый)   ♘
 * Слон (белый)   ♗
 * Ладья (белая)  ♖
 * Ферзь (белый)  ♕
 * Король (белый) ♔
 * <p>
 * <p>
 * Пешка (черная)  ♟
 * Конь (черный)   ♞
 * Слон (черный)   ♝
 * Ладья (черная)  ♜
 * Ферзь (черный)  ♛
 * Король (черный) ♚
 * <p>
 * <p>
 * Используя созданный Enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
 * Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 * <p>
 * Вывод в консоль должен быть таким:
 * ♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜
 */

public class Task1 {
    public static void main(String[] args) {
        //  создаём массив из шахматных фигур
        ChessPiece[] pieces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };

        //  выводим этот массив на экран изсходя из строковых представлений(enum) каждой фигуры
        //  используем foreach
        for (ChessPiece chessPiece : pieces)
            System.out.print(chessPiece.getRepresentation() + " ");

    }
}