/*6) Write a program to accept 10 student's marks in an array, arrange it into ascending order, 
convert into the following grades and print marks and grades in the tabular form. 
- Between 40 and 50 : PASS 
- Between 51 and 75 : MERIT 
- and above : DISTINCTION*/

import java.util.*;
public class Grades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] grades = new int[10];
        for(int i =0 ; i < grades.length; i++){
            grades[i] = input.nextInt();
        }
        Arrays.sort(grades);
        for(int i = 0; i < grades.length; i++){
            if(grades[i]  > 40 && grades[i] <=50){
                System.out.println(grades[i]+" "+":"+" "+"PASS");
            } else if (grades[i]> 51 && grades[i]<75){
                System.out.println(grades[i]+" "+":"+" "+"MERIT");
            } else if(grades[i]> 75 && grades[i]<=100){
                System.out.println(grades[i]+" "+":"+" "+"DISTINCTION");
            } else if(grades[i]<=40){
                System.out.println(grades[i]+" "+":"+" "+"FAIL");
            }
        }
        input.close();
    }
}