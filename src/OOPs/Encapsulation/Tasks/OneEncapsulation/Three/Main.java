package OOPs.Encapsulation.Tasks.OneEncapsulation.Three;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
