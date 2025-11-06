package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str = sc.nextLine().toLowerCase();
        Map<String,Integer> map = new LinkedHashMap<>();
        String [] s1 = str.split(" ");
        for(String str1 : s1){
            map.put(str1, map.getOrDefault(str1,0)+1);
        }
        map.forEach((key,value)-> {
            if(value >1){
                System.out.println(key);
            }
        });
    }
}
