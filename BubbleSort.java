import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{7,1,8,2,9,3,6,4,5,0};
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
       boolean swap=true;
       while(swap) {
           swap=false;
           for (int i = 0; i < arr.length - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                   swap=true;
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
               }
           }
       }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
