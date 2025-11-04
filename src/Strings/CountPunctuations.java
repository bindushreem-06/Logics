package Strings;

public class CountPunctuations {
    public static void main(String[] args) {
        String str = "Hello!!! How are you doing today? I'm fine, thank you.";

//        With regular Expression
//        System.out.println("Punctuations found are:  ");
//        int count = 0;
//        for(int i =0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if (String.valueOf(ch).matches("\\p{Punct}")) {
//                System.out.print(ch + " ");
//                count++;
//            }
//            }
//        System.out.println("\nTotal number of punctuations: " + count);


        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '!' || ch == ',' || ch == ';' || ch == '.' ||
                    ch == '?' || ch == '-' || ch == '\'' || ch == '\"') {
                count++;
            }
        }

        System.out.println("Total number of punctuations: " + count);
    }}


