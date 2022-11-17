/*Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuiltfunction */
import java.util.*;

public class ReadConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str); // Convert string to StringBuffer object to use StringBuffer methods on it 
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') { // Check if character is lowercase  
                sb.setCharAt(i, (char)(sb.charAt(i) - 32)); // Convert lowercase character to uppercase character by subtracting 32 from its ASCII value 
            }
        }
        System.out.println("String in upper case = " + sb);
    }
    
}
