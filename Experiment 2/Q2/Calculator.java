public class Calculator {
    public static void main(String[] args) {
       int x = Integer.parseInt(args[0]);
       String op = args[1];
       int y = Integer.parseInt(args[2]);
       int z;
       if (op.equals("+")) {
           z = x + y;
       } else if (op.equals("-")) {
           z = x - y;
       } else if (op.equals("*")) {
           z = x * y;
       } else if (op.equals("/")) {
           z = x / y;
       } else {
           System.out.println("Invalid operator");
           return;
       }
       System.out.println(x + " " + op + " " + y + " = " + z);
   }
}