import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < 3; i++){
            array[i] = input.nextInt();
        }
        int largest = array[0];
        for(int i = 0; i < 3; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}