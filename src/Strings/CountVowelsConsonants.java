package Strings;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        // to replace non-alphabets
        str = str.replaceAll("[^a-z]","");

        String vowels = str.replaceAll("[^aeiou]","");

        String consonants = str.replaceAll("[aeiou]","");

        int vowelsCount = vowels.length();
        int consonantCount = consonants.length();

        System.out.println("Total number of vowels: "+ vowelsCount);
        System.out.println("Total number of consonants: "+ consonantCount);
sc.close();
    }
}
