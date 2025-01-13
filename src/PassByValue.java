public class PassByValue {
    public static void main(String[] args) {
        int num=5;
        modifyValue(num);
        System.out.println(num);
    }
    public static void modifyValue(int n){
        //it cannot be change
        n=10;
    }
}
