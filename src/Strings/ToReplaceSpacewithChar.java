package Strings;

import java.util.Scanner;

public class ToReplaceSpacewithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the Character to replace the space: ");
        char ch = sc.next().charAt(0);
        String replaced = str.replace(' ',ch);
        System.out.println(replaced);
    }
}
