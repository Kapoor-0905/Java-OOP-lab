import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=1;i<=t;i+=2){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}