package siit.shapes;

import java.util.Objects;

public class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0 ){
            throw new IllegalArgumentException("Width must be positive");
        }else{
            this.width = width;
        }
        if(length < 0 ){
            throw new IllegalArgumentException("Width must be positive");
        }else{
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return (2*width)+(2*length);
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, getLength());
    }
}
