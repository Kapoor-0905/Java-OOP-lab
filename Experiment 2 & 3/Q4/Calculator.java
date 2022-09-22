public class Calculator {
    public static void add(int n, int m) {
        int result = n + m;
        System.out.println(n + " + " + m + " = " + result); }
    public static void subtract(int n, int m) {
        int result = n - m;
        System.out.println(n + " - " + m + " = " + result);
    }
    public static void multiply(int n, int m) {
        int result = n * m;
        System.out.println(n + " * " + m + " = " + result);
    }
    public static void divide(int n, int m) {
        int result = n / m;
        System.out.println(n + " / " + m + " = " + result);
    }
    public static void concat(int n, int m) {
        String a=String.valueOf(n);
        String b=String.valueOf(m);
        System.out.println(n + " concat " + m + " = " + (a+b));
    }

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        add(n,m);
        subtract(n,m);
        multiply(n,m);
        divide(n,m);
        concat(n,m);
    }
}