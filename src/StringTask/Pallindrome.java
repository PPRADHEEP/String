package StringTask;

public class Pallindrome {
    public static void main(String[] args) {
        String str="Welcome guys";
        String rev="";
        System.out.println(str);

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
            System.out.print("reverse string:" + rev);

            if(str.equals(rev))
                System.out.println("It is a pallindrom");
            else
                System.out.println("Not a pallindrom");
        }
    }
}
