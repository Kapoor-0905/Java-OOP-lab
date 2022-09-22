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