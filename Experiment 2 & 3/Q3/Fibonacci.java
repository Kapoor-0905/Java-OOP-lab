/*3)	Write a program to print Fibonacci series using loop. */
import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
