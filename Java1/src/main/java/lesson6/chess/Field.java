package lesson6.chess;

public class Field {

    static Figure [][] figures = new Figure[9][9];

    public static void main(String[] args) {
        figures[1][1].move(3,3);
        figures[3][3] = figures[1][1];
        figures[1][1] = null;
    }
}
