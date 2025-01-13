package OOPs.Encapsulation.Tasks.OneEncapsulation;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John",30);
        Person person2 = new Person("Akash",17);

//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());

        System.out.println("Person 1: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("\nPerson 2: ");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
