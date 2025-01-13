import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String s = "Welcome";
//        String s1 = "Welcome";
//        System.out.println(s);
//
//        String str=new String("Welcome");
//        System.out.println(str);
//
//        // == -check the reference value
//        // equals -check the value
//
//        if (s.equals(str)){
//            System.out.println("both are equal");
//        }
//        else {
//            System.out.println("not equal");
//        }
//
//        if (s == str){
//            System.out.println("both are equal");
//        }
//        else {
//            System.out.println("not equal");
//        }


        String str = "java";
        String s = str.concat(" program");
        System.out.println(s);
        System.out.println(s.length());

        char ch=s.charAt(5);
        System.out.println(ch);

        String sub = s.substring(0,3);
        System.out.println(sub);

        String[] sp = s.split(" ");
        System.out.println(Arrays.toString(sp));
    }
}