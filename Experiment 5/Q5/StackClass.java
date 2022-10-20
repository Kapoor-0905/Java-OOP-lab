/*Write program to create an interface StackInterface having methods push (), pop () and display (). 
StackClass implements StackInterface. Class StackClass contains the main method which is having 
a switch case for selecting the particular operation of the stack.
 */

 import java.util.Scanner;
interface StackInterface{
    public void push(int a);
    public void pop();
    public void display();
}

class StackClass implements StackInterface{
    int[] stack = new int[5];
    int top = -1;
    @Override
    public void push(int a){
        if(top == stack.length-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top] = a;
        }
    }
    @Override
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is "+stack[top]);
            top--;
        }
    }
    @Override
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is: ");
            for(int i=top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        StackClass obj = new StackClass();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element to push: ");
                    int a = sc.nextInt();
                    obj.push(a);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 4);
    }
}