package OOPs.Encapsulation.Tasks.OneEncapsulation.Four;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius=radius;
    }

    //getter method for radius
    public double getRadius(){
        return radius;
    }
    //setter method for radius
    public void setRadius(double radius){
        this.radius=radius;
    }
    //method to calculate area
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
    //Method to calculate circumference
    public double  calculateCircumference(){
        return 2 * Math.PI*radius;
    }
}
