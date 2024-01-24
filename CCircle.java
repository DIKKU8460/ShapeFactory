/*
 Class representing a circle.
 A circle is a specific type of oval with equal radii.
*/
public class CCircle extends COval {

    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    public String display() {
        return "CIRCLE " + horizontalRadius;
    }
}
