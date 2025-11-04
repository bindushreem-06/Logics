package ArrayLogics;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a = {10,3,15,6,30};
        int n = a.length;
        for(int i =0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is :");
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
