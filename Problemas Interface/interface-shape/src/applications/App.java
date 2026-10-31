package applications;
import entities.AbstractShape;
import entities.Circle;
import entities.Color;
import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractShape shape1 = new Circle(Color.BLUE, 2.0);
        AbstractShape shape2 = new Rectangle(Color.BLACK, 3.0, 4.0);

        System.out.println("Circle color: "+shape1.getColor());
        System.out.println("Circle area: "+ String.format("%.2f", shape1.area()));
        System.out.println("Rectangle color: "+shape2.getColor());
        System.out.println("Rectangle area: "+ String.format("%.2f", shape2.area()));
    }
}
