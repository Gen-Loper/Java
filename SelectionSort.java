package Java_C;

public class SelectionSort {
        public static void selectionSort(int arr[]) {
            for(int i=0; i<arr.length-1; i++){
                int minPos=i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[minPos] > arr[j]){
                        minPos = i;
                    }
                }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        
        }
        public static void printArray(int arr[]) {
            for(int i=0; i< arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
        
        public static void main(String args[]){
            int arr[] = {5,4,1,3,2};
            selectionSort(arr);
            printArray(arr);
            }
        }
    

