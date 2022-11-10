/*Write a Java program to enable the user to handle any chance of divide by zero exception */

public class Zero {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}