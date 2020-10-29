package lesson6.chess;

public abstract class Figure {

    protected int x, y;

    public abstract boolean canMove(int x, int y);

    public void move(int x, int y) {
        if (canMove(x, y)) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean checkPrecondition(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

}
