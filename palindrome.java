import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        System.out.println("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int palindrome=input.nextInt();
        
        if (isPalindrome(palindrome)){
            System.out.println("Number :" + palindrome + " is a palindrome");
        } else{
            System.out.println("Number :" + palindrome +"is not a palindrome");
        }
    }


    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome !=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome /10;
        }
        if(reverse == number){
            return true;
        }
        return false;
    }
}
