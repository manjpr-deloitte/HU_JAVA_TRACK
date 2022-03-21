import java.util.Scanner;
public class Loops_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        int i , j, k;
        for (i= 1; i<= rows ; i++)
        {
            for (j=i; j <rows ;j++)
            {
                System.out.print(" ");
            }
            for (k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i=rows; i>=1; i--)

        {
            for(j=i; j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
