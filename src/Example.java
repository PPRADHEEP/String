public class Example {
    public static void main (String[] args){
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb);
//        sb.insert(5, " Java");
//        System.out.println(sb);
//        sb.reverse();
//
//        System.out.println(sb);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.delete(5,11);
        System.out.println(sb.toString());
    }
}
