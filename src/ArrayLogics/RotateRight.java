package ArrayLogics;



public class RotateRight {
    public static void main(String[] args) {

        //Using Collection
//        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println("Before rotation: "+ l);
//        int d = 2;
//        Collections.rotate(l,d);
//        System.out.println("After Right rotation: "+l);


        //Using For loop
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        for( int i =0; i<2; i++){
            int last = arr[n-1];
            for(int j=n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        for( int x : arr)
            System.out.print(x+" ");



            }
        }






