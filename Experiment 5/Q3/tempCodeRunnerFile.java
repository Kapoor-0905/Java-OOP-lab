
interface ConstValue{
    public static final int a = 10;
}

class UseConstValue implements ConstValue{
    public static void main(String[] args) {
        System.out.println("Value of a is "+a);
    }
}   