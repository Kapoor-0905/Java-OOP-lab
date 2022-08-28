/*7)	Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
213, 231, 312, 321.)
 */

import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three digits");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                for(int k = 1; k<=3; k++){
                    if(i!=j && i!=k && j!=k)
                    System.out.println(i+""+j+""+k);
                }
            }
        }
        input.close();
    }
}