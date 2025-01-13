package OOPs.Abstract;

public interface Rectangle {
    void draw();
}
class Rect implements Rectangle{
    public void draw(){
        System.out.println("This is interface");
    }
}
