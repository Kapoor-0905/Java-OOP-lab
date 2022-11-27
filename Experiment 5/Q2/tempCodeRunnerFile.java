
interface A{
    public void meth1();
    public void meth2();
}

class MyClass implements A{
    public void meth1(){
        System.out.println("This is method 1");
    }
    public void meth2(){
        System.out.println("This is method 2");
    }
}