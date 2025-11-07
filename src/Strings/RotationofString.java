package Strings;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RotationofString {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CABD";
        if(s1.length() == s2.length() && (s1 + s1).contains(s2)){
            System.out.println(s2 + " is Rotation of "+ s1);
        }
        else{
            System.out.println(s2 + " is not a Rotation of "+ s1);
        }
    }
}
