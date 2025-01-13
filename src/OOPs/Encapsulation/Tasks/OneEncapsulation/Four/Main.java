package OOPs.Encapsulation.Tasks.OneEncapsulation.Four;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modifying the radius
        circle.setRadius(10);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
    }
}
