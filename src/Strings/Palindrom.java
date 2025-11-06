package Strings;

public class Palindrom {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();
        char [] ch = str.toCharArray();
        int i =0, j=ch.length-1;
        while(i<j){
            if (ch[i] != ch[j]) {
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
