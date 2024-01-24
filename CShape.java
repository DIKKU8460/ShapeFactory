/*
 Abstract class representing a generic shape.
 Each shape has a unique ID.
*/
public abstract class CShape {
    private static int counter = 0;
    protected final int id;

    public CShape() {
        this.id = ++counter;
    }

    public abstract String display();
}
