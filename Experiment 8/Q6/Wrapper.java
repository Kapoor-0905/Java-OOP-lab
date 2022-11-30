/* Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts Stringto Float converts Float to float. */

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float: ");
        float f = sc.nextFloat();
        Float f1 = new Float(f);
        String s = f1.toString();
        float f2 = Float.parseFloat(s);
        String s1 = Float.toString(f2);
        Float f3 = Float.valueOf(s1);
        float f4 = f3.floatValue();
        System.out.println("Float to float: " + f4);
        System.out.println("Float to String: " + s1);
        System.out.println("String to float: " + f2);
        System.out.println("String to Float: " + f3);
        System.out.println("float to Float: " + f1);
        System.out.println("float to String: " + s);
        sc.close();
    }
}