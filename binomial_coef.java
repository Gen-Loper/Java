import java.util.Scanner;

public class binomial_coef{
        public static int Fact(int n){
            int factorial=1;
            for(int i=1; i<=n; i++){
                factorial = factorial*i;
            }
            return factorial;
        }

        public static int binCoef(int n,int r){
            int fact_n = Fact(n);
            int fact_r = Fact(r);
            int fact_nmr = Fact(n-r);
            int binCoef = fact_n/(fact_r*fact_nmr);
            return binCoef;
        }
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter value of n:");
            int n =input.nextInt();
            System.out.println("Factorial of n is :"+Fact(n));
            System.out.println();

            System.out.print("Enter value of r:");
            int r =input.nextInt();
            System.out.println("Factorial of r is :"+Fact(r));
            System.out.println();

            System.out.println("Facorial of (n-r)! is: "+Fact(n-r));
            System.out.println();

            System.out.println("Binomial coefficent is = "+binCoef(n, r));
            
        }
    }