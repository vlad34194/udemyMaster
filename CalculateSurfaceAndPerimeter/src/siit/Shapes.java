package siit;

import siit.shapes.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shapes {
    List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        if (shapeList.contains(shape)) {
            throw
                    new IllegalArgumentException("This shape is already in your list");
        } else {
            shapeList.add(shape);
        }
    }
    public void removeShape(Shape shape){
       int findShape = findShape(shape);
       if(findShape < 0){
           System.out.println("Was not found");
       }
       shapeList.remove(shape);
    }
    private int findShape(Shape shape){
        return this.shapeList.indexOf(shape);
    }

    public int getShapeCount() {
        return this.shapeList.size();
    }

    public List<Shape> getAllShapes() {
        return Collections.unmodifiableList(shapeList);
    }

    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for (Shape s : shapeList) {
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape s : shapeList) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
