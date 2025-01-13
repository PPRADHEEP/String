package OOPs.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        CompileTimePolymorphism calc = new CompileTimePolymorphism();
        System.out.println(calc.add(10,20));

        System.out.println(calc.add(10.5, 20.5));
    }
}
