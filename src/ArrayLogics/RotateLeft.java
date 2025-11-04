package ArrayLogics;


public class RotateLeft {
    public static void main(String[] args) {

        //Using Collection
//        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println("Before rotation: "+ l);
//        int d = 2;
//        Collections.rotate(l,-d);
//        System.out.println("After Left rotation: "+l);


        // Using For Loop
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        for( int i =0; i<2; i++){
            int first = arr[0];
            for(int j =0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        for( int x : arr)
            System.out.print(x+" ");

    }
}

