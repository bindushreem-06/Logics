package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumandMinimumCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase().replace(" ", "");

        // LinkedHashMap to store characters in order of appearance
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // Step 1: Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Initialize max and min variables
        char maxChar = ' ';
        char minChar = ' ';
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Step 3: Find max and min occurring characters
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();

            if (count > max) {
                max = count;
                maxChar = ch;
            }

            if (count < min) {
                min = count;
                minChar = ch;
            }
        }

        // Step 4: Print results
        System.out.println("Character frequencies: " + charCount);
        System.out.println("Maximum occurring character: " + maxChar + " (" + max + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (" + min + " time)");
    }
}
