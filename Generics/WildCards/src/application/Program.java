package application;

import java.util.ArrayList;
import java.util.List;
import entities.Shape;
import entities.Circle;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3, 2));
        myShapes.add(new Circle(2));
        
        System.out.println("total area: "+totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2));
        myCircles.add(new Circle(3));
        System.out.println("total area: "+totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
