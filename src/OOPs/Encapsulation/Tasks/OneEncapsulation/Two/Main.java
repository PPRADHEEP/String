package OOPs.Encapsulation.Tasks.OneEncapsulation.Two;

public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("Buddy","Golden Retriver");
        Dog dog2=new Dog("Charlie", "Labrador");

        System.out.println("Dog 1: ");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());

        System.out.println("\nDog 2: ");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());

        //Modify attributes
        dog1.setName("Max");
        dog1.setBreed("Poodie");

        dog2.setName("Rocky");
        dog2.setBreed("Beagle");

        //print the updates
        System.out.println("\nUpdated Dog1: ");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());

        System.out.println("\nUpdated Dog2: ");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
    }
}
