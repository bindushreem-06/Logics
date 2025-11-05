package Strings;

public class AllSubstringofString {
    public static void main(String[] args) {
        String str = "FUN";
        System.out.println("The Substring of the given Strings are: ");
        for (int i=0; i<str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
