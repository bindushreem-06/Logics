package ArrayLogics;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ToRemoveDuplicate {
    public static void main(String[] args) {
        int [] a ={1,4,5,6,6,7,3,2,3,8,1,1,5};

//         Using Collections
        System.out.println(Arrays.toString(a));
        Set<Integer> s = new LinkedHashSet<>();
        for(int i =0; i<a.length; i++){
            s.add(a[i]);
        }
        System.out.println(s);




    }
}
