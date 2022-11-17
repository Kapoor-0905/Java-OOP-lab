/*Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using theappropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in yourname. Print locations of occurrences of ‘a’ .Try the same for different String object */
public class NameObject {
    public static void main(String[] args) {
        String name = "Ashutosh Kapoor";
        System.out.println("Length of name = " + name.length());
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                count++;
                System.out.println("a/A found at index " + i);
            }
        }
        System.out.println("Number of times a appears in name = " + count);
    }
    
}
