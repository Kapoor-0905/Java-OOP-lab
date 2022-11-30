/*Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts Stringto Integer converts Integer to int. */

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i = sc.nextInt();
        Integer i1 = new Integer(i);
        String s = i1.toString();
        int i2 = Integer.parseInt(s);
        String s1 = Integer.toString(i2);
        Integer i3 = Integer.valueOf(s1);
        int i4 = i3.intValue();
        System.out.println("Integer to int: " + i4);
        System.out.println("Integer to String: " + s1);
        System.out.println("String to int: " + i2);
        System.out.println("String to Integer: " + i3);
        System.out.println("int to Integer: " + i1);
        System.out.println("int to String: " + s);
        sc.close();
    }
}

