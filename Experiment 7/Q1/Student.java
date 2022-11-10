/*Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students.Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program */

public class Student {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Raj", "Ravi", "Ramesh", "Rajesh", "Rakesh", "Rajat", "Rajeev", "Rajkumar", "Rajesh"};
        int[] roll = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("Name: " + names[i] + " -----" + " Roll: " + roll[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error = " + e.getMessage());
        }
    }    
}
