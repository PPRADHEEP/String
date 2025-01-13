package OOPs.Polymorphism.MethodOverriding;

import OOPs.Polymorphism.Animal;

public class RuntimePolymorphism {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends RuntimePolymorphism{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
