package shapes.shapes;

public class Square extends Quadrilateral {

    public Square(double num) {
        super(num, num);
    }

    @Override
    public void setLength(double num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(double num) {
        setLength(num);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

}
