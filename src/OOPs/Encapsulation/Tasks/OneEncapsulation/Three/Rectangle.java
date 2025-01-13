package OOPs.Encapsulation.Tasks.OneEncapsulation.Three;

public class Rectangle {
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    //getter methods
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    //Method to calculate area
    public double calculateArea(){
        return width+height;
    }
    //Method to calculate perimeter
    public double calculatePerimeter(){
        return 2*(width+height);
    }

}
