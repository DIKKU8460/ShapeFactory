/*
 Class representing a square.
 A square is a specific type of rectangle with equal length and width.
 */
public class CSquare extends CRectangle {

    public CSquare(int side) {
        super(side, side);
    }

    @Override
    public String display() {
        return "SQUARE " + length + "x" + length;
    }
}
