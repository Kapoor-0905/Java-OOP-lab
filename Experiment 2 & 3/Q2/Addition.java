/*2)	Write a program to add two number using command line arguments. */
import java.util.*;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum);
        input.close();
    }
}
