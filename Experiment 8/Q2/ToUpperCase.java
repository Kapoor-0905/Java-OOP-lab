/*Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuiltfunction */
public class ToUpperCase {
    public static void main(String[] args) {
        String str = "ashutosh Kapoor";
        StringBuffer sb = new StringBuffer(str); // Convert string to StringBuffer object to use StringBuffer methods on it 
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') { // Check if character is lowercase  
                sb.setCharAt(i, (char)(sb.charAt(i) - 32)); // Convert lowercase character to uppercase character by subtracting 32 from its ASCII value 
            }
        }
        System.out.println("String in upper case = " + sb);
    }
    
}
