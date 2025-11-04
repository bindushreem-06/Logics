package Logics;
import java.util.Scanner;

public class LettersThenDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        sc.close();
//
//        StringBuilder letters = new StringBuilder();
//        StringBuilder digits = new StringBuilder();
//
//        for (char c : input.toCharArray()) {
//            if (Character.isLetter(c)) {
//                letters.append(c);
//            } else if (Character.isDigit(c)) {
//                digits.append(c);
//            }
//
//        }
//
//
//        System.out.println(letters.toString() + digits.toString());

        String str = "qw25t6u";
        String s = str.replaceAll("[^a-z]","");
        String n = str.replaceAll("[^0-9]","");
        System.out.println(s+n);
    }
}
