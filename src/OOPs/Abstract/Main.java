package OOPs.Abstract;

public class Main {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.fun();
        s.display();

        Rectangle r=new Rect();
        r.draw();
    }
}
