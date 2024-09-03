package Java_C;
import java.util.Scanner;
public class BinarySearch {

        public static int binarySearch(int numbers[],int key){
            int start = 0;
            int end = numbers.length -1;
    
            while(start <= end){
               int mid = (start+end)/2;
    
               if(numbers[mid] == key){
                return mid;
               }
    
               if(numbers[mid] < key){
                start = mid + 1;
               }
               else{
                 end = mid-1;
               }
            }
            return 0;
        }
    
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            int numbers[]={2,4,6,8,10,12,14};
            System.out.println("Enter a Number to Search :");
            int key = input.nextInt();
            int search = binarySearch(numbers, key);
            System.out.println("Index of key Searched is :" +search);
        }
    }

