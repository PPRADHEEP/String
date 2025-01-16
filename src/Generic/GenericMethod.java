package Generic;

public class GenericMethod {
    public <T> void display (T[] a){
        for(T element:a){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
