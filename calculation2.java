//for loop
import java.util.Scanner;

public class calculation2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter value of n");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of 1st " + n + " numbers: " + sum);
    }
}