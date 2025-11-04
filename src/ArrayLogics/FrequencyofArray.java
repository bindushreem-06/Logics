package ArrayLogics;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 6, 7, 8, 6, 8};
        int n = arr.length;

        //Using Collections
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        for(int num: arr){
//            map.put(num, map.getOrDefault(num,0)+1);
//        }
//        map.forEach((key,value) -> {
//                System.out.println(key+" "+value);
//        });


        //Using For Loop
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] == -1) continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }

            }
            System.out.println(arr[i] + " = " + count);

        }
    }}
