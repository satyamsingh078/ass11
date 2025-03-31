// Shape.java


// Rectangle.java




// ShapeTest.java (for Q3)
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(3.0);
        
        System.out.println(rectangle.getType() + " area: " + rectangle.area());
        System.out.println(circle.getType() + " area: " + circle.area());
    }
}