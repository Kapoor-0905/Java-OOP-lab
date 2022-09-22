/*WAP to Take input as DD MM YYYY(04 08 2021) in command line and calculate number of days since 1 January 1970. */
import java.util.*;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dd = input.nextInt();
        int mm = input.nextInt();
        int yyyy = input.nextInt();
        int days = 0;
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < mm-1; i++){
            days += months[i];
        }
        days += dd;
        int leap = 0;
        for(int i = 1970; i < yyyy; i++){
            if(i%4 == 0){
                leap++;
            }
        }
        days += leap;
        System.out.println("The number of days since 1 January 1970 is: " + days);
        input.close();
    }
}
