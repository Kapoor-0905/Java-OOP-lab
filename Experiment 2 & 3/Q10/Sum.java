/*10)	Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5. */

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 40; i < 250; i++){
            if(i%5 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
