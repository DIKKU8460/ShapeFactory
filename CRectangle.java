/*
 Class representing a rectangle.
 A rectangle has a length and a width.
*/
public class CRectangle extends CShape {
    protected int length;
    protected int width;

    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String display() {
        return "RECTANGLE " + length + "x" + width;
    }
}
