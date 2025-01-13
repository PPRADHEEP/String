public class PassByRefference {
    public static void main(String[] args) {
        MyClass obj=new MyClass(5);
        modifyObject(obj);
        System.out.println(obj.value);
    }
    public static void modifyObject(MyClass o){
        o.value=10;
    }
}
class MyClass{
    int value;
    MyClass(int value){
        this.value=value;
    }
}
