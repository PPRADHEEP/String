package OOPs.Encapsulation.Tasks.OneEncapsulation;

public class Person {
    private String name;
    private int age;

     //constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //getter method for name
    public String getName(){
        return name;
    }

    //getter method for age
    public int getAge(){
        return age;
    }

}
