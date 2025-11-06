package Strings;

import java.util.Scanner;

public class ToLowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for( int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));

            }
            else{
                result.append(ch);
            }

        }
        System.out.println("Converted String is : "+ result);


            }
        }
