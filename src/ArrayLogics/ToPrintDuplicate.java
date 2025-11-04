package ArrayLogics;

import java.util.HashSet;

public class ToPrintDuplicate {
    public static void main(String[] args) {
                int[] arr = {1, 5, 3, 4, 2, 5, 3, 6, 1,1};


                //Using Collections

              HashSet<Integer> seen = new HashSet<>();
               HashSet<Integer> duplicates = new HashSet<>();
               for (int num : arr) {
                   if (!seen.add(num)) {  // add() returns false if num already exists
                        duplicates.add(num);
                    }
                }
                System.out.println("Duplicate elements: " + duplicates);






            }
        }

