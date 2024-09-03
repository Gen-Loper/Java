package Java_C;

import java.util.Scanner;

public class BinaryToDecimal{
    public static int bin_to_Dec(int binary_Num){
        int pow=0;
        int decimal=0;
        while(binary_Num > 0){
            int lastDigit = binary_Num % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow)); 
            pow++;
            binary_Num = binary_Num/10;
        }  
         return decimal;
    } 

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Binary number:");
        int binary_Num =  input.nextInt();
        bin_to_Dec(binary_Num);
        System.out.print("Dicmal Number is :"+bin_to_Dec(binary_Num));
    }
}