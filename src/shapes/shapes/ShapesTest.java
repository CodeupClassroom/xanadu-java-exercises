package shapes.shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(2);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(2, 5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        // If myShape is declared of type Measurable, getLength() and getWidth() are not inherited
        // If myShape is declared of type Quadrilateral, the methods work as expected
        // this is because variables of type, someObj/interface do NOT have access to sub class changes
//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());

    }

}
