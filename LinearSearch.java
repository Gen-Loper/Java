package Java_C;
import java.util.Scanner;
public class LinearSearch {
    public static int linear_Search(int number[],int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                System.out.println("The Element found at- "+i+ " Key Element is: "+key);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[]={2,4,7,1,6};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Key Value:");
        int key = input.nextInt();
        int index = linear_Search(number, key);
        if(index == -1){
            System.out.println("NOT found");
        }
    }
}

