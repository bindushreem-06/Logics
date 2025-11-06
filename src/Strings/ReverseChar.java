package Strings;

import java.util.Scanner;

public class ReverseChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String that needs to be reversed: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder(str);
        result.reverse();
        System.out.println("The Reversed String is: "+result.toString());

    }
}
