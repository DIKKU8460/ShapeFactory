import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


//Class representing a canvas.
//A canvas holds a collection of shapes.
 
public class CCanvas {
    private ArrayList<CShape> shapes;

    public CCanvas() {
        shapes = new ArrayList<>();
        generateRandomShapes();
    }

    /*
     Generates 10 random non-duplicate shapes.
    */
    private void generateRandomShapes() {
        Set<String> existingShapes = new HashSet<>();
        Random random = new Random();

        while (shapes.size() < 10) {
            CShape shape = null;
            switch (random.nextInt(4)) {
                case 0:
                    int length = random.nextInt(100) + 1;
                    int width = random.nextInt(100) + 1;
                    shape = new CRectangle(length, width);
                    break;
                case 1:
                    int side = random.nextInt(100) + 1;
                    shape = new CSquare(side);
                    break;
                case 2:
                    int radius = random.nextInt(100) + 1;
                    shape = new CCircle(radius);
                    break;
                case 3:
                    int hRadius = random.nextInt(100) + 1;
                    int vRadius = random.nextInt(100) + 1;
                    shape = new COval(hRadius, vRadius);
                    break;
            }
            String shapeString = shape.display();
            if (!existingShapes.contains(shapeString)) {
                shapes.add(shape);
                existingShapes.add(shapeString);
            }
        }
    }

    public void displayShapes() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes.get(i).display());
        }
    }
}
