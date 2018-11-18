package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle sq = new Square(5);
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());

    }

}

