package placement_questions;
public class Selection {
    // Function to implement selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        selectionSort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
