package placement_questions;

public class Insertion {
   public static  void insertionsort(int arr[])
   {
    int n= arr.length;
    for(int i=0; i<n; i++)
    {
      int k=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>= k)
      {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=k;
    }
    
   }
        public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(data);

        insertionsort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
