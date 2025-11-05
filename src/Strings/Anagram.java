package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 ="race";
        String str2 ="care";
        char [] ch  = str1.toCharArray();
        char [] ch1 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)){
            System.out.println("The given String is Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
