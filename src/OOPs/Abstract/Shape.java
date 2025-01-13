package OOPs.Abstract;

abstract public class Shape {
    abstract void display();

    void fun(){
        System.out.println("Have fun");
    }
}

class Circle extends Shape{
    public void display(){
        System.out.println("Display shape");
    }
}
