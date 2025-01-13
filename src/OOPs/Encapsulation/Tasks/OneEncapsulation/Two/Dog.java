package OOPs.Encapsulation.Tasks.OneEncapsulation.Two;

public class Dog {
    //Attributes
    private String name;
    private String breed;

    //constructor
    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name = name;
    }
    //getter method for breed
    public String getBreed(){
        return breed;
    }
    //setter method for breed
    public void setBreed(String breed){
        this.breed=breed;
    }
}
