package Java_C;

public class InsertionSort {
        public static void insertionSort(int arr[]) {
            for(int i=1; i<arr.length; i++) {
                int curr = arr[i];
                int prev = i-1;
    
                while(prev >=0 && arr[prev]> arr[curr]) {
                    arr[prev+1] = arr[prev];
                    prev++;
                }
                arr[prev+1] = curr;
            }
        }
        public static void printArray(int arr[]) {
            for(int i=0; i<=arr.length-1; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    
        public static void main(String args[]) {
            int arr[] = {5,4,1,3,2};
            insertionSort(arr);
            printArray(arr);
        }
    }
