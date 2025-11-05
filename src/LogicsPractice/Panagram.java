package LogicsPractice;

import java.util.Set;
import java.util.TreeSet;

public class Panagram {
    public static void main(String[] args) {
        String str = "The Quick Brown fox jumps over the lazy dog";
        str = str.replace(" ","").toLowerCase();
        Set<Character> s1 = new TreeSet<Character>();
        for(int i=0; i<str.length();i++){
            s1.add(str.charAt(i));
        }
        if(s1.size()==26){
            System.out.println(s1);
            System.out.println("It is Panagram");
        }
        else{
            System.out.println("It is not Panagram");
        }
    }
}
