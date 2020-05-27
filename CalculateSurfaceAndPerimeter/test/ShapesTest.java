import org.junit.Assert;
import org.junit.Test;
import siit.Shapes;
import siit.shapes.Circle;
import siit.shapes.Rectangle;
import siit.shapes.Shape;
import siit.shapes.Square;


import java.util.List;

public class ShapesTest {

    @Test
    public void testSquarePerimeter() {
        int latura = 5;
        Square s = new Square(latura);
        double perimeter = s.getPerimeter();

        Assert.assertEquals(20, perimeter, 0.1);
    }

    @Test
    public void testAddShapes() {
        Square patrat = new Square(2);

        Shapes shapes = new Shapes();
        shapes.addShape(patrat);
        Assert.assertEquals(1, shapes.getShapeCount());

        List<Shape> squareList =  shapes.getAllShapes();

        for(Shape s : squareList) {
            Square p = (Square) s;
            Assert.assertEquals(2, p.getSide());
        }

        boolean contains = squareList.contains(new Square(2));
        Assert.assertTrue(contains);
    }

    @Test
    public void testCirclePerimeter() {
        Circle c = new Circle(1);

        double circumference = c.getPerimeter();

        Assert.assertEquals(6.283, circumference, 0.2);
    }

    @Test
    public void testAddMultipleShapes() {
        Square square = new Square(4);
        Circle circle = new Circle(1);

        Shapes s = new Shapes();
        s.addShape(square);
        s.addShape(circle);

        Assert.assertEquals(2, s.getShapeCount());
    }

    @Test(expected = IllegalStateException.class)
    public void testDuplicateSquares() {
        Square square = new Square(2);
        Square square2 = new Square(2);
        Shapes shapes = new Shapes();
        shapes.addShape(square);
        shapes.addShape(square2); // ar trebui sa crape
    }

    @Test(expected = IllegalStateException.class)
    public void testDuplicateCircles() {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(2);
        Shapes shapes = new Shapes();
        shapes.addShape(c1);
        shapes.addShape(c2);
    }

    @Test
    public void testSumOfPerimeters() {

        Square square = new Square(2);
        Circle circle = new Circle(1);

        Shapes shapes = new Shapes();
        shapes.addShape(square);
        shapes.addShape(circle);


        double d = shapes.getTotalPerimeter();

        Assert.assertEquals(14.283, d, 0.1);
    }

    @Test
    public void testRectangelePerimeter() {
        int latimea = 5;
        int lungimea = 2;
        Rectangle r = new Rectangle(latimea, lungimea);
        double perimeter = r.getPerimeter();

        Assert.assertEquals(14, perimeter, 0.1);
    }

    @Test
    public void textRectangeArea() {

        Rectangle rectangle = new Rectangle(2, 1);

        double area = rectangle.getArea();

        Assert.assertEquals(2, area, 0.1);
    }

    @Test
    public void testTotalAreas() {
        Rectangle rectangle = new Rectangle(2, 1);
        Circle circle = new Circle(1);
        Shapes shapes = new Shapes();
        shapes.addShape(rectangle);
        shapes.addShape(circle);

        double area = shapes.getTotalArea();

        Assert.assertEquals(5.1415, area, 0.1);
    }


}
