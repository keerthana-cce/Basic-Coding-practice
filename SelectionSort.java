public class SlectionSort {
      public static void selectionsort(int arr[]){
        for(int i = 0;i<arr.length;i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,8,2,1,9,4};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
       selectionsort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        }
}
