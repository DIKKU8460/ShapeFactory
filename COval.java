/*
 Class representing an oval.
 An oval has a horizontal and a vertical radius.
*/
public class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    public COval(int horizontalRadius, int verticalRadius) {
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    @Override
    public String display() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
