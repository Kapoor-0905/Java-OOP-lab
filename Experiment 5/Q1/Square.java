/*Write a program to create interface named test. In this interface the member 
function is square. Implement this interface in arithmetic class. Create one new 
class called ToTestInt. In this class use the object of arithmetic class.
 */

interface Test{
    public void square(int a);
}

class Arithmetic implements Test{
    public void square(int a){
        System.out.println("Square of "+a+" is "+(a*a));
    }
}

class Square {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square(5);
    }
}