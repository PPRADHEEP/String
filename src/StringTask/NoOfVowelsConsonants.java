package StringTask;

import java.util.Scanner;

public class NoOfVowelsConsonants {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= s.nextLine().toLowerCase();

        int vowels=0, consonants=0;
        for(int i=0; i<input.length();i++){
            char ch=input.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("No of vowels: " + vowels);
        System.out.println("No of consonants "+ consonants);
    }
}
