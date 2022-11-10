/*Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command linearguments */

public class Exception {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a % b;
            System.out.println("Result = " + c);
        } catch (NumberFormatException e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
}