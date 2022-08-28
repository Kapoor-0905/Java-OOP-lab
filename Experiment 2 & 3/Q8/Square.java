/*8)	Write a Java Program to accept 10 numbers in an array and compute the square of each number. 
Print the sum of these numbers */

import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] square = new int[10];
        for(int i = 0; i < square.length; i++){
            square[i] = input.nextInt();
            System.out.println("Square of "+square[i]+" is "+square[i]*square[i]);
        }
        input.close();
    }
}
