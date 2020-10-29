package lesson6.chess;

public class Knight extends Figure {

    @Override
    public boolean canMove(int x, int y) {
        return (this.x - x) * (this.x - x)
                + (this.y - y) * (this.y - y) == 5;
    }
}
