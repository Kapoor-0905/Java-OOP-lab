/*Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program
 */

interface ConstValue{
    public static final int a = 10;
}

class UseConstValue implements ConstValue{
    public void meth1(){
        System.out.println("Value of a is "+a);
    }
    public static void main(String[] args) {
        UseConstValue obj = new UseConstValue();
        obj.meth1();
    }
}   