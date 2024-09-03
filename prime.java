import java.util.Scanner;

// import java.util.Scanner;
// public class prime{
//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a Number to Check :");
//         int n = input.nextInt();

//             if( n==2){
//                 System.out.println("Number is Prime");
//             }
//             else{
//                 boolean isPrime = true;
//                 for(int i=2;i<=Math.sqrt(n);i++){
//                     if ( n%i == 0)
//                     isPrime = false;
//                 }
//             if(isPrime ==  true)
//             {
//                 System.out.println("Number is Prime-");
//             }
//             else{
//                 System.err.println("Not a Prime");
//             }
//         }
//     }
// }



/*Optimized Code for finding Prime*/

// public class prime{
//     public static boolean isPrime(int n){
//         boolean prime = true;
//         for ( int i=2; i<=Math.sqrt(n);i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//          System.out.println("Enter a Number to Check :");
//         int n = input.nextInt();

//         System.out.println(isPrime(n));

//     }
// }



/* Finding Prime Number for given Number */

public class prime{

        public static boolean isPrime(int n){
        boolean prime = true;
        for ( int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void Prime_in_Range(int n){
        for( int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to Check :");
        int n = input.nextInt();
        Prime_in_Range(n);
    }
}