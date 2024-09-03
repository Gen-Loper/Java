import java.util.Scanner;

public class factorial {
    public static int Factorial(int n){
        int factorial =1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to Check Factorial:");
        int n =  input.nextInt();

        System.out.println("Factorial = " + Factorial(n)); 
    }
}
