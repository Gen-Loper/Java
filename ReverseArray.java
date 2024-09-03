package Java_C;
import java.util.Scanner;
public class ReverseArray {
        public static int reverse_Array(int numbers[]){
            int first=0;
            int last=numbers.length-1;
            while(first < last){
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;

                first++;
                last--;
            }
            return 0;       
        }

        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            int numbers[] = {2,4,6,8,10};
            reverse_Array(numbers);

            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
}
