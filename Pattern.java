package Java_C;
import java.util.Scanner;

public class Pattern{
    public static void Hollow_Rect(int totRow,int totCols){
        for(int i=1; i<=totRow; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i==totRow || j==1 || j==totCols)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Row :");
        int totRow = input.nextInt();
        System.out.println("Enter a Columns :");
        int totCols = input.nextInt();

        System.out.println();Hollow_Rect(totRow, totCols);
    }
}
