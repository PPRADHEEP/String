package OOPs.Encapsulation;

public class Car {
    private String model;
    private int speed;

    //getter for speed
    public int getSpeed(){
        return speed;
    }
    //setter for speed
    public void setSpeed(int speed){
        if(speed>0){
            this.speed=speed;
        }
    }
}
