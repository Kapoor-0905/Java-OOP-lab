
interface DivModo{
    public void division(int a, int b);
    public void modules(int a, int b);
}   

class DivModClass implements DivModo{
    @Override
    public void division(int a, int b){
        System.out.println("Division of "+a+" and "+b+" is "+(a/b));
    }
    @Override
    public void modules(int a, int b){
        System.out.println("Modules of "+a+" and "+b+" is "+(a%b));
    }
}

public class DivMod {
    public static void main(String[] args) {
        DivModClass obj = new DivModClass();
        obj.division(10, 5);
        obj.modules(10, 5);
    }
}